import static org.junit.jupiter.api.Assertions.*;

class AdjacentProductTest {

    @org.junit.jupiter.api.Test
    void largestProduct() {
        int [][] array =  {
                { 4, 1, 1 },
                { 1, 1, 1 },
                { 2, 1, 8 },
                { 1, 1, 1}
        };
        int expected = 8;
        int actual = AdjacentProduct.largestProduct(array);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void largestProductTwo() {
        int[][] array = {
                {4, 1, 1, 2},
                {1, 1, 1, 2},
                {2, 1, 8, 4},
                {1, 1, 1, 2},
                {2, 2, 2, 2}
        };
        int expected = 32;
        int actual = AdjacentProduct.largestProduct(array);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void largestProductThree() {
        int[][] array = {
                {4, 1, 1, 2, 4, 1, 1, 2, 4, 1, 1, 2},
                {1, 1, 1, 2, 4, 1, 1, 2, 4, 1, 1, 2},
                {2, 1, 8, 4, 4, 1, 1, 2, 4, 1, 1, 2},
                {1, 1, 1, 2, 4, 1, 1, 2, 4, 1, 1, 2},
                {2, 2, 2, 2, 4, 1, 1, 2, 4, 1, 1, 2},
                {2, 1, 8, 4, 4, 1, 1, 2, 4, 1, 1, 2},
                {2, 1, 8, 4, 4, 1, 1, 2, 4, 1, 1, 2},
                {2, 1, 8, 4, 4, 1, 1, 2, 4, 1, 1, 2},
        };
        int expected = 64;
        int actual = AdjacentProduct.largestProduct(array);
        assertEquals(expected, actual);
    }


}