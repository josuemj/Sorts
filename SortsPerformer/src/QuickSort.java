/**
 * Quick sort algorithm
 * Source: https://tutospoo.jimdofree.com/tutoriales-java/m%C3%A9todos-de-ordenaci%C3%B3n/ordenaci%C3%B3n-r%C3%A1pida-quicksort/
 *
 */
public class QuickSort {

    public static void quickSort(int vec[], int inicio, int fin){
        if(inicio>=fin) return;
        int pivote=vec[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
            while(elemIzq<=fin && vec[elemIzq]<pivote){
                elemIzq++;
            }
            while(elemDer>inicio && vec[elemDer]>=pivote){
                elemDer--;
            }
            if(elemIzq<elemDer){
                int temp=vec[elemIzq];
                vec[elemIzq]=vec[elemDer];
                vec[elemDer]=temp;
            }
        }

        if(elemDer>inicio){
            int temp=vec[inicio];
            vec[inicio]=vec[elemDer];
            vec[elemDer]=temp;
        }
        quickSort(vec, inicio, elemDer-1);
        quickSort(vec, elemDer+1, fin);
    }

}
