package PLs_Week1;

import java.util.Objects;

public class Exerc_2 {
    /**
     * @param actual the labirinth in its actual (marked) form
     * @param y      coordinate y in the labirinth
     * @param x      coordinate x in the labirinth
     * @return the marked labirinth or null if there is no way
     */
    public static int[][] check(int[][] actual, int y, int x) {

        // If (x,y) isn´t a valid position, we should return null

        if(!validPosition(actual, y,x)){
            return null;
        }

        // the cell is valid
        actual[y][x] = 9;

        // verifies if the cell was the last one
        if(y == actual.length-1 && x == actual[0].length -1){
            return actual;
        }

        // check north

        int[][] path = check(actual, y-1, x);

        // Verifies if the end was reached

        if(path != null){
            return actual;
        }

        // check east

        path = check(actual, y, x+1);

        // Verifies if the end was reached

        if(path != null){
            return actual;
        }

        // check south

        path = check(actual, y+1, x);

        // Verifies if the end was reached

        if(path != null){
            return actual;
        }

        // check west

        path = check(actual, y, x+1);

        // Verifies if the end was reached

        if(path != null){
            return actual;
        }

        // If none of the cells checked is possible, the actual position should be marked with 2.

        actual[y][x] = 2;

        return check(actual,y+1,x+1);
    }

    /**
     * Method that verifies if a cell is valid or not (it can be part of the path to the end of labyrinth
     * @param actual the labyrinth
     * @param y coordinate y in the labyrinth
     * @param x coordinate x in the labyrinth
     * @return true if the cell is valid, false if not
     */
    public static boolean validPosition (int[][] actual, int y, int x){
        if(y < 0 || y >= actual.length){
            return false;
        }
        if(x < 0 || x >= actual[y].length){
            return false;
        }
        if(actual[y][x] != 1){
            return false;
        }
        return true;
    }

    public static void main(String[]args){
        int[][] array = {
                {1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        int[][] solution = check(array,0,0);
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
