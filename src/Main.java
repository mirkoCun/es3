// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("inserire la lunghezza che si vuole assegnare alla lista");
        int lungh = inp.nextInt();
        int[] a = new int[lungh];
        int k;
        for (int i = 0; i<a.length; i++){
            System.out.println("inserire un numero da aggiungere alla lista");
            a[i] = inp.nextInt();
        }
        System.out.println("array iniziale: " + Arrays.toString(a));
        System.out.println("inserire il numero di riferimento");
        k = inp.nextInt();
        System.out.println("array finale: " + Arrays.toString(divisori(a,k)));
    }

    public static int[] divisori (int[] array, int k){
        int ctrDiv = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]%k == 0){
                ctrDiv += 1;
            }
        }

        int[] b = new int[ctrDiv];
        ctrDiv = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]%k == 0){
                b[ctrDiv] = array[i];
                ctrDiv+=1;
            }
        }
        return b;
    }
}