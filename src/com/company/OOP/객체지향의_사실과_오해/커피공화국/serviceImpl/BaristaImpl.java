package com.company.OOP.객체지향의_사실과_오해.커피공화국.serviceImpl;

import com.company.OOP.객체지향의_사실과_오해.커피공화국.service.Barista;

public class BaristaImpl implements Barista , Runnable{

    String coffee;

    public BaristaImpl(){}
    public BaristaImpl(String coffee) {
        this.coffee = coffee;
    }

    @Override
    public void sendCoffee(String coffee) {
        System.out.println("바리스타가 " + coffee + " 를 만들어달라고 요청을 받습니다.");
    }

    @Override
    public void makeCoffee(String coffee) {
        System.out.println("바리스타가 " + coffee + " 를 만들고 있습니다.");
    }

    @Override
    public String finishCoffee(String coffee) {
        System.out.println("바리스타가 " + coffee + " 를 다 만들었습니다.");
        return coffee;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeCoffee(this.coffee);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        finishCoffee(this.coffee);
    }
}
