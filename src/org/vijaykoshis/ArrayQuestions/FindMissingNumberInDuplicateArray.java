package org.vijaykoshis.ArrayQuestions;

public class FindMissingNumberDuplicateElementInTwoArray
{

    static final int NO_OF_CHARS = 256;

    public static void main(String[] args)
    {
        int Array2[] = { 9, 7, 8, 5, 4, 6, 2, 3, 1 };
        int Array1[] = { 2, 4, 3, 9, 1, 8, 5, 6 };

        FindMissingElementInDuplicateInTwoArray(Array1, Array2);
    }

    /**
     * @param array1
     * @param array2
     */
    private static void FindMissingElementInDuplicateInTwoArray(int[] array1, int[] array2)
    {
        boolean countArray[] = new boolean[NO_OF_CHARS];

        for (int i = 0; i < array1.length; i++)
        {
            countArray[array1[i]] = true;
        }

        for (int i = 0; i < array2.length; i++)
        {
            if (!countArray[array2[i]])
            {
                System.out.println(array2[i]);
            }

        }

    }

}
