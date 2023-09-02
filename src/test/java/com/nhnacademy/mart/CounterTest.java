package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    @DisplayName("CounterTest pay() Method Test")
    void payTest() {
        Basket basket = new Basket();
        Counter counter = new Counter();
        basket.add(new Food("양파", 1000));
        Assertions.assertEquals(counter.pay(basket), 1000);
    }

    @Test
    @DisplayName("method pay(empty basket) Test ")
    void emptyBasketPayTest(){
        Basket basket = new Basket();
        Counter counter = new Counter();
        Assertions.assertThrows(IllegalArgumentException.class,() ->counter.pay(basket));
    }
}