package Controle;

import Modelagem.SortModelagem;

public class SortControle {
    private SortModelagem model;

    public SortControle() {
        this.model = new SortModelagem();
    }

    public void quickSort(int[] array) {
        model.quickSort(array, 0, array.length - 1);
    }

    public void insertionSort(int[] array) {
        model.insertionSort(array);
    }
}