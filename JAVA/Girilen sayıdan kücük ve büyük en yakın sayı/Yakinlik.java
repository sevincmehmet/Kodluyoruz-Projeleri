import java.util.Scanner;
import java.util.Arrays;

public class Yakinlik {
    public static void main(String[] args) {
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program
       
        int girilen;
        int sayac = 0;
        int arr[]={15, 12, 788, 1, -1, -788, 2, 0};
        int newArr[] = new int [arr.length+1];
    
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Sayı giriniz : ");
            girilen = inp.nextInt();
        }
        newArr[0] = girilen;

        for (int i = 1; i < newArr.length; i++) {
            newArr[i]  = arr[sayac];
            sayac++;
            if(sayac >= arr.length)
                break;
        }
        Arrays.sort(newArr);
        System.out.print("Dizi : " + Arrays.toString(arr));
        System.out.print("\nGirilen Sayı : " + girilen);
        System.out.println("\nGirilen sayıdan küçük en yakın sayı : " + newArr[Arrays.binarySearch(newArr, girilen)-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + newArr[Arrays.binarySearch(newArr, girilen)+1]);
    }
}
