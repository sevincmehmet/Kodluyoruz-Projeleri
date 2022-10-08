import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        int basamak, sayi;
        basamak = 0;
        int toplam = 0;
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Basamaklarını Toplamak İstediğiniz Sayıyın Giriniz : ");
            sayi = scan.nextInt();
        }
        while(sayi != 0){
            basamak = sayi%10;
            toplam += basamak;
            sayi = (sayi-basamak)/10; 
        }
        System.out.println("sayınızın Basamaklarının Toplamı : " + toplam);
    }
}
