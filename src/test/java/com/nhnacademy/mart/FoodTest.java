package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {
    @Test
    @DisplayName("foodConstructorTest")
    void foddConstructorTest(){
        Food food = new Food("양파", 1000);

    }
    @Test
    @DisplayName("foodeConstructor Price Precondition")
    void pricePreconditionFoodConstructorTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()->new Food("양파",-1));
    }

    @Test
    @DisplayName("foodConstructor Name Precondition")
    void namePreconditionFoodstructorTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Food("",1000));
    }


}