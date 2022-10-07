package JAVA.src27;

import java.util.Scanner;
public class MukkemmelSayi {
    public static void main(String[] args) {
        
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        int sayi; 
        int  toplam = 0;
        
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            sayi = inp.nextInt();
        }
        for (int i = 1; i <= sayi/2; i++) {
            if(sayi % i == 0){
                toplam += i;
            }
        }
        if(toplam == sayi){
            System.out.println(sayi + " Mükkemmel sayıdır !");
        }else System.out.println(sayi + " Mükkemmel sayı değildir !");
    }
}
