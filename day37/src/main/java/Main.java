package main.java;

public class Main {
    public static void main(String[] args) {
        double[] mergeSortArray = DoubleArray.list(10000);
        double[] selectionSortArray = DoubleArray.clone(mergeSortArray);
        MergeSort sort = new MergeSort();
        sort.sort(mergeSortArray);
        System.out.println("Above is merge sort below is selection sort");
        SelectionSort.selectionSort(selectionSortArray);
        System.out.println("100,000 Test Follows");
        double[] mergeSortArrayMedium = DoubleArray.list(100000);
        double[] selectionSortArrayMedium = DoubleArray.clone(mergeSortArrayMedium);
        MergeSort sortMedium = new MergeSort();
        sortMedium.sort(mergeSortArrayMedium);
        System.out.println("Above is merge sort below is selection sort");
        SelectionSort.selectionSort(selectionSortArrayMedium);
        System.out.println("10,000,000 Test Follows");
        double[] mergeSortArrayLarge = DoubleArray.list(10000000);
        double[] selectionSortArrayLarge = DoubleArray.clone(mergeSortArrayLarge);
        MergeSort sortLarge = new MergeSort();
        sortLarge.sort(mergeSortArrayLarge);
        System.out.println("Above is merge sort below is selection sort");
        SelectionSort.selectionSort(selectionSortArrayLarge);
    }
}
