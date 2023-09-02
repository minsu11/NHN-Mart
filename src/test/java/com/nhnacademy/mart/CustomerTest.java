package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CustomerTest {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

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
    @DisplayName("Money Negative Different Customer Constructor Test")
    void moneyNegativeCustomerConstructorTest(){
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Assertions.assertThrows(IllegalArgumentException.class,()->new Customer(buyList,-1));
    }

    @Test
    @DisplayName("Customer bring() Method Test")
    void bringCustomerTest() {
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Customer customer = new Customer(buyList);
        Basket basket = new Basket();
        basket.add(new Food("양파",1000));
        customer.bring(basket);
        Assertions.assertEquals(basket, customer.getBasket());
    }

    @Test
    @DisplayName("Customer pickFoods Method Test")
    void pickFoodsCustomerTest() {
        FoodStand foodStand = new FoodStand();
        BuyList buyList = new BuyList();

        foodStand.add(new Food("양파", 1000));
        foodStand.add(new Food("양파", 1000));
        foodStand.add(new Food("양파", 1000));
        buyList.add("양파 2");

        Customer customer =new Customer(buyList);
        customer.bring(new Basket());
        customer.pickFoods(foodStand);
        //logger.trace("{},{}",customer.getBasket(),buyList.getItems());
        for(int i =0;i<customer.getBuyList().getItems().size();i++)
            Assertions.assertEquals(customer.getBasket().getFoods().get(i).getName(), buyList.getItems().get(i).getName());
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