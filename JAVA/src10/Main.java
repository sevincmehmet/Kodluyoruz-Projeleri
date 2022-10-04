package JAVA.src10;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //HAVA SICAKLIĞINA GÖRE ETKİNNLİK ÖNEREN PRGRAM

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Hava kaç derece ? : ");
            int derece = sc.nextInt();

            if (derece<5) {System.out.println("Kayak yapabilirsiniz.");}
            else if (derece>5 && derece<15) {System.out.println("Sinema izleyebilirsiniz.");}
            else if (derece>15 && derece<25) {System.out.println("Piknik yapabilirsiniz.");}
            else {System.out.println("Yüzmeye gidebilirsiniz.");}
        }        

    }
}
