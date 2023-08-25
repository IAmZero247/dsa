package com.designpattern.creational02_prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeExample {
    public static void main(String[] args) {
        Human human1 = new Human("Ruby", "Zero", 30);
        Human human2 = (Human) human1.getClone();
        System.out.println("human! == human2 ?? = " + (human1==human2));

    }

    public static interface Prototype {
        public Prototype getClone();
    }

    public static final class Human implements Prototype{

        private String name;
        private String lastName;
        private int age;

        public Human(){
            System.out.println("********Human Description********");
            System.out.println("----------------------------------");
            System.out.println("Name"+"\t"+"Last Name"+"\t"+"Age");
        }

        public Human(String name, String lastName, int age) {
            this();
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            showHuman();
        }

        private void showHuman(){
            System.out.println(name+"\t"+lastName+"\t\t"+age);
        }

        @Override
        public Prototype getClone() {
            return new Human(name, lastName, age);
        }
    }
}
