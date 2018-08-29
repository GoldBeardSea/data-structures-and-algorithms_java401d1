package main.java;

public class SelectionSort {

    public static double[] selectionSort(double[] array){
        long start = System.currentTimeMillis();
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int currentIndex = i;
            for (int comparingIndex = i + 1; comparingIndex < array.length; comparingIndex++)
                if (array[comparingIndex] < array[currentIndex])
                    currentIndex = comparingIndex;
            double evaluatingInteger = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = evaluatingInteger;
        }
        long deltatime = System.currentTimeMillis() - start;
        System.out.println(deltatime);
        return array;
    }
}
