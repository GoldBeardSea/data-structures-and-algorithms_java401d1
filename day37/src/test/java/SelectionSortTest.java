//package test.java;
//
//import main.java.MergeSort;
//import main.java.SelectionSort;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SelectionSortTest {
//
//    @Test
//    void selectionSort() {
//
//    }
//
//    @Test
//    void sort() {
//        int[] testArrayPrime = {34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
//        MergeSort testArray = new MergeSort();
//        int [] testArraySorted = testArray.sort(testArrayPrime);
//        for (int integers : testArraySorted) {
//            System.out.print(integers);
//            System.out.print(", ");
//        }
//        int [] expected = {-9, 0, 19, 34, 42, 77, 2005, 2018, 2099};
//
//        int [] actual = SelectionSort.selectionSort(testArrayPrime);
//        assertEquals(expected[1], actual[1]);
//        assertEquals(testArrayPrime[7], actual[7]);
//
//    }
//
//    @Test
//    void sortEmpty() {
//        int[] testArray = {};
//        MergeSort testArrayMerge = new MergeSort();
//        int [] testArraySorted = testArrayMerge.sort(testArray);
////        assertTrue(testArraySorted.length == 0);
//        int [] actual = SelectionSort.selectionSort(testArray);
//        assertTrue(actual.length == 0);
//    }
//
//    @Test
//    void sortNegatives() {
//        int[] testArray = {-10, -15, -25, -100, -190, -125, -255, -2550, -2555};
//        MergeSort testArrayMerge = new MergeSort();
//        int [] testArraySorted = testArrayMerge.sort(testArray);
//        int [] expected = {-2555, -2550, -255, -190, -125, -100, -25, -15, -10};
//        assertEquals(expected[0], testArraySorted[0]);
//        assertEquals(expected[5], testArraySorted[5]);
//        int [] actual = SelectionSort.selectionSort(testArray);
//        assertEquals(expected[0], actual[0]);
//        assertEquals(expected[0], actual[0]);
//
//    }
//}