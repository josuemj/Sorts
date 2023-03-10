/**
 * Class contains the Gnome sort
 * Source: https://www.geeksforgeeks.org/java-program-for-gnome-sort/
 */
public class GnomeSort {

    /**
     * where n is the array size
     * @param arr
     * @param n
     */
    public int[] gnomeSort(int arr[], int n) {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
    }
}
