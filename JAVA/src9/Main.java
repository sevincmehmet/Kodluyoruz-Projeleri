package JAVA.src9;

import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        //KULLANNICI GİRİŞİ

        try (Scanner sc = new Scanner(System.in)) {
            String sifre = "Sevinc1967";
            System.out.println("Şifrenizi giriniz : ");
            String giris = sc.nextLine();

            String secim[] = {"evet", "hayır"};
            if(giris != sifre){
                System.err.println("Şifreniz yanlış şifreyi sıfırlamak ister misiniz ? (evet veya hayır diye cevap veriniz..)");
                String sec = sc.nextLine();
                if(Objects.equals(sec, secim[0])) {
                    
                    System.out.println("yeni şifrenizi giriniz : ");
                    String yeniSifre = sc.nextLine();
                    
                    if(sifre.equals(yeniSifre)){
                        
                        while(sifre.equals(yeniSifre)){
                            System.out.println("Yeni şifreniz eskisi ile aynı olamaz!!Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                            yeniSifre = sc.nextLine();
                        }System.out.println("Şifre oluşturuldu.");

                    }else System.out.println("Şifre oluşturuldu.");
                }else System.out.println("peki :)");
            }else System.out.println("Giriş yapıldı.");
        }
    }
}
