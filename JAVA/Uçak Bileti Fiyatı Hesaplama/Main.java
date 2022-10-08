import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // UCAK BİLETİ FİYATI HESAPLAMA

        try (Scanner scan = new Scanner(System.in)) {
            double mesafe, fiyat;
            int yas, secim;
            String stringSecim;

            System.out.println("Mesafeyi km türünden giriniz : ");
            mesafe = scan.nextDouble();
            while (mesafe < 0) {
                System.out.println("Mesafe negatif olamasz lütfen yeni değer giriniz : ");
                mesafe = scan.nextDouble();
            }

            System.out.println("Yaşınızı giriniz : ");
            yas = scan.nextInt();
            while (yas < 0) {
                System.out.println("Yaşınız negatif olamasz lütfen yeni değer giriniz : ");
                yas = scan.nextInt();
            }

            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş ) : ");
            secim = scan.nextInt();

            int tip[] = { 1, 2 };
            while (secim != tip[0] && (secim != tip[1])) {
                System.out.println("Hatalı veri girdiniz. Lütfen tekrar giriniz");
                secim = scan.nextInt();
            }

            fiyat = mesafe * 0.10;

            if(secim == tip[0]){
                stringSecim = "Tek Yön";
            }else {
                stringSecim = "Gidiş Dönüş";
                fiyat *= 2;
            }

            if(yas<12){
                fiyat = fiyat - (fiyat * 0.5);
            } else if (yas >= 12 && yas <= 24){
                fiyat = fiyat - (fiyat * 0.1);
            } else if (yas >= 65) {
                fiyat = fiyat - (fiyat * 0.3);
            }

            if(secim == tip[1]){
                fiyat = fiyat - (fiyat * 0.2);
            }



            System.out.println( 
                "Gideceğiniz mesafe : " + mesafe +
                    "\nYaşınız : " + yas +
                        "\nYolculuk tipiniz : " + stringSecim +
                            "\n\nToplam tutar : " +fiyat + "t"
            );
        }
    }
}
