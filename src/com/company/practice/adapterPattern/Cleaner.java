package com.company.practice.adapterPattern;

public class Cleaner implements Electronic220V {
    @Override
    public void connecnt() {
        System.out.println("청소기 220V ON !!!");
    }
}
