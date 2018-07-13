public class AdjacentProduct {
    public static void main(String[] args) {
    int [][] array =  {
            { 1, 2, 1 },
            { 2, 4, 2 },
            { 3, 6, 8 },
            { 7, 8, 1}
            };
    int result = largestProduct(array);
    System.out.println(result);
    }
    public static int largestProduct(int[][] array) {
        int highestVal = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++){
                int xx = checkEveryCell(array, row, col);
                if(xx > highestVal)
                    highestVal = xx;
            }
        }
        return highestVal;
    }

    private static int checkEveryCell(int[][] array, int row, int col) {
        int cell = array[row][col];
        int max = 0;

        if ((col + 1) < array[row].length) {
            max = Math.max(max, cell * array[row][col + 1]);
        }
        if ((col +1) < array[row].length && (row + 1) < array.length) {
            max = Math.max(max, cell * array[row + 1][col + 1]);
        }
        if ((row + 1) < array.length) {
            max = Math.max(max, cell * array[row + 1][col]);
        }
        if ((row +1) <array.length && (col -1) > 0) {
            max =  Math.max(max, cell * array[row + 1][col - 1]);
        }
        return max;

    }
}

