package PLs_Week1;

public class Exerc_1E {

    // To see if a number is palindrome that is, the number is the same when written forwards or backwards (examples: 99, 101, 111, 121, 1221, 21112, 10001, … ).

    public static void main(String[] args) {
        int number1 = 121;
        int number2 = 12345;
        System.out.println(checkIfPalindrome(number1)); // true
        System.out.println(checkIfPalindrome(number2)); // false
    }

    public static boolean checkIfPalindrome(int number) {

        int reversed = reverseNumber(number);

        // Base Case : the number is already reversed.

        if (number < 0) {
            return false;
        }

        // Recursive Step : Verifies if the initial number is equal to the reversed one

        return number == reversed;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return reversed;
    }
}
