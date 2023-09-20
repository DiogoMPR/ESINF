package PLs_Week1;

public class Exerc_1D {

    // To convert a string of digits into the integer it represents. For example, “13531” represents the integer 13531.

    public static int stringToInteger (String string){

        // Base case : The String is empty, we should return 0

        if(string.isEmpty()){
            return 0;
        }

        // Saving the first digit after being converted, is used to extract the integer value of the first digit character in the string

        int firstDigit = Character.getNumericValue(string.charAt(0));

        // Recursively convert the remaining substring and add the first digit

        int remainingValue = stringToInteger(string.substring(1));

        return firstDigit * (int) Math.pow(10, string.length() -1 ) + remainingValue;
    }

    public static void main (String[]args){
        String string = "12345";
        int result = stringToInteger(string);
        System.out.println(result); // 12345
    }
}
