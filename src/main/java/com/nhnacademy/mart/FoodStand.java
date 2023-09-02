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
        foods.add(new Food(food.getName(), food.getPrice()));

    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public void delete(Food food) {
        logger.trace("{}",food.getName());
        for (int i = 0; i < foods.size(); i++) {
            if (food.getName() == foods.get(i).getName()) {
                logger.trace("delete  ");
                foods.remove(i);
                break;

            }
        }
//        foods.removeIf(item -> item.equals(food.getName()));
//        foods.remove(0);
    }

    public int amount(Food food){
        int amountCnt =0;
        for(Food food1 : foods){
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
