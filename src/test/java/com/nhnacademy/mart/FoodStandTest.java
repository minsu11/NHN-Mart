package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

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
        foodStand.add(new Food("양파",1000));
        foods.add(new Food("양파", 1000));
        Assertions.assertEquals(foodStand.getFoods().toString(),foods.toString());
    }


    @Test
    void delete() {
    }

    @Test
    void amount() {
    }
}