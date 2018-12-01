package org.vijaykoshis.ArrayQuestions;

/*
Find the element that occurs only once in a given set of integers while all the other numbers occur thrice.
Example -  
Input : 3 3 3 4
Output: 4

Input : 5 5 4 8 4 5 8 9 4 8
Output: 9
 
 */

public class FindOnlyOnceNumberInArray
{
    static final int NO_OF_CHARS = 256;

    public static void main(String[] args)
    {

        int arr[] = { 5, 5, 4, 8, 4, 5, 8, 9, 4, 8 };

        FindSingleElemntFromDuplicateArraysElement(arr);
    }

    private static void FindSingleElemntFromDuplicateArraysElement(int[] arr)
    {
        int countArray[] = new int[NO_OF_CHARS];

        for (int i = 0; i < arr.length; i++)
        {
            countArray[arr[i]]++;
        }

        for (int i = 0; i < NO_OF_CHARS; i++)
        {

            if (countArray[arr[i]] == 1)
            {
                System.out.println("Single Elemnt From Duplicate Arrays Elements is::" + arr[i]);
                break;
            }
        }

    }

}
