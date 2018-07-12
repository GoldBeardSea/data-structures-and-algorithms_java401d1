public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {4, 8, 15, 16, 23, 42, 90, 100, 10000, 50000};
        int key = 101;
    int testValid = binarySearch(sortedArray,key);
    }
    public static int binarySearch(int[] sortedArray, int key) {
        int start = 0;
        int end = sortedArray.length - 1;
        while (start <= end) {
            int middle = ((start + end) / 2);
            if (sortedArray[middle] > key) {
                end = middle;
                end--;
            } else if (sortedArray[middle] < key) {
                start = middle;
                start++;
            } else {
                return middle;
            }
        }
        return -1;
    }
}