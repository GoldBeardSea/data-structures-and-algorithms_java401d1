package main.java;

import java.util.Random;

public class DoubleArray {
    private static double[] doubleArray;
    private static Random random = new Random();
    public static double[] list(int size) {
        doubleArray = new double[size];
        for(int i=0;i<doubleArray.length;i++) {
            doubleArray[i] = random.nextDouble();
        }
        return doubleArray;
    }

    public static double[] clone(double[] array) {
        double[] clone = new double[array.length];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = array[i];
        }
        return clone;
    }

    public static void main(String[] args) {
        double[] testArray = list(10);
        for (double dub: testArray) {
            System.out.println(dub);
        }
        System.out.println("Stop");
        double[] cloned = testArray.clone();
        for (double dub: cloned) {
            System.out.println(dub);
        }
    }
}
