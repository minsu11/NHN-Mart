package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
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



        //Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->buyList.add("1 1"));
    }

    @Test
    @DisplayName("buyListTest add() Method Negative Test")
    void parameterNegativeAddTest(){
        BuyList buyList = new BuyList();
        Assertions.assertThrows(NumberFormatException.class,()-> buyList.add("2 양파"));
        Assertions.assertThrows(NumberFormatException.class,()->buyList.add("양파 계란"));
    }

    @Test
    @DisplayName("buyList InnerClass Item Constructor Test")
    void itemConstructorTest(){
        ArrayList<BuyList.Item> items = new ArrayList<>();
        items.add(new BuyList.Item("양파",2));
        Assertions.assertEquals(items.get(0).toString(),new BuyList.Item("양파",2).toString());
    }

    @Test
    @DisplayName("buyList InnerClass Item Negative Constructor Test")
    void negativeItemConstructorTest(){
        ArrayList<BuyList.Item> items = new ArrayList<>();
        BuyList buyList = new BuyList();
        //Item에 값을 넣는 방식들
        Assertions.assertThrows(IllegalArgumentException.class,()->new ArrayList<BuyList.Item>().add(new BuyList.Item("양파",0)));
        Assertions.assertThrows(IllegalArgumentException.class,()-> buyList.add("양파 0"));
        Assertions.assertThrows(IllegalArgumentException.class,()->buyList.add("양파 -1"));

    }
}