package com.company.OOP.객체지향의_사실과_오해.커피공화국;

import com.company.OOP.객체지향의_사실과_오해.커피공화국.service.Barista;
import com.company.OOP.객체지향의_사실과_오해.커피공화국.serviceImpl.BaristaImpl;
import com.company.OOP.객체지향의_사실과_오해.커피공화국.serviceImpl.CasherImpl;
import com.company.OOP.객체지향의_사실과_오해.커피공화국.serviceImpl.GuestImpl;

public class CoffeeShop{

    public static void main(String[] args) {
        GuestImpl guest = new GuestImpl();
        CasherImpl casher = new CasherImpl();
        BaristaImpl barista = new BaristaImpl();


        String coffee = "아메리카노";
        int money = 5000;
        guest.orderCoffee(coffee);
        casher.requestCoffee(coffee);
        barista.sendCoffee(coffee);
        Thread t = new Thread(new BaristaImpl(coffee));
        t.start();
        guest.sendMoney(money);
        casher.receiveMoney(money);
        try {
            t.join();
            casher.responseCoffee(coffee);
            guest.receiveCoffee(coffee);
        } catch (Exception e) {
            System.out.println("커피숍이 문을 갑자기 닫았습니다.");
        }


    }
}
