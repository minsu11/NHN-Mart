package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart(); // nhn 마트 클래스 객체 생성
        mart.prepareMart(); // mart.prepareMart() 메소드 실행
        // prepareMart -> fillFoodStand method 실행, 매장의 물건 갯수 세팅

        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer parkMinsu = new Customer(buyList);

        // 장바구니를 챙긴다.
        parkMinsu.bring(mart.provideBasket());
        //System.out.println(parkMinsu.getBuyList());

        // 식품을 담는다.
        parkMinsu.pickFoods(mart.getFoodStand());
        System.out.println(parkMinsu.getBasket().toString());
        System.out.println(mart.getFoodStand());
        // 카운터에서 계산한다.
        parkMinsu.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {

        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        BuyList buyList = new BuyList();
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.\n");
        buyList.add(str);

        return buyList;
    }
}
