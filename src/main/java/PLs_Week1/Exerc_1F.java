package PLs_Week1;

public class Exerc_1F {

    // To compute the sum of all the elements in an n × n (two-dimensional) array of integers.

    public static void main (String[] args){
        int[][] array1 = {{1, 1}, {1, 1}};
        int result1 = sumAllElements(array1);
        System.out.println(result1); // 4

        System.out.println();

        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result2 = sumAllElements(array2);
        System.out.println(result2); // 45
     }

     public static int sumOfElements (int[][] array, int row, int column){

        // Base Case : the end of the array is reached

         if(row == array.length){
             return 0;

             // When we reach the end of a column, we should move to the next row

         } else if (column == array[row].length) {
             return sumOfElements(array, row + 1, 0);
         } else{

             // Recursive step : Sum the current element and recursively sum the rest of the elements

             int currentElement = array[row][column];
             return currentElement + sumOfElements(array, row, column + 1);
         }
     }
     public static int sumAllElements (int[][] array){
        return sumOfElements(array, 0,0);
     }
}
