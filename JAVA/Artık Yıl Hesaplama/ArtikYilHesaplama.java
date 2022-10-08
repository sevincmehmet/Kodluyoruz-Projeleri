import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        //ARTIK YIL HESAPLAMA
        try (Scanner scan = new Scanner(System.in)) {
            int yil;
            String stringYil;
            System.out.print("Yıl Giriniz : ");
            yil = scan.nextInt();
            
            if(yil < 0){
               stringYil = "Milattan önce ";
               yil *= -1;
            }else stringYil = "";

            if(yil % 4 == 0){
                System.out.println(stringYil + yil + " bir artık yıldır ! ");
            }else System.out.println(stringYil + yil + " bir artık yıl değildir ! ");
        }

        
    
    }
    
}
