package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);
    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;
    private int money = 2_0000;

    public Customer(BuyList buyList) {
//        logger.trace("Customer 생성자 생성");

        this.buyList = buyList;
    }

    // 돈을 초과하는 상품 구매 test하기 위한 생성자

    public Customer(BuyList buyList, int money){

        this.buyList = buyList;
        this.money = money;
    }
    public BuyList getBuyList() {
        return buyList;
    }

    public Basket getBasket() {
        return basket;
    }

    public int getMoney() {
        return money;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
//

        for (int i = 0; i < buyList.getItems().size(); i++) {
            for (int j = 0; j < buyList.getItems().get(i).getAmount(); j++) {
                logger.trace("{},{}", buyList.getItems().get(i).getName(), foodStand.getFoods().get(j).getName());
                if (buyList.getItems().get(i).getName().equals(foodStand.getFoods().get(i).getName()) ){
                    basket.add(new Food(String.valueOf(buyList.getItems().get(i).getName()), foodStand.getFoods().get(i).getPrice()));
                    logger.trace("trace  log = {}", foodStand.getFoods().get(i).getName());
                    foodStand.delete(foodStand.getFoods().get(i));

                }
            }
        }

    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {

        int result = counter.pay(basket);

        if (this.money - result < 0) {
            throw new IllegalArgumentException("보유한 돈을 초과하였습니다.");
        }
        System.out.println("총 가격은 " + result + "원 입니다.");
        System.out.println("고객님 결제 후 잔액 :" + (this.money - result));
    }

}
