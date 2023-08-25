package com.designpattern.creational01_singleton;

public class SingleTonNormalWayExample {
    public static void main(String[] args) {

        SingleTon classSingleton1 = SingleTon.getInstance();
        classSingleton1.setMsg("Please say hello to Ruby");

        System.out.println(classSingleton1.getMsg()); //Initial class info

        SingleTon classSingleton2 = SingleTon.getInstance();
        System.out.println(classSingleton2.getMsg()); //New class info

    }
}

/**
 *
 * SingleTon
 *
 * A private constructor
 * A static field containing its only instance
 * A static factory method for obtaining the instance
 */
final class  SingleTon{
    private static SingleTon INSTANCE;

    public static SingleTon getINSTANCE() {
        return INSTANCE;
    }

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private SingleTon() {
    }
    public static synchronized SingleTon getInstance() {
        if(SingleTon.INSTANCE == null) {
            INSTANCE = new SingleTon();
        }
        return INSTANCE;
    }

}
