package com.example.abstroct;

/**
 * @author songchao
 * @date 2021/8/18 11:09
 */
abstract class Audi {
    public Audi() {
    }
}


class AudiA6 extends Audi {
    public AudiA6() {
        System.out.println("this is AudiA6");
    }
}

class AudiA8 extends Audi {
    public AudiA8() {
        System.out.println("this is AudiA8");
    }
}

class AudiFactory {
    public Audi create(String type) {
        switch (type) {
            case "AudiA6":
                return new AudiA6();
            case "AudiA8":
                return new AudiA8();
            default:
                System.out.println("没有车型");
                return null;
        }
    }
}
class testP{
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        Audi audiA6 = audiFactory.create("AudiA6");
        Audi AudiA8 = audiFactory.create("AudiA8");
        Audi AudiA10 = audiFactory.create("AudiA10");

    }
}