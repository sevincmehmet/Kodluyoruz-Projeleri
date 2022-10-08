import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        try (//BURÇ BULAN PROGRAM
        Scanner sc = new Scanner(System.in)) {
            String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim", "Kasım", "Aralık"};

            System.out.println("Hangi ayda doğdunuz ? : ");
            String ay = sc.nextLine();
            System.out.println("Ayın kaçında doğdunuz ? : ");
            int gün = sc.nextInt();

            if(Objects.equals(ay, aylar[0])) {
                if(gün<=21)System.out.println("Burcunuz OĞLAK");
                else System.out.println("Burcunuz KOVA");
            }
            else if(Objects.equals(ay, aylar[1])) {
                if(gün<=19)System.out.println("Burcunuz KOVA");
                else System.out.println("Burcunuz BALIK");
            }
            else if(Objects.equals(ay, aylar[2])) {
                if(gün<21)System.out.println("Burcunuz BALIK");
                else System.out.println("Burcunuz KOÇ");
            }
            else if(Objects.equals(ay, aylar[3])) {
                if(gün<21)System.out.println("Burcunuz KOÇ");
                else System.out.println("Burcunuz BOĞA");
            }
            else if(Objects.equals(ay, aylar[4])) {
                if(gün<21)System.out.println("Burcunuz BOĞA");
                else System.out.println("Burcunuz İKİZLER");
            }
            else if(Objects.equals(ay, aylar[5])) {
                if(gün<=21)System.out.println("Burcunuz İKİZLER");
                else System.out.println("Burcunuz YENGEÇ");
            }
            else if(Objects.equals(ay, aylar[6])) {
                if(gün<=22)System.out.println("Burcunuz YENGEÇ");
                else System.out.println("Burcunuz ASLAN");
            }
            else if(Objects.equals(ay, aylar[7])) {
                if(gün<=22)System.out.println("Burcunuz ASLAN");
                else System.out.println("Burcunuz BAŞAK");
            }
            else if(Objects.equals(ay, aylar[8])) {
                if(gün<=22)System.out.println("Burcunuz BAŞAK");
                else System.out.println("Burcunuz TERAZİ");
            }
            else if(Objects.equals(ay, aylar[9])) {
                if(gün<=22)System.out.println("Burcunuz TERAZİ");
                else System.out.println("Burcunuz AKREP");
            }
            else if(Objects.equals(ay, aylar[10])) {
                if(gün<=22)System.out.println("Burcunuz AKREP");
                else System.out.println("Burcunuz YAY");
            }
            else if(Objects.equals(ay, aylar[11])) {
                if(gün<=21)System.out.println("Burcunuz YAY");
                else System.out.println("Burcunuz KOVA");
            }
        }
    }   
}
