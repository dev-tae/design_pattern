package main.java.strategyexample;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9};

        Sorter sorter = new Sorter(new QuickSort());
        sorter.sortArray(array);

        array = new int[]{4, 2, 7, 1, 9};
        sorter.setStrategy(new BubbleSort());
        sorter.sortArray(array);
    }
}
