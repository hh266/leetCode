package com.company;

public class test017 {
    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int sum = transform(a) + transform(b);
        if(sum == 0) return "0";
        String c = "";
        while(sum > 0){
            c = sum%2 + c;
            sum /= 2;
        }
        return c;
    }

    public static  int transform(String s){
        int val = 0;
        int len = s.length() - 1;
        for(int i = 0; i <= len; i++){
            if(s.charAt(len - i) == '1' ) val += Math.pow(2, i);
        }
        return  val;
    }
}
