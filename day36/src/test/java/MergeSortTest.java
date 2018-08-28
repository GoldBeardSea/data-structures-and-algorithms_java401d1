import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        int[] inputArr = {34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
        MergeSort testArray = new MergeSort();
        int [] testArraySorted = testArray.sort(inputArr);
        for (int integers : testArraySorted) {
            System.out.print(integers);
            System.out.print(", ");
        }
        int [] expected = {-9, 0, 19, 34, 42, 77, 2005, 2018, 2099};

        assertEquals(expected[0], testArraySorted[0]);
        assertEquals(expected[6], testArraySorted[6]);

    }

    @Test
    void sortEmpty() {
        int[] inputArr = {};
        MergeSort testArray = new MergeSort();
        int [] testArraySorted = testArray.sort(inputArr);
        assertTrue(testArraySorted.length == 0);
    }

    @Test
    void sortNegatives() {
        int[] inputArr = {-10, -15, -25, -100, -190, -125, -255, -2550, -2555};
        MergeSort testArray = new MergeSort();
        int [] testArraySorted = testArray.sort(inputArr);
        int [] expected = {-2555, -2550, -255, -190, -125, -100, -25, -15, -10};
        assertEquals(expected[0], testArraySorted[0]);
        assertEquals(expected[5], testArraySorted[5]);
    }
}