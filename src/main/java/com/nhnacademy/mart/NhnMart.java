package com.nhnacademy.mart;

import java.util.Objects;

public class NhnMart {
    @Override
    public String toString() {
        return "NhnMart{" +
                "foodStand=" + foodStand +
                '}';
    }

    private final FoodStand foodStand = new FoodStand();

    public FoodStand getFoodStand() {
        return foodStand;
    }

    public void prepareMart() {
        fillFoodStand();
    }

    // 음식 세팅
    private void fillFoodStand() {
        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1_000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5_000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2_000));
        }
        // test용 물품 추가
        for (int i =0; i < 5; i++){
            foodStand.add(new Food("장난감", 25_000));
        }
    }

    public Basket provideBasket() {
        return new Basket();
    }

    // 음식 담기

    // 음식 계산
    public  Counter getCounter() {
        return new Counter();
    }
}
