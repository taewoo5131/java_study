package com.company.practice.adapterPattern;

public class Adapter implements Electronic110V {

    public Electronic220V electronic220V;

    public Adapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        this.electronic220V.connecnt();
    }
}
