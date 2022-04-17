package com.company.OOP.객체지향의_사실과_오해.커피공화국.serviceImpl;

import com.company.OOP.객체지향의_사실과_오해.커피공화국.service.Guest;

public class GuestImpl implements Guest {

    @Override
    public void sendMoney(int money) {
        System.out.println("손님이 " + money + " 원을 지불했습니다.");
    }

    @Override
    public void orderCoffee(String coffee) {
        System.out.println("손님이  " + coffee + " 를 주문했습니다.");
    }

    @Override
    public void receiveCoffee(String coffee) {
        System.out.println("손님이 " + coffee + " 를 받았습니다.");
    }
}
