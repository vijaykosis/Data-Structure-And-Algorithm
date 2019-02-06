package org.vijaykoshis.HeapExamples;

import java.util.Arrays;

public class MinHeapExample {

    public static void main(String[] args) {
        int[] arr = {1, 10, 16, 19, 3, 5};
        System.out.println("Before Heap Sort : ");
        System.out.println(Arrays.toString(arr));
        arr = heapSort(arr);
        System.out.println("=====================");
        System.out.println("After Heap Sort : ");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] heapSort(int arr[]) {

        buildHeap(arr);
        return arr;
    }

    private static void buildHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    private static void heapify(int arr[], int i, int length) {

        int min = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left <= length && arr[left] < arr[min])
            min = left;


        if (right <= length && arr[right] < arr[min])
            min = right;

        if (min != i) {
            exchange(arr, i, min);
            heapify(arr, min, length);
        }


    }

    private static void exchange(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[min] = arr[i];
        arr[i] = temp;

    }

}
