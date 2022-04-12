package com.company.practice.adapterPattern;

public class AirConditioner implements Electronic220V {
    @Override
    public void connecnt() {
        System.out.println("에어컨 220V ON !!");
    }
}
