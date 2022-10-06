package JAVA.src16;
import java.util.Scanner;

public class UcVeDordeTamBolunme {
    public static void main(String[] args) {
        
        //GİRİLEN SAYIYA KADAR 3 VE 4 E TAM BÖLÜNENLERİN ORTALAMASI
        int n;
        double toplam = 0;
        try (Scanner scan = new Scanner(System.in)) {
            do{
                System.out.print("Pozitif sayı giriniz : ");
                n = scan.nextInt();
            }while(n < 0);
        }

        for (int i = 0; i < n; i++) {
            if(i%3 == 0 && i%4 == 0 ){
                toplam += i;
            }
        }
        System.out.println(n + "'e kadarki sayıların 3 ve 4' e bölünenlerinin  ortalamsı : " + toplam/n);
    }
}
