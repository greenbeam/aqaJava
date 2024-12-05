package Refactoring.Sorter;

public class Sorter {
    private SortAlgorithm algorithm;

    public Sorter(SortAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] array) {
        algorithm.sort(array);
    }
}
