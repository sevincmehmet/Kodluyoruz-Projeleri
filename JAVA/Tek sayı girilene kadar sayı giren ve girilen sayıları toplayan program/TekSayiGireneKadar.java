import java.util.Scanner;

public class TekSayiGireneKadar {
    public static void main(String[] args){

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        int sayi;
        int toplam = 0;
        try (Scanner scan = new Scanner(System.in)) {
            do{
                System.out.print("Sayi giriniz : ");
                sayi = scan.nextInt();
                //4 ün katlarının tamamı çift olduğundan yalnızca çift olanları topladım :)
                if (sayi % 2 == 0){
                    toplam += sayi;
                }
            }while(sayi % 2 == 0);
        }
        System.out.println("çift ve 4' ün katı olan sayıların toplamı : " + toplam);
    }     
}
