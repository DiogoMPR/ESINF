package PLs_Week1;

public class Exerc_1C {

    // To calculate the greatest common divisor of two positive integers, for example m.d.c (48,30)=6, using the algorithm of successive divisions.
    public static int greatestCommonDivisor (int m, int n){

        // Base case : the number n is zero, so that the GCD between them is the number m

        if(n == 0){
            return m;
        }

        // recursive step : Calculate GCD recursively by passing n (division between m and n) as the new second number.

        return greatestCommonDivisor(n, m%n);
    }
    public static void main (String[]args){
        int m = 48;
        int n = 30;
        int gcd = greatestCommonDivisor(m, n);
        System.out.println(gcd); // 6
    }
}
