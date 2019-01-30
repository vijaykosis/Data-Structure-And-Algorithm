package org.vijaykoshis.HeapExamples;

import java.util.*;

public class HeapSortMain {

    public static void buildheap(int[] arr) {

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length - 1, i);
        }


    }

    public static void heapify(int arr[], int length, int index) {

        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left <= length && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= length && arr[right] > arr[largest]) {
            largest = right;

        }
        if (largest != index) {
            exchange(arr, index, largest);
            heapify(arr, length, largest);
        }


    }

    private static void exchange(int[] arr, int index, int largest) {
        int temp = arr[index];
        arr[index] = arr[largest];
        arr[largest] = temp;
    }


    public static int[] heapSort(int arr[]) {
        buildheap(arr);

        System.out.println("After Heapify : ");
        System.out.println(Arrays.toString(arr));

        int sizeOfHeap = arr.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            exchange(arr, 0, i);
            sizeOfHeap = sizeOfHeap - 1;
            heapify(arr, sizeOfHeap, 0);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 10, 16, 19, 3, 5};
        System.out.println("Before Heap Sort : ");
        System.out.println(Arrays.toString(arr));
        arr = heapSort(arr);
        System.out.println("=====================");
        System.out.println("After Heap Sort : ");
        System.out.println(Arrays.toString(arr));
    }
}