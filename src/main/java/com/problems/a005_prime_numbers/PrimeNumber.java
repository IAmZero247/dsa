package com.problems.a005_prime_numbers;

public class PrimeNumber {
    /**
     * No should be Greater then 1
     *
     * 2 --> 1 , 2 --> True
     * 3 --> 1 , 3 --> True
     * 4 --> 1 , 2, 4 --> False
     *
     *
     * 1. exactly 2 factors (1 and number itself)
     *
     */

    public static boolean forLoopPrimeLogic(int number){
        int factor =0;
        for(int i=1 ; i<=number; i++){
            if(number%i==0){
                factor++;
            }
        }
        return factor==2;
    }

    public static boolean forLoopPrimeLogicOptimised(int number){
        // this code will break out as soon as non prime is identified.
        // iteration minimised
        for(int i=2 ; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean recursionPrimeLogicOptimised(int number, int half_of_number){
        // factor start from half or below
        if(half_of_number==1){
            return true;
        }
        if(number % half_of_number==0){
            return  false;
        }
        return recursionPrimeLogicOptimised(number , half_of_number-1);
    }





    public static void main(String[] args) {
        System.out.println(PrimeNumber.forLoopPrimeLogic(3));
        System.out.println(PrimeNumber.forLoopPrimeLogic(10));
        /**********************************************************/
        System.out.println(PrimeNumber.forLoopPrimeLogicOptimised(10));
        /**********************************************************/
        System.out.println(PrimeNumber.recursionPrimeLogicOptimised(7, 7/2));
        System.out.println(PrimeNumber.recursionPrimeLogicOptimised(10, 10/2));


    }
}
