package main.java.strategyexample;

import java.util.Arrays;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        bubbleSort(array);
        System.out.println("Sorted Using Bubble Sort: " + Arrays.toString(array));
    }

    private void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
