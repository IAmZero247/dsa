package com.problems.a004a_sum_of_n;

public class SumOfN {
    /**
     * 1 loop
     * 2. recursion
     * 3. math formula
     */

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum1(n));
        System.out.println(sum2(n));
        System.out.println(sum3(n));

    }

    public static Integer sum1(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static Integer sum2(int n){
        if (n==0){
            return 0;
        }
        return n+sum2(n-1);
    }

    public static Integer sum3(int n){
        return n*(n+1)/2;
    }
}
