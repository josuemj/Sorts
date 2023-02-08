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
    private int[] OrderedArray;
    public int[] sort(int[] arr, int n){
        OrderedArray = arr;
        insertionSort(arr, n);
        return OrderedArray;
    }

    public void insertionSort(int arr[], int n)
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
