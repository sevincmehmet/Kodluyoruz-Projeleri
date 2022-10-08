import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // KDV HESAPLAMA
        
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.println("Lütfen ürün fiyatını giriniz \t:");
            double fiyat = klavye.nextDouble();
 
            while(fiyat<0){
                System.err.println("Lütfen geçerli bir fiyat giriniz \t:");
                fiyat = klavye.nextDouble();
            }
            
            System.out.println("Ürününüzün fiyatı \t:" + fiyat);
            if(fiyat<=1000 && fiyat>=0) {
                Double kdv = fiyat *= 0.18;
                fiyat += kdv;
            }else {
                Double kdv = fiyat *= 0.08;
                fiyat += kdv;
            }
            System.out.println("Ürününüzün KDV\'li fiyatı \t:" + fiyat);
        }

    }
}
