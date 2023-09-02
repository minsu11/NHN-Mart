package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    @DisplayName("Basket add() Method Test")
    void add() {
        Basket basket = new Basket();
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("양파", 1000));
        basket.add(new Food("양파", 1000));
        Assertions.assertEquals(basket.getFoods().get(0).toString(),foods.get(0).toString());

    }
}