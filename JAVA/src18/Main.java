
package JAVA.src18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //4 VE 5' İN KUVVETLERİNİ EKRANA YADIRAN PROGRAM
        int sinir;
        try (Scanner scan = new Scanner(System.in)) {
            sinir = scan.nextInt();
        }
        System.out.print(sinir + " sayısına kadar olan 4 ün kuvvetleri : " );

        for (int i = 1; i < sinir; i*=4) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print(sinir + " sayısına kadar olan 5 ün kuvvetleri : " );

        for (int i = 1; i < sinir; i*=5) {
            System.out.print(i + " ");
        }
    }
}
