/**
 * Insertion sort class
 * Source: https://favtutor.com/blogs/sorting-algorithms-java
 *
 */
public class InsertionSort {

    /**
     * Insertion sort method
     * @param arr
     * @param n
     */
    public static void insertionSort(int arr[], int n)
    {
        if (n <= 1)
        {
            return;
        }
        insertionSort( arr, n-1 );
        int last = arr[n-1];
        int j = n-2;

        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

}