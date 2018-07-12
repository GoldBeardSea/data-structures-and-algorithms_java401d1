import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void binarySearchOne() {
        int[] array = {2, 4, 6, 8, 10, 12};
        int key = 10;
        int expected = 4;
        int actual = BinarySearch.binarySearch(array, key);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchTwo() {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 19, 90, 1000, 100000, 200000, 3000000};
        int key = 95;
        int expected = -1;
        int actual = BinarySearch.binarySearch(array, key);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchThree() {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 19, 20, 25, 30, 90, 1000, 100000, 200000, 3000000};
        int key = 3;
        int expected = 2;
        int actual = BinarySearch.binarySearch(array, key);
        assertEquals(expected, actual);
    }


}