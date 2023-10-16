package PLs_Week3;

public class Exercise3 {
    public double power (double b, int e){

        if (e == 0)
            return 1;
        if (e == 1)
            return b;
        if (e % 2 == 0)
            return power (b*b, e/2);
        else
            return b*power(b*b, e/2) ;
    }

    // Validate if the method is deterministic or non-deterministic and analyse temporal complexity following Big-Oh notation. Justify.

    // This is a deterministic function method because the same input will always produce the same output.
    // The number of recursive calls depends on the value of 'e'. In the worst case, it takes O(log e) recursive calls to reach the base case (when 'e' is a power of 2).
    // Therefore, the overall time complexity of this function is O(log e) because the number of recursive calls is proportional to the logarithm of 'e'.

}
