import java.io.*;
import java.util.Random;

public class FileGenerator {
    public void FileGenerator(int n, boolean ordered){
        int[] NumberList = ShuffledArray(n, ordered);
        try{
            FileWriter fw = new FileWriter("Number_File.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i<n;i++){
                if(i!=n-1){
                    bw.write(NumberList[i]+" ");
                } else{
                    bw.write(NumberList[i]+"");
                }
            }
            bw.close();
        } catch (Exception e){
            System.out.println("No existe el archivo");
        }
    }

    public int[] ShuffledArray(int n, boolean ordered){
        Random rand = new Random();
        int randIndex;
        int temp;
        int[] NumberList = new int[n];
        for(int i= 0; i<n; i++){
            NumberList[i] = i;
        }
        if(ordered){
            for(int i=0;i<n; i++){
                randIndex = rand.nextInt(n);
                temp = NumberList[i];
                NumberList[i] = NumberList[randIndex];
                NumberList[randIndex] = temp;
            }
        }
        return NumberList;
    }
}
