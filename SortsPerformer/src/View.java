import java.util.Scanner;
public class View {
    private Scanner scan = new Scanner(System.in);
    public int menuSort(){
        int answer;
        do{
            scan = new Scanner(System.in);
            System.out.println("Escoga el sort que desea usar:");
            System.out.println("1. Gnome Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Radix Sort");
            System.out.println("6. Salir");
            answer = scan.nextInt();
        } while(answer>6 || answer<1);
        return answer;
    }

    public int menuSize(){
        scan = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo a ordenar:");
        return scan.nextInt();
    }
}
