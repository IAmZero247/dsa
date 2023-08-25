package com.designpattern.creational01_singleton;

public class SingleTonEnumExample {
    public static void main(String[] args) {
        SingleTonEnum obj1 = SingleTonEnum.INSTANCE.getInstance();
        obj1.setMsg("Please say hello to Ruby");
        SingleTonEnum obj2 = SingleTonEnum.INSTANCE.getInstance();
        System.out.println(obj1.getMsg());
        System.out.println(obj2.getMsg());

    }
}


/**
 * This approach has serialization and thread-safety guaranteed by the enum implementation itself, which ensures internally that only the single instance is available,
 */
enum SingleTonEnum{

    INSTANCE("");

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private SingleTonEnum(String msg) {
        this.msg = msg;
    }

    public SingleTonEnum getInstance() {
        return INSTANCE;
    }

}
