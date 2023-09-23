package TP_Week1;

public class Exerc_1 {

    /**
     * Method that recursively reverses the elements in an array of integers
     *
     * @param a the array of integers to be reversed
     * @param liminf the lower limit of the array index to be processed
     * @param limsup the higher limit of the array index to be processed
     */
    public static void process (Integer a[], int liminf, int limsup) {

        int i=liminf ; int j=limsup-1 ;
        while (i < j) { int temp=a[i] ;
            a[i]=a[j] ;
            a[j]=temp ; i++ ; j-- ; } }

    /**
     * Method that recursively divides the array (after being reversed by the up method) into small portions
     *
     * @param a the array of integers
     * @param li the lower limit index of the array to be considered
     * @param ls the higher limit index of the array to be considered
     */
    public static void example (Integer a[], int li, int ls) {
        if (li < ls) {
            process (a,li,ls); ls=ls/2; example (a,li,ls); } }

}
