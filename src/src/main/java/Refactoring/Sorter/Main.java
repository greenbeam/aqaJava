package Refactoring.Sorter;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1};

        Sorter bubbleSorter = new Sorter(new BubbleSort());
        bubbleSorter.sort(array);

        Sorter mergeSorter = new Sorter(new MergeSort());
        mergeSorter.sort(array);

        Sorter quickSorter = new Sorter(new QuickSort());
        quickSorter.sort(array);
    }
}
