package PLs_Week3;

public class Exercise1Extra {
    /**
     * This method reverses a portion of an Integer array recursively. It takes:
     *
     * @param a An array of Integers
     * @param li The starting index of the portion to be reversed (inclusive)
     * @param ls The ending index of the portion to be reversed (exclusive)
     * The function swaps elements in the specified portion of the array, effectively reversing that portion.
     */
    public static void complexity (Integer a[], int li, int ls) {

        if (li < ls) {
            int i=li ;
            int j=ls-1 ;
            while (i < j) {
                int temp=a[i] ;
                a[i]=a[j] ;
                a[j]=temp ;
                i++ ;
                j-- ;
            }
            ls=ls/2;
            complexity (a,li,ls);
        }
    }

    // a) Analyse the algorithm for its temporal complexity, using the Big-Oh notation. Justify.

    /*

    if (li < ls) { -> complexity : 1
        int i=li ; -> complexity : 1
        int j=ls-1 ; -> complexity : 1
        while (i < j) { -> complexity : (ls - li)/2
            int temp=a[i] ; -> complexity : 1
            a[i]=a[j] ; -> complexity : 1
            a[j]=temp ; -> complexity : 1
            i++ ; -> complexity : 1
            j-- ; -> complexity : 1
        }
        ls=ls/2; -> complexity : 1
        complexity (a,li,ls); -> complexity : log n
    }

     */

    // The overall temporal complexity for this algorithm is given by the multiplication of the complexity time in the while loop and in the recursive call :
    // O (log n * ((ls - li)/2))
}
