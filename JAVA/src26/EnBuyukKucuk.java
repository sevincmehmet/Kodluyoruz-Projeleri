package JAVA.src26;

import java.util.Scanner;

public class EnBuyukKucuk {
    public static void main(String[] args) {
        
        //GİRİLEN SAYILAR ARASINDAN EN BÜYÜK VE EN KÜÇÜĞÜ BULAN PROGRAM

        int n, sayi, enBuyuk, enKucuk;
        
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Kaç tane sayi girceksiniz ? : ");
            n =inp.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n ; i++) {
                sayi = inp.nextInt();
                arr[i] = sayi;
            }
                enBuyuk = arr[0];
                enKucuk = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if(arr[i] > enBuyuk){
                    enBuyuk = arr[i];
                }
                if(arr[i] < enKucuk){
                    enKucuk = arr[i];
                }
            }
        }
        System.out.print("En büyük : " + enBuyuk +
                    "\nEn küçük : " + enKucuk);
    }
}
