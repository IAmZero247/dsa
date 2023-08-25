package com.problems.a009b_rotations_number;

public class BitWiseRotationRight {
    /** left shift
     *  229 ->                           11100101
     *  229>>3       ---> right shift =  00011100
     *  int_bits=8;
     *  229<<(8-3)
     *  229>>5       ---> left shift  =  10100000
     *
     *  229>>3 | 229<<(5) === 00011100
     *                        10100000
     *                        --------
     *                        10111100
     */
    static final int INT_BITS = 8;

    public static void main(String[] args) {
        int n = 229;  //2 byte
        int d = 3;
        int rightRotateResult =rightRotate(n, d);
        System.out.println("rightRotateResult:" +rightRotateResult +", binary:"+ Integer.toBinaryString(rightRotateResult));
    }

    private static int rightRotate(int n, int d) {
        System.out.println("Number:"+ Integer.toBinaryString(n));
        byte right_shifted_by_d = (byte) (n>>d); //we need only one byte as significant or 8 bits.
        byte left_shifted_by_INT_BITS_minus_d = (byte) (n<<(INT_BITS-d)) ;
        System.out.print("rp:"+Integer.toBinaryString(right_shifted_by_d) +",");
        System.out.println("lp:"+Integer.toBinaryString(left_shifted_by_INT_BITS_minus_d));
        byte result =(byte) (right_shifted_by_d|left_shifted_by_INT_BITS_minus_d);
        int discardNeeded = Integer.toBinaryString(result).length();
        if(discardNeeded>INT_BITS){
          String val = Integer.toBinaryString(result).substring(discardNeeded-INT_BITS);
          int n1 = Integer.parseInt(val,2);
          return  n1;
        }else{
          return result;
        }
    }
}
