import java.util.Scanner;
import java.util.Arrays;

public class Sıralama {
    public static void main(String[] args) {
        int n;
            try (Scanner inp = new Scanner(System.in)) {
                System.out.print("Dizinin boyutu n : ");
                n = inp.nextInt();

                int arr[] = new int[n];

                System.out.println("Dizinizin elemanlarını giriniz : ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print((i+1) + ". Elemanı : ");
                    arr[i] = inp.nextInt();
                }
      
                Arrays.sort(arr);
                System.out.println("Sıralama : " + Arrays.toString(arr));
            }
    }
}
