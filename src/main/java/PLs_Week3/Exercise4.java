package PLs_Week3;

public class Exercise4 {
    /**
     * The 'exemplo' method is a recursive function that takes as input :
     * @param a an array of Integers
     * @param n an integer
     * The function recursively divide the array into smaller parts until the n becomes 0 (stop condition)
     * and then it doubles the values of each element in the array for each level of recursion
     */
    public static void exemplo (Integer[] a, int n) {
        int x = n/2;
        if (n > 0){
            exemplo(a,x);
            for (int i=0; i<n; i++)
                a[i] *= 2;
        }
    }

    // a) Analyse the example method and present the result of the method applied to the vector a: 1, 1, 1, 1,
    //1, 1 with the following example invocation (a, a.length).

    // result : a[] = {4,2,2,1,1,1}

    // b) Analyse the algorithm for its temporal complexity, using the Big-Oh notation. Justify.

    /*
    int x = n/2; -> complexity : 1
        if (n > 0){ -> complexity : 1
        exemplo(a,x); -> complexity : log n -> the first call has 'n' elements, the second one 'n/2' the third one 'n/4', until the n becomes 0 or negative
        for (int i=0; i<n; i++) -> complexity : n
            a[i] *= 2; -> complexity : 1
    }*/

    // The overall temporal complexity of the algorithm is O (n log n), that comes from the multiplication of the complexities of the recursive call and of the for loop.
}
