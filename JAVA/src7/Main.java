package JAVA.src7;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    
    //MANAV KASA PROGRAMI

    double armut, elma, domates, muz, patlıcan;
    armut = 2.14;
    elma = 3.67;
    domates = 1.11;
    muz = 0.95;
    patlıcan = 5;
    
    try (Scanner klavye = new Scanner(System.in)) {
        System.out.println("Armut kaç kilo ? :");
        double armutKg = klavye.nextDouble();
        
        System.out.println("Elma kaç kilo ? :");
        double elmaKg = klavye.nextDouble();

        System.out.println("Domates kaç kilo ? :");
        double domatesKg = klavye.nextDouble();

        System.out.println("Muz kaç kilo ? :");
        double muzKg = klavye.nextDouble();

        System.out.println("Patlıcan kaç kilo ? :");
        double patlıcanKg = klavye.nextDouble();

        System.out.println("Toplam Tutar : "+((armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)*(muz*muzKg)+(patlıcan*patlıcanKg))+"TL");
    }

   }
}
