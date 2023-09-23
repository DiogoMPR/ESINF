package TP_Week1;

public class Exerc_2B {

    // b) Convert a decimal integer n to a binary representation.

    public static void main(String[]args){
        int n = 24;
        String binary = convertDecimalToBinary(n); // 11000
        System.out.println(binary);
    }

    public static String convertDecimalToBinary (int n){

        // Base Case : the remainder value of the division of n per 2, is lower than 2

        if(n < 2){
            return Integer.toString(n);
        }

        // Recursive step : add the quotient converted to the remainder until the base case is reached

        int quotient = n/2;
        int remainder = n%2;

        return convertDecimalToBinary(quotient) + Integer.toString(remainder);
    }
}
