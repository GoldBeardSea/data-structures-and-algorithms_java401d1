public class MergeSort {
    int[] array;
    int[] tempArray;
    int length;

    public int[] sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempArray = new int[length];

        sortMerge(0, length - 1);
        return inputArr;
    }

    private void sortMerge(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            sortMerge(lowerIndex, middle);
            sortMerge(middle + 1, higherIndex);

            merge(lowerIndex, middle, higherIndex);
        }
    }

    private void merge(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int lowerIndexVal = lowerIndex;
        int middleIndexVal = middle + 1;
        int lowerIndexValTwo = lowerIndex;
        while (lowerIndexVal <= middle && middleIndexVal <= higherIndex) {
            if (tempArray[lowerIndexVal] <= tempArray[middleIndexVal]) {
                array[lowerIndexValTwo] = tempArray[lowerIndexVal];
                lowerIndexVal++;
            } else {
                array[lowerIndexValTwo] = tempArray[middleIndexVal];
                middleIndexVal++;
            }
            lowerIndexValTwo++;
        }
        while (lowerIndexVal <= middle) {
            array[lowerIndexValTwo] = tempArray[lowerIndexVal];
            lowerIndexValTwo++;
            lowerIndexVal++;
        }

    }
}