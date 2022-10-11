import java.util.Arrays;
import java.util.Scanner;

public class Tekrar2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {23, 23, 43, 43, 12, 12, 43, 23, 43, 11, 11, 56, 43, 11, 43};
        int[] count = new int[arr.length];
        System.out.println("Dizi: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            count[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j != i) && (arr[i] == arr[j])) {
                    count[j] = count[i];
                }
            }
        }
        System.out.println("Tekrar eden sayilar");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.println(arr[i] + " sayisi " + count[i] + " kere tekrar edildi");
            }
        }
    }
}