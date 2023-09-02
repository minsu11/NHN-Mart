package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("Customer Constructor Test")
    void customerConstructorTest(){
        BuyList buyList = new BuyList();

        buyList.add("양파 2");
        Customer customer  = new Customer(buyList);
        Assertions.assertEquals("양파",customer.getBuyList().getItems().get(0).getName());
        Assertions.assertEquals(2,customer.getBuyList().getItems().get(0).getAmount());

    }
    @Test
    @DisplayName("Different Customer Constructor Test")
    void differentCustomerConstructorTest(){
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Customer customer  = new Customer(buyList, 1000);
        Assertions.assertEquals("양파",customer.getBuyList().getItems().get(0).getName());
        Assertions.assertEquals(2,customer.getBuyList().getItems().get(0).getAmount());
        Assertions.assertEquals(1000,customer.getMoney());
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