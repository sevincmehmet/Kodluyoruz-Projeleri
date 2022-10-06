package JAVA.src20;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        // FOR KULLANARAK ÜSLÜ SAYI HESAPLAYAN PROGRAM GİRİNİZ.

        double taban, kuvvet;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Üssünü hesaplamak istedğiniz sayıyı önce taban ardından kuvvet olcak şekilde giriniz : ");
            taban = scan.nextInt();
            kuvvet = scan.nextInt();
        }
        if(kuvvet < 0){
            System.out.println(1/pozitifUsAlma(taban, kuvvet));
        }else
            System.out.println(pozitifUsAlma(taban, kuvvet));

    }

    static double pozitifUsAlma(double taban, double kuvvet) {
        double sonuc = 1;
        if(kuvvet < 0){
            kuvvet *= -1;
        }
        for (int i = 1; i <= kuvvet; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }
}
