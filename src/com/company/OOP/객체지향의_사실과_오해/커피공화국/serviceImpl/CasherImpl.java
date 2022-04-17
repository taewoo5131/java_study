package com.company.OOP.객체지향의_사실과_오해.커피공화국.serviceImpl;

import com.company.OOP.객체지향의_사실과_오해.커피공화국.service.Casher;

public class CasherImpl implements Casher {
    @Override
    public void receiveMoney(int money) {
        System.out.println("캐셔가 " + money + " 원을 받았습니다.");
    }

    @Override
    public void requestCoffee(String coffee) {
        System.out.println("캐셔가 " + coffee + " 를 만들어달라고 요청합니다");
    }

    @Override
    public String responseCoffee(String coffee) {
        System.out.println("캐셔가 " + coffee + " 가 준비되었음을 알립니다.");
        return coffee;
    }
}
