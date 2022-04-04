package com.company.practice.stack.singleton;

public class Singleton{
    private static Singleton singleton = new Singleton();

    // 생성자 방지
    private Singleton() {};

    // static 인스턴스 생성
    public static Singleton getInstance() {
        // 최초에 null일 경우에만 생성
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
        return singleton;
    }

    @Override
    public void test() {
        System.out.println(Singleton.getInstance());
    }
}

class test{
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
