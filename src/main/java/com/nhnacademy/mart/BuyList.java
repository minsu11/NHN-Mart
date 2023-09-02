package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyList {
    @Override
    public String toString() {
        return "BuyList{" +
                "items=" + items +
                '}';
    }


    public ArrayList<Item> getItems() {
        return items;
    }

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    // 구매할 물품을 작성 할 때
    public void add(String str){
        String[] list = str.split(" ");
        // 빈 값을 넣은 경우
        if(str.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("빈 값을 넣었습니다.");
        }

        for (int i = 0; i < list.length; i+=2){
            int idx = i %2 == 0? i:i+1;
            int num = Integer.valueOf(list[idx+1]);
            items.add(new Item(list[idx], num));
        }

    }

    public static class Item {
        private final String name;

        private final int amount;
        public Item(String name, int amount){
            this.name = name;
            this.amount = amount;
        }


        public int getAmount() {
            return amount;
        }
        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }

        public String getName() {
            return name;
        }
    }
}
