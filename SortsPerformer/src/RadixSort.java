import java.util.Arrays;

/**
 * Class contains radix sort and it's methods
 * Source: https://www.geeksforgeeks.org/radix-sort/
 */
public class RadixSort {

    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }


    /**
     * A function to do counting sort of arr[] according to
     * the digit represented by exp.
     * @param arr
     * @param n
     * @param exp
     */
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);


        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;


        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];


        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    /**
     * The main function to that sorts arr[] of
     * size n using Radix Sort
     * @param arr
     * @param n
     */
    static void radixsort(int arr[], int n)
    {
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
}
