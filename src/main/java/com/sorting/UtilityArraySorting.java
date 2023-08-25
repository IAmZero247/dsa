package com.sorting;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Random;

public class UtilityArraySorting {


    public static int[] generateArray(int size, int origin ,int bound){
        Random r = new Random();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i] = r.nextInt(origin, bound);
        }
        System.out.println("Generated Array:->" +Arrays.toString(a));
        return a;
    }

    public static int[] generateArray(int size){
        Random r = new Random();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i] = r.nextInt(100);
        }
        System.out.println("Generated Array:->" +Arrays.toString(a));
        return a;
    }

    public static Integer[] generateIntegerArray(int size){
        Random r = new Random();
        Integer[] a = new Integer[size];
        for(int i=0;i<a.length;i++)
        {
            a[i] = (Integer)r.nextInt(100);
        }
        System.out.println("Generated Array:->" +Arrays.toString(a));
        return a;
    }

    public static String[] generateStringArrayWithNames(int size){
        Faker fk = new Faker();
        String[] a = new String[size];
        for(int i=0;i<a.length;i++)
        {
            a[i] = fk.name().firstName();
        }
        System.out.println("Generated Array:->" +Arrays.toString(a));
        return a;
    }
}
