package com.sorting;

import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class A002_ArraySortMethod {
    /**
     * case 1: sorting primitive elements in asc order
     * case 2: sorting primitive elements in asc order with given range
     * case 3: sorting Integer objects in asc order
     * case 4: sorting Integer objects in desc order
     * case 5: sorting String objects in asc order
     * case 6: sorting String objects in desc order
     * case 7: sorting student objects in asc order based on id
     * case 8: sorting student objects in desc order based on id
     * case 9: sorting student objects in asc order based on name
     * case 10: sorting student objects in desc order based on name
     * case 11: sorting student objects in asc order based on percentage
     * case 12: sorting student objects in desc order based on percentage
     * @param args
     */
    public static void main(String[] args) {
    case1method();
    case2method();
    case3method();
    case4method();
    case5method();
    case6method();
    getStudentArr(10);
    caseStudentByIdAscMethod();
    caseStudentByIdDescMethod();
    caseStudentByNameAscMethod();
    caseStudentByNameDescMethod();
    caseStudentByPercentAscMethod();
    caseStudentByPercentDescMethod();
    }

    public static void case1method(){
        int [] arr = UtilityArraySorting.generateArray(15);
        Arrays.sort(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }
    public static void case2method(){
        int [] arr = UtilityArraySorting.generateArray(15);
        int start =5;
        int end=10;
        Arrays.sort(arr,5,10);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void case3method(){
        Integer [] arr = UtilityArraySorting.generateIntegerArray(15);
        Arrays.sort(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void case4method(){
        Integer [] arr = UtilityArraySorting.generateIntegerArray(15);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void case5method(){
        String [] arr = UtilityArraySorting.generateStringArrayWithNames(10);
        Arrays.sort(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void case6method(){
        String [] arr = UtilityArraySorting.generateStringArrayWithNames(10);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void caseStudentByIdAscMethod(){
        Student[] arr =getStudentArr(6);
        Arrays.sort(arr, (a,b) -> (a.id- b.id) );
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void caseStudentByIdDescMethod(){
        Student[] arr =getStudentArr(6);
        Arrays.sort(arr, (a,b) -> -(a.id- b.id) );
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void caseStudentByNameAscMethod(){
        Student[] arr =getStudentArr(6);
        Arrays.sort(arr, new SortByNameAsc() );
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }
    public static void caseStudentByNameDescMethod(){
        Student[] arr =getStudentArr(6);
        Arrays.sort(arr, new SortByNameDesc());
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void caseStudentByPercentAscMethod(){
        Student[] arr =getStudentArr(6);
        Arrays.sort(arr, new SortByPercentAsc() );
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }
    public static void caseStudentByPercentDescMethod(){
        Student[] arr =getStudentArr(6);
        Arrays.sort(arr, new SortByPercentDesc());
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }




    static class Student{
        int id;
        String name;
        double percentage;
        Student(int id,String name,double percentage){
            this.id = id;
            this.name = name;
            this.percentage = percentage;
        }
        public String toString() {
            return "("+this.id+", "+this.name+", "+this.percentage+" )";
        }
    }

    static class SortByIdAsc implements Comparator<Student> {
        public int compare(Student s1,Student s2){
            return (s1.id - s2.id);
        }
    }

    static class SortByIdDesc implements Comparator<Student> {
        public int compare(Student s1,Student s2){
            return (s1.id - s2.id);
        }
    }
    static class SortByNameAsc implements Comparator<Student> {
        public int compare(Student s1,Student s2){
            return -(s1.name).compareTo(s2.name);
        }
    }

    static class SortByNameDesc implements Comparator<Student> {
        public int compare(Student s1,Student s2){
            return -(s1.name).compareTo(s2.name);
        }
    }

    static class SortByPercentAsc implements Comparator<Student> {
        public int compare(Student s1,Student s2){
            return (s1.percentage - s2.percentage)>0?1:-1;
        }
    }
    static class SortByPercentDesc implements Comparator<Student> {
        public int compare(Student s1,Student s2){
            return -(s1.percentage - s2.percentage)>0?1:-1;
        }
    }

    public static Student[] getStudentArr(int size){
        Random r = new Random();
        Faker fk = new Faker();
        Student[] arr = new Student[size];
        for (int i=0; i<size; i++){
            BigDecimal bd = new BigDecimal(r.nextDouble(25,95)).setScale(2, RoundingMode.HALF_UP);
            Student s = new Student(100+i, fk.name().firstName() ,bd.doubleValue());
            arr[i]=s;
        }
        System.out.println("Generated Array:->" +Arrays.toString(arr));
        return arr;
    }
}
