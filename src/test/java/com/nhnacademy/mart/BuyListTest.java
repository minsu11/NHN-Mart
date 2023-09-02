package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {

    @Test
    @DisplayName("buyListTest add() Method Test")
    void addTest() {
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Assertions.assertEquals(buyList.getItems().get(0).getName(),"양파");
        Assertions.assertEquals(buyList.getItems().get(0).getAmount(),2);

    }
    @Test
    @DisplayName("buyListTest add() Method Empty Test")
    void emptyAddTest() {
        BuyList buyList = new BuyList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->buyList.add(""));
    }

    @Test
    @DisplayName("buyListTest add() Method Negative Test")
    void negativeAddTest() {
        BuyList buyList = new BuyList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->buyList.add("양파"));
    }

}