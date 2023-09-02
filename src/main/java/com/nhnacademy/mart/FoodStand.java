package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodStand {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    private final ArrayList<Food> foods = new ArrayList<>();

    // TODO add 메서드 구현
    public void add(Food food) {
        foods.add(food);

    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public void delete(Food food) {
        // logger.trace("{}",food.getName());
        boolean deleteCheck = false;
        boolean nameCheck = false;
        // 이름은 같지만 가격이 다른 경우도 있을거라고 생각해서 조건문을 더 추가하였음
        for (int i = 0; i < foods.size(); i++) {
            nameCheck = food.getName() == foods.get(i).getName() ? true : false;
            deleteCheck = food.getPrice() == foods.get(i).getPrice() ? nameCheck : false;

            if (deleteCheck == true) {
                foods.remove(i);
                logger.trace("delete check");
                break;
            }
        }
        // 이름과 가격이 서로 동일하지 않은 경우
        if (deleteCheck == false && nameCheck == false) {
            throw new IllegalArgumentException("상품이 진열대에 없습니다.");
        } else if (nameCheck == true && deleteCheck == false) { // 이름은 같지만 가격이 다른 경우
            throw new IllegalArgumentException("상품과 가격이 서로 맞지 않습니다.");
        }

    }

    public int amount(Food food) {
        int amountCnt = 0;
        for (Food food1 : foods) {
            amountCnt++;
        }
        return amountCnt;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    @Override
    public String toString() {
        return "FoodStand{" +
                "foods=" + foods +
                '}';
    }
}
