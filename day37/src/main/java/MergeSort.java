package main.java;

public class MergeSort {
    double[] array;
    double[] tempArray;
    int length;

    public double[] sort(double inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempArray = new double[length];
        long start = System.currentTimeMillis();

        sortMerge(0, length - 1);
        long deltatime = System.currentTimeMillis() - start;
        System.out.println(deltatime);
        return inputArr;
    }

    public double[] sortMerge(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            sortMerge(lowerIndex, middle);
            sortMerge(middle + 1, higherIndex);

             array = merge(lowerIndex, middle, higherIndex);
        }
        return array;
    }

    public double[] merge(int lowerIndex, int middle, int higherIndex) {

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
        return array;
    }
}