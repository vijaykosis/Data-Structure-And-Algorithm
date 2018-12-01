package org.vijaykoshis.ArrayQuestions;

public class FirstDuplicateElementInASortedArray
{

    public static void main(String[] args)
    {
        int arr[] = { 1, 5, 5, 6, 6, 7 };

        FindFirstDuplicateElementInASortedArray(arr, arr.length);

    }

    /**
     * @param arr
     * @param length
     */
    private static void FindFirstDuplicateElementInASortedArray(int[] arr, int length)
    {
        // if array is null or size is less  
        // than equal to 0 return 
        if (arr == null || length <= 0)
            return;

        // compare elements and return first 
        // duplicate and its index

        for (int i = 0; i < length - 1; i++)
        {
            if (arr[i] == arr[i + 1])
            {
                System.out.println("First index:" + i);
                System.out.println("First duplicate item: "
                        + arr[i]);
                break;
            }

        }

    }

}
