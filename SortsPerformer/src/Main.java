import java.io.*;
public class Main {
    public static void main(String[] args) { //A
        View vw = new View();
        FileGenerator fg = new FileGenerator();
        boolean Active = true;
        while(Active){
            int size = vw.menuSize();
            fg.FileGenerator(size, true);
            switch(vw.menuSort()){
                case 1:
                    GnomeSort gn = new GnomeSort();
                    gn.gnomeSort(Reader(), size);
                    break;
                case 2:
                    InsertionSort in = new InsertionSort();
                    in.insertionSort(Reader(), size);
                    break;
                case 3:
                    MergeSort mg = new MergeSort();
                    mg.sort(Reader(),0,size-1);
                    break;
                case 4:
                    QuickSort qs = new QuickSort();
                    qs.quickSort(Reader(),0,size-1);
                    break;
                case 5:
                    RadixSort rx = new RadixSort();
                    rx.radixsort(Reader(), size);
                    break;
                default: Active = false;
            }
        }
        //Implementations here
        //Implementation sample
        //Random array
        //Array will be given then.

        // Sort function Call
        //RadixSort.radixsort(unsortArray, unsortArray.length); //Checked
        //GnomeSort.gnomeSort(unsortArray,unsortArray.length); //Checked
        //InsertionSort.insertionSort(unsortArray,unsortArray.length); //Checked
        //QuickSort.quickSort(unsortArray,0,unsortArray.length-1); // Checked
        //MergeSort.sort(unsortArray,0,unsortArray.length-1);
    }

    public static int[] Reader() {
        String[] ArrayTemp;
        int[] NumberArray = new int[0];
        try (BufferedReader br = new BufferedReader(new FileReader("Number_File.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                ArrayTemp = line.split(" ");
                NumberArray = new int[ArrayTemp.length];
                for(int i = 0; i< ArrayTemp.length; i++){
                    NumberArray[i] = Integer.parseInt(ArrayTemp[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return NumberArray;
    }
}