package com.company.practice.test;

public interface Test {
    String testStr = "test";

    void testMethod();
}

class TestImpl implements Test{
    @Override
    public void testMethod() {
        System.out.println(testStr);
    }

    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        test.testMethod();
    }
}
