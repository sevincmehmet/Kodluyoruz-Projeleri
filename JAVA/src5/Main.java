package JAVA.src5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //DAİRE DİLİMİ ALANI HESAPLAMA

        try (Scanner klavye = new Scanner(System.in)) {
            System.out.println("Dairenizin yarıçapını giriniz\t: ");
            int r = klavye.nextInt();

            System.out.println("Alanını öğrenmek stediğiniz dilimin açısını giriniz\t: ");
            int a = klavye.nextInt();
            
            daireDilimiAlanı(r, a);
        }
    }

    static void daireDilimiAlanı(int yariCap, int Aci){
     
        double pi = 3.14;
        
        System.out.println("Daire diliminizin alanı\t: " + ((pi*(Math.pow(yariCap,2))*Aci)/360));

    }
}
