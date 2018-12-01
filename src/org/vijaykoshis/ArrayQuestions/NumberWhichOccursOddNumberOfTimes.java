package org.vijaykoshis.ArrayQuestions;

public class NumberWhichOccursOddNumberOfTimes
{

    public static void main(String[] args)
    {
        int arr[] = { 2, 5, 9, 1, 5, 1, 8, 2, 8 };
        FindNumberWhichOccursOddNumberOfTimes(arr, arr.length);
    }

    private static void FindNumberWhichOccursOddNumberOfTimes(int[] arr, int length)
    {
        int res = 0;
        for (int i = 0; i < length; i++)
        {

            res = res ^ arr[i];
        }

        System.out.println("Number Which Occurs Odd Number Of Times ::" + res);
    }

}
