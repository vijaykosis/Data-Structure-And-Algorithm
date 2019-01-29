package org.vijaykoshis.ArrayQuestions;

/*
Input : A[] = { 2, 3, 8, -1, 7, 10 }
        Output : -1, 2, 3, 7, 8, 10

        Input : A[] = {-4, 6, 9, -1, 3 }
        Output : -4, -1, 3, 6, 9

*/

public class SortAnArrayWhenTwoHalvesAreSorted {

    // Driver program to test above function 
    static public void main(String[] args) {
        int[] A = {2, 3, 8, 9, -1, 2, 3, 7, 10};
        int n = A.length;
        mergeTwoHalf(A, n);

        // Print sorted Array 
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
    }

    private static void mergeTwoHalf(int[] A, int n) {
        int mid = 0;

        int temp[] = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                mid = i + 1;
                break;
            }
        }
        System.out.println("Mid::" + mid);

        // If Given array is all-ready sorted
        if (mid == 0)
            return;

        int j = mid;

        int i = 0;
        int k = 0;
        while (i < mid && j < n) {
            if (A[i] < A[j]) {
                temp[k++] = A[i++];
            } else
                temp[k++] = A[j++];
        }
        while (i < mid)
            temp[k++] = A[i++];

        // Copy the remaining elements of A[ half_! to n ]
        while (j < n)
            temp[k++] = A[j++];

        for (i = 0; i < n; i++)
            A[i] = temp[i];
    }
}
