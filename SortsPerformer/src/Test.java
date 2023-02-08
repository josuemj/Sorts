import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Test {

    @org.junit.Test
    public void GnomeSort() {
        int[] arr = {3,2,1};
        GnomeSort gn = new GnomeSort();
        arr = gn.gnomeSort(arr,3);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
    }
    @org.junit.Test
    public void InsertionSort() {
        int[] arr = {3,2,1};
        InsertionSort in = new InsertionSort();
        arr = in.sort(arr,3);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
    }

    @org.junit.Test
    public void MergeSort() {
        int[] arr = {3,2,1};
        MergeSort mg = new MergeSort();
        arr = mg.sort(arr,0,2);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
    }

    @org.junit.Test
    public void QuickSort() {
        int[] arr = {3,2,1};
        QuickSort qs = new QuickSort();
        arr = qs.quickSort(arr,0,2);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
    }
    @org.junit.Test
    public void RadixSort() {
        int[] arr = {3,2,1};
        RadixSort rx = new RadixSort();
        rx.radixsort(arr, 3);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
    }
}