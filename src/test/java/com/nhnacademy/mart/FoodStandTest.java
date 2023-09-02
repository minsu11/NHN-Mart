package com.nhnacademy.mart;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {

    @Test
    @DisplayName("foodStand add() Method Test")
    void addFoodStandTest() {
        FoodStand foodStand = new FoodStand();
        ArrayList<Food> foods = new ArrayList<>();
        foodStand.add(new Food("양파", 1000));
        foods.add(new Food("양파", 1000));
        Assertions.assertEquals(foodStand.getFoods().toString(), foods.toString());
    }


    @Test
    @DisplayName("foodStand delete() Method Test")
    void deleteFoodStandTest() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));
        foodStand.delete(new Food("양파", 1000));
    }

    @Test
    @DisplayName("negative FoodStand delete() Method Test")
    void deleteNegativeFoodStandTest() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));
        Assertions.assertThrows(IllegalArgumentException.class, () -> foodStand.delete(new Food("소금", 1000)));
    }

    // 만약에 이름이 같지만 가격이 다른 상품의 경우 테스트
    @Test
    @DisplayName("same Name Different Price Parameter Delete Test")
    void differentPriceDeleteTest(){
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));
        Assertions.assertThrows(IllegalArgumentException.class,()->foodStand.delete(new Food("양파",200)));
    }
    @Test
    void amount() {
    }
}