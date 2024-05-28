import Controle.SortControle;
import Visão.SortVisao;

public class Main {
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62, 32, 12, 87, 50};

        SortControle controle = new SortControle();
        SortVisao visao = new SortVisao();

        System.out.println("Array antes do QuickSort:");
        visao.printArray(array);

        controle.quickSort(array);

        System.out.println("Array depois do QuickSort:");
        visao.printArray(array);

        int[] array2 = {34, 7, 23, 32, 5, 62, 32, 12, 87, 50};
        
        System.out.println("\n---------------------------");

        System.out.println("\nArray antes do InsertionSort:");
        visao.printArray(array2);

        controle.insertionSort(array2);

        System.out.println("Array depois do InsertionSort:");
        visao.printArray(array2);
    }
}
