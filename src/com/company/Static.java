package com.company;
class Outer{
    int num = 1;
    static int num2 = 10;

    static class Inner{
        public static void test() {
            System.out.println(num2+"@@");
        }
    }
}
public class Static {
    public static void main(String[] args) {
        Outer.Inner.test();
        Cat tiger = new Cat("james");
        System.out.println(tiger.LEG);
        System.out.println(tiger.name);

        Cat lion = new Cat("leo");
        System.out.println(lion.LEG);
        System.out.println(lion.name);

        System.out.println(Cat.LEG);
    }
}

class Cat{
    static int LEG = 0;
    static {
        LEG = 4;
    }
    String name;

    public Cat(String name) {
        this.name = name;
    }
}