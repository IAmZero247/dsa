package com.problems.a009b_rotations_number;


public class BitWiseRotationLeft {
    /*
     * Bit Wise Operator Notes
     * // Signed left shift on 626348975
     * 00100101010101010101001110101111 is   626348975
     * 01001010101010101010011101011110 is  1252697950 after << 1
     * 10010101010101010100111010111100 is -1789571396 after << 2
     * 00101010101010101001110101111000 is   715824504 after << 3
     *
     * // Signed left shift on -552270512
     * 11011111000101010000010101010000 is  -552270512
     * 10111110001010100000101010100000 is -1104541024 after << 1
     * 01111100010101000001010101000000 is  2085885248 after << 2
     * 11111000101010000010101010000000 is  -123196800 after << 3
     *
     * // Signed right shift on 626348975
     * 00100101010101010101001110101111 is   626348975
     * 00010010101010101010100111010111 is   313174487 after >> 1
     * 00001001010101010101010011101011 is   156587243 after >> 2
     * 00000100101010101010101001110101 is    78293621 after >> 3
     *
     * // Signed right shift on -552270512
     * 11011111000101010000010101010000 is  -552270512
     * 11101111100010101000001010101000 is  -276135256 after >> 1
     * 11110111110001010100000101010100 is  -138067628 after >> 2
     * 11111011111000101010000010101010 is   -69033814 after >> 3
     *
     * // Unsigned right shift on 626348975
     * 00100101010101010101001110101111 is   626348975
     * 00010010101010101010100111010111 is   313174487 after >>> 1
     * 00001001010101010101010011101011 is   156587243 after >>> 2
     * 00000100101010101010101001110101 is    78293621 after >>> 3
     *
     * // Unsigned right shift on -552270512
     * 11011111000101010000010101010000 is  -552270512
     * 01101111100010101000001010101000 is  1871348392 after >>> 1
     * 00110111110001010100000101010100 is   935674196 after >>> 2
     * 00011011111000101010000010101010 is   467837098 after >>> 3
     */
    /** left shift
     *  229 ->                           11100101
     *  229<<3       ---> left shift  =  00101000
     *  int_bits=8;
     *  229>>(8-3)
     *  229>>5       ---> right shift = 00000111
     *
     *  229<<3 | 229>>(5) === 00101000
     *                        00000111
     *                        --------
     *                        00101111 =47
     */
    static final int INT_BITS = 8;

    public static void main(String[] args) {
        int n = 229;  //2 byte
        int d = 3;
        byte leftRotateResult =leftRotate(n, d);
        System.out.println("leftRotateResult:" +leftRotateResult +", binary:"+ Integer.toBinaryString(leftRotateResult));
    }

    private static byte leftRotate(int n, int d) {
        System.out.println("Number:"+ Integer.toBinaryString(n));
        byte left_shifted_by_d = (byte) (n<<d); //we need only one byte as significant or 8 bits.
        byte right_shifted_by_INT_BITS_minus_d = (byte) (n>>(INT_BITS-d));
        System.out.print("lp:"+Integer.toBinaryString(left_shifted_by_d) +",");
        System.out.println("rp:"+Integer.toBinaryString(right_shifted_by_INT_BITS_minus_d));
        return (byte) ((byte)left_shifted_by_d|right_shifted_by_INT_BITS_minus_d);
    }

}
