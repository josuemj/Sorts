public class Main {
    public static void main(String[] args) {
        //Implementations here

        //Implementation sample

        //Random array
        int[] unsortArray = {1,2,4,2,332,23,2}; //Array will be given then.

        // Sort function Call
        RadixSort.radixsort(unsortArray, unsortArray.length);
        GnomeSort.gnomeSort(unsortArray,unsortArray.length);

        //                    array               Start                       end
        QuickSort.quickSort(unsortArray,unsortArray[0],unsortArray[unsortArray.length-1]);



    }
}