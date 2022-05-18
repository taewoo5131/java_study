package com.company.practice.generic;

/**
 * java generic 클래스
 */
public class GenericClass<T> {
    private T variable;

    public void set(T param) {
        this.variable = param;
    }

    public T get() {
        return this.variable;
    }
}

/**
 * java Object 클래스
 */
class ObjectTest{
    private Object variable;

    public void set(Object param) {
        this.variable = param;
    }

    public Object get() {
        return this.variable;
    }
}

/**
 * Generic 장점1. 잘못된 타입이 들어올 시 컴파일단계에서 체크가능
 */
class GenericAdvantages1<String>{
    private String variable;
    public void set(String param){
        variable = param;
    }

    public String get() {
        return variable;
    }
}

class GenericAdvantages1Test{
    public static void main(String args[]){
        GenericAdvantages1<String> genericAdvantages1 = new GenericAdvantages1<String>();
//        genericAdvantages1.set(10);
        System.out.println(genericAdvantages1.get());
    }
}

/**
 * Generic 장점2. 형변환 필요 X
 */
class Test{
    public static void main(String[] args) {
        /**
         * generic을 이용하면 다운캐스팅 필요 X
         */
        GenericClass<Integer> test1 = new GenericClass<Integer>();
        test1.set(10);
        int getTest1 = test1.get();
        System.out.println(getTest1);

        GenericClass<String> test2 = new GenericClass<String>();
        test2.set("ten");
        String getTest2 = test2.get();
        System.out.println(getTest2);


        System.out.println("---------------------------------");

        /**
         * Object를 이용하면 다운캐스팅 필요 O
         */
        ObjectTest test3 = new ObjectTest();
        test3.set(20);
        int getTest3 = (int)test3.get();
//        Integer getTest3 = (Integer)test3.get(); // test3.get()의 값이 null 이면 Integer로 형변환 해야지 NullPointerException 방지
        System.out.println(getTest3);

        ObjectTest test4 = new ObjectTest();
        test4.set("twenty");
        String getTest4 = (String)test4.get();
        System.out.println(getTest4);
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * generic method
 */
class GenericMethodClass<T>{
    private T variable;

    public void set(T variable) {
        this.variable = variable;
    }

    public T get() {
        return this.variable;
    }

    /**
     * generic method의 선언 방법은 다음과 같다.
     * [접근 제어자] <제네릭타입> [반환타입] [메소드명]([제네릭타입] [파라미터])
     */
    public <T> T genericMethod(T param) {
        return param;
    }
}

class GenericMethodClassTest{
    public static void main(String[] args) {
        // 인스턴스의 제네릭타입은 String
        GenericMethodClass<String> genericMethodClassToString = new GenericMethodClass<String>();
        genericMethodClassToString.set("ABC");
        System.out.println(genericMethodClassToString.get());
        System.out.println(genericMethodClassToString.get().getClass().getName());

        // 인스턴스의 제네릭타입은 String이지만 제네릭메소드의 T타입은 Integer
        System.out.println(genericMethodClassToString.genericMethod(10));
        System.out.println(genericMethodClassToString.genericMethod(10).getClass().getName());
    }
}
