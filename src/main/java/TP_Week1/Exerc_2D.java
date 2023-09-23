package TP_Week1;

public class Exerc_2D {

    // Verify if a word is palindrome. A word, phrase, or other sequence of symbols or elements, whose meaning may be interpreted the same way in either forward or reverse direction: ANA, SOPAPOS.

    public static void main(String []args){
        String word = "Ana";
        if(isPalindrome(word)){
            System.out.printf("A palavra %s é palindrome", word);
        } else {
            System.out.printf("A palavra %s não é palindrome", word);
        }
    }
    public static boolean isPalindrome(String word){
        word = word.replaceAll("\\s", "").toLowerCase();
        return isPalindrome(word, 0, word.length()-1);
    }

    public static boolean isPalindrome (String word, int left, int right){

        // Base Case : If the word has 0 or 1 character is a palindrome

        if(left >= right){
            return true;
        }

        // If the character at the end of the word is different from the first one, the word is not a palindrome

        if(word.charAt(left) != word.charAt(right)){
            return false;
        }

        // Recursive step : Recursively check the next character

        return isPalindrome(word, left+1, right-1);
    }

}
