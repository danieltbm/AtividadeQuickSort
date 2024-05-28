package Modelagem;

public class SortModelagem {

    // QuickSort
    public void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(array, inicio, fim);
            quickSort(array, inicio, posicaoPivo - 1);
            quickSort(array, posicaoPivo + 1, fim);
        }
    }

    private int separar(int[] array, int inicio, int fim) {
        int pivo = array[inicio];
        int i = inicio + 1;
        int f = fim;

        while (i <= f) {
            if (array[i] <= pivo) {
                i++;
            } else if (array[f] > pivo) {
                f--;
            } else {
                int troca = array[i];
                array[i] = array[f];
                array[f] = troca;
                i++;
                f--;
            }
        }

        array[inicio] = array[f];
        array[f] = pivo;

        return f;
    }

    // InsertionSort
    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;
        }
    }
}