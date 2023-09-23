package TP_Week1;

public class Exerc_2C {

    // Verify if a positive integer is prime.

    public static void main (String[]args){
        int number = 17; // primo
        if(isPrime(number) == true){
            System.out.printf("O número %d é primo!", number);
        } else {
            System.out.printf("O número %d não é primo", number);
        }
    }

    public static boolean isPrime (int number, int divisor){

        // Base cases

        if(number == 1){
            return false;
        }
        if(divisor == 1){
            return true;
        }

        if(number % divisor == 0){
            return false;
        }

        // Recursive step : check if the number is divisible for the next divisor
        return isPrime(number, divisor-1);
    }

    public static boolean isPrime (int number){

        // Base Case : if the number is 1, we return false

        if(number == 1){
            return false;
        }

        // The number 2 is the first positive prime number

        else if(number == 2){
            return true;
        }

        // Recursive step : verifies if the number is prime, checking the divisibility up to the square root of the number

        int sqrt = (int) Math.sqrt(number);

        return isPrime(number, sqrt);
    }

}
