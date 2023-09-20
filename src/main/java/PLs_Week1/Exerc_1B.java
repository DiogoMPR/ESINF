package PLs_Week1;

public class Exerc_1B {

    // To compute the product of two positive integers, m and n, using only the arithmetic operations: addition and subtraction.

    public static int productOfTwoNumbers (int m, int n){

        // Base case : the number n has the value of 1.

        if(n == 1){
            return m;
        }

        // Recursive step : adding m to m, n-1 times until the base case is reached.

        return m + productOfTwoNumbers(m, n-1);
    }
    public static void main (String[] args){
        int m = 4;
        int n = 3;
        int product = productOfTwoNumbers(m,n);
        System.out.println(product); // 12
    }
}
