package PLs_Week3;

import java.util.HashSet;

public class Exercise1 {

    // a) Explain what the code above do and present the result applied to the vector a[7]={1,13,17,18,22,33,35,38} and mystery2(a,35).

    /**
     * This method iterates over an array of integers, using two for loops:
     *      The first loop iterates over the array
     *      The second loop iterates over all the positions that follows the index attributed to i (first loop)
     * In all positions, we got an if conditions that checks if the sum of the values that are stored in the array in the positions i and j are equal to the value passed by parameter,
     * If the values match, the method prints the positions and the values of the elements
     *
     * @param A an array of integers
     * @param value integer value
     *
     * @return true, if the there are two values in the array, which their sums is equal to the value passed by parameter, false otherwise
     */
    public boolean mystery2 (int[] A, int value)
    {
        boolean flag=false; // complexity : 1
        for (int i = 0; i < (A.length-1); i++) // complexity : n (in the worst case, the loop runs n-1 times)
            for (int j = i+1; j < A.length; j++) // complexity : n (in the worst case, the loop runs n-1 times)
                if (A[i]+A[j] == value) { // complexity : 1
                    flag = true; // complexity : 1
                    System.out.println("pos "+ i +"->"+A[i]+", pos "+j+"->"+A[j]); // complexity : 1
                }
        return flag; // complexity : 1
    }


    // present the result applied to the vector a[7]={1,13,17,18,22,33,35,38} and mystery2(a,35).

    // result : pos 2 -> 13, pos 5 -> 22

    // b) Validate if the mystery method is deterministic or non-deterministic and analyze temporal complexity
    //following Big-Oh notation. Justify.

    // This method is deterministic because the output for the values that are passed by parameters is always the same.
    // Temporal complexity time following the Big-Oh notation is O(n^2), because of the two for loops (complexity n, each one),
    //and because the second one is dependent from the first one, we need to apply this rule : O(f) × O(g) = O (f × g), which results in O (n * n) = O (n^2).

    // c) Propose a more efficient solution.

    /**
     * Checks if there are two elements in the given array that sum up to the specified value.
     *
     * @param A     The input integer array to search for pairs.
     * @param value The target sum value.
     * @return True if a pair of elements is found that sums up to the target value, false otherwise.
     */
    public boolean mystery2EfficientSolution (int[] A, int value){
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int complement = value - A[i];
            if(seenNumbers.contains(complement)){
                System.out.println("pos " + i + "->" + A[i] + ", pos " + findIndex(A, complement) + "->" + complement);
                return true;
            }
            seenNumbers.add(A[i]);
        }
        return false;
    }

    /**
     * Searches for the index of a specified target value within an integer array.
     *
     * @param A      The integer array in which to search for the target value.
     * @param target The value to search for within the array.
     * @return The index of the first occurrence of the target value in the array, or -1 if not found.
     */

    private int findIndex(int[] A, int target){
        for (int i = 0; i < A.length; i++) {
            if(A[i] == target){
                return i;
            }
        }
        return -1; // Not found
    }

    // This method is more efficient because the complexity is only O(n) and it's calculated by the for loop
}
