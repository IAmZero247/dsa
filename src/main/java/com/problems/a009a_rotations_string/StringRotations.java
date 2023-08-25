package com.problems.a009a_rotations_string;

public class StringRotations {
    /*
     * abcdefghijklmnopqrstuvwxyz
     *
     * left by 5
     * fghijklmnopqrstuvwxyz + abcde
     * fghijklmnopqrstuvwxyzabcde
     *
     *
     * right by 5
     * uvxyz + abcdefghijklmnopqrst
     * vwxyzabcdefghijklmnopqrstu
     *
     * right using left by 5
     * 26-5 = 21
     * uvwyz +abcdefghijklmnopqrst
     *
     */
    private static String leftRotate(String s, int d){
        return s.substring(d)+s.substring(0,d);
    }
    private static String rightRotate(String s, int d){
      return s.substring(s.length()-d)+s.substring(0,s.length()-d);
    }
    private static String rightRotateUsingLeft(String s, int d){
        return leftRotate(s,s.length()-d);
    }



    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(leftRotate(s,5));
        System.out.println(rightRotate(s,5));
        System.out.println(rightRotateUsingLeft(s,5));
    }
}
