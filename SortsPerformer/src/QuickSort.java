/**
 * Quick sort algorithm
 * Source: https://www.geeksforgeeks.org/quick-sort/
 */

public class QuickSort {

    /**
     * A utility function to swap two elements
     * @param arr
     * @param i
     * @param j
     */
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     *to left of pivot and all greater elements to right
     * of pivot
     * @param arr
     * @param low
     * @param high
     * @return
     */
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /**
     * The main function that implements QuickSort
     * @param arr arr[] --> Array to be sorted,
     * @param low low --> Starting index,
     * @param high high --> Ending index
     */
    static int[] quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }
}




