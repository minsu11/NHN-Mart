package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("Customer Constructor Test")
    void constructorTest(){
        String testStr = "양파 2";
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Customer customer  = new Customer(buyList);
    }


    @Test
    void bring() {

    }

    @Test
    void pickFoods() {
    }

    @Test
    @DisplayName("payTox 실패")
    void payTox() {

    }

    @Test
    @DisplayName("보유한 돈 이상으로 결제")
    void overMoneyPayTox() {

    }
}