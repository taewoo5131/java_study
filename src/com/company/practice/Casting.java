package com.company.practice;

public class Casting {
    public static void main(String[] args) {
        int a = 64;
        char c = (char)a;
        System.out.println(c);

//        Object obj = 123;
//        String s1 = (String) obj;
//        String s2 = String.valueOf(obj);
//        System.out.println(s1);
//        System.out.println(s2);

        short sh = 0;
        int in = sh;

        int in2 = 10;
        short sh2 = (short) in2;
        System.out.println(sh2);

        int in3 = 10;
        long lo = in3;
        System.out.println(lo);

        int in4 = 10;
        Integer integer = in4;
        Object obj = in4;
        int in5 = (int)obj;
        int in6 = integer;
        System.out.println(in6);


        String str = "10";
        String str2 = "10.5";
        String str3 = "true";

        byte b = Byte.parseByte(str);
        int i = Integer.parseInt(str);
        short s = Short.parseShort(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str2);
        double d = Double.parseDouble(str2);
        boolean bool = Boolean.parseBoolean(str3);

        System.out.println("문자열 byte값 변환 : "+b);
        System.out.println("문자열 int값 변환 : "+i);
        System.out.println("문자열 short값 변환 : "+s);
        System.out.println("문자열 long값 변환 : "+l);
        System.out.println("문자열 float값 변환 : "+f);
        System.out.println("문자열 double값 변환 : "+d);
        System.out.println("문자열 boolean값 변환 : "+bool);
    }
}
