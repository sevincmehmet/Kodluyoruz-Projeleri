package JAVA.src25;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int s1, s2; 
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen ebobunu ve ekokunu bulmak istediğiniz sayıların  değerlerini giriniz : ");
        s1 = inp.nextInt();
        s2 = inp.nextInt();

        System.out.println("EBOB : " + ebob(s1, s2) +
                    "\nEKOK : " + ekok(s1, s2));
    }
    static int ebob(int x, int y){
       int enBuyuk;
       int sayac = 1;
       int bolen = 0;
        if(x > y) {
            enBuyuk = x;
        } else enBuyuk = y;

        while(sayac <= enBuyuk/2){
            if((x % sayac == 0) && (y % sayac == 0)) {
                bolen = sayac;
            }
            sayac++;
        }
        return bolen;


    }
    static int ekok(int x, int y){
       return (x*y)/ebob(x, y);
    }
}
