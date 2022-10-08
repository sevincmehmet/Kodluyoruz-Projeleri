package JAVA.src22;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        // Harmonik Seri = 1 + 1/2 + 1/3 + 1/4 ..
        int n;
        double toplam = 0.0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Kaçıncı seriye kadar bulmak istiyorsunuz ? : ");
            n = scan.nextInt();
        }
        for (double i = 1; i <= n; i++) {
            toplam += (1/i);
        }

        System.out.println("Harmonik seriniz : " +toplam);
    }
}
