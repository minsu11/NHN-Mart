package com.nhnacademy.mart;

public class Food {

    private final String name;
    private final int price;

    public Food(String name, int price){
        if (price <0){
            throw new IllegalArgumentException("음식의 가격이 잘못 되었습니다.");
        }
        if(name.isEmpty()){
            throw new IllegalArgumentException("음식 이름이 빈칸입니다.");
        }
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
