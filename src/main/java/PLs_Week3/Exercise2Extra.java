package PLs_Week3;

public class Exercise2Extra {
    /**
     * This method takes :
     * @param data An integer array in which the sum is computed
     * @param low The starting index of the range (inclusive)
     * @param high The ending index of the range (inclusive)
     * It computes the sum of the elements in the array from index `low` to index `high`, inclusive. The method uses
     * a divide-and-conquer approach by recursively dividing the array into halves until it reaches the base
     * case where `low` is equal to `high`.
     * @return The sum of the elements in the specified range
     */
    int binarySum (int[ ] data, int low, int high) {
        if (low > high)
            return 0;
        else if (low == high)
            return data[low];
        else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid+1, high);
        }
    }

    // a) Validate if binarySum() method is deterministic or non-deterministic and analyse its temporal
    //complexity following Big-Oh notation. Justify.

    // The binarySum() method is deterministic because it produces the same result for the same input every time it's called.

    /*

    int binarySum (int[ ] data, int low, int high) {
        if (low > high) -> complexity : 1
            return 0; -> complexity : 1
        else if (low == high) -> complexity : 1
            return data[low]; -> complexity
        else { -> complexity : 1
            int mid = (low + high) / 2; -> complexity : 1
            return binarySum(data, low, mid) + binarySum(data, mid+1, high); -> complexity : log n
        }
    }

     */

    // The overall temporal complexity is given the complexity of the recursive call, in other words, O (log n) is the temporal complexity of the method.
}
