package TP_Week1;

public class Exerc_2A {

    // Calculate the sum of two positive integer numbers.

    public static int sumOfTwoNumbers (int m, int n){

        // Base case : the number who is being decreased reaches to 0, the result of the sum will the value of the other number

        if(n == 0)
            return m;

        // Recursive step : increase the m and decrease n, make the sum between them until the base case is reached

        m++; n--;
        return sumOfTwoNumbers(m, n);
    }

    public static void main (String[]args){
        int m = 4;
        int n = 5;
        int soma = sumOfTwoNumbers(m,n); // 9
        System.out.println(soma);
    }
}
