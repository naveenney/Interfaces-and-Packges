package sortingalgorithm;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        int choice = scanner.nextInt();

        Sortable sorter = null;
        switch (choice) {
            case 1:
                sorter = new BubbleSort();
                break;
            case 2:
                sorter = new QuickSort();
                break;
            case 3:
                sorter = new MergeSort();
                break;
            default:
                System.out.println("Invalid choice. Using Bubble Sort by default.");
                sorter = new BubbleSort();
                break;
        }

        sorter.sort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}