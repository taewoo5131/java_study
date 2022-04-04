package com.company.practice.stack.adapterPattern;

public class UseFromJapan {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        // connect(AirConditioner); ERROR !!!
        Adapter adapter = new Adapter(new AirConditioner());
        adapter.powerOn();
    }

    /**
     * 110v 전용 콘센트
     * @param electronic110V
     */
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
