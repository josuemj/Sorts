import java.io.*;
import java.util.Random;

public class FileGenerator {
    public void FileGenerator(int n){
        int[] NumberList = ShuffledArray(n);
        String NumberString;
        try{
            FileWriter fw = new FileWriter("Number_File.txt");
            BufferedWriter w = new BufferedWriter(fw);
            for (int i = 0; i<n;i++){
                if(i!=n-1){
                    NumberString = NumberList[i]+" ";
                } else{
                    NumberString = NumberList[i]+"";
                }
            }
        } catch (Exception e){
            System.out.println("No existe el archivo");
        }
    }

    public int[] ShuffledArray(int n){
        Random rand = new Random();
        int randIndex;
        int temp;
        int[] NumberList = new int[n];
        for(int i= 0; i<n; i++){
            NumberList[i] = i;
        }
        for(int i=0;i<n; i++){
            randIndex = rand.nextInt(n);
            temp = NumberList[i];
            NumberList[i] = NumberList[randIndex];
            NumberList[randIndex] = temp;
        }
        return NumberList;
    }
}
