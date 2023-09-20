package PLs_Week1;

public class Exerc_1A {

    // That receives a string and returns another string with its characters in reverse order of the original string

    public static String reverseString(String stringToBeReversed) {

        // Base case : all the characters of the string are already reversed

        if (stringToBeReversed.length() == 1) {
            return stringToBeReversed;
        }

        // Recursive step : Reverse the substring excluding the first character, and then add it at the end.

        return reverseString(stringToBeReversed.substring(1))+ stringToBeReversed.charAt(0);
    }

    public static void main(String[]args){
        String original = "Hi, guys";
        String reversed = reverseString(original);
        System.out.println(reversed); // syug ,iH
    }
}
