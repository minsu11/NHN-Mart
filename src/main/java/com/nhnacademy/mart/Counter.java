package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {

    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public int pay( Basket basket) {
        int result = 0;
        logger.trace("trace {}",basket.getFoods().size());
        if(basket.getFoods().size() ==0){
            throw new IllegalArgumentException("바구니가 비었습니다.");
        }
        for(int i = 0; i<basket.getFoods().size();i++){
           // logger.trace("debug {}",basket.getFoods().size());
            result += basket.getFoods().get(i).getPrice();

        }
        return result;
    }

}
