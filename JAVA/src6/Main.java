package JAVA.src6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = klavye.nextDouble();
        
        System.out.println("Lütfen kilonuzu (kg cinsinde) giriniz : " );
        kilo = klavye.nextDouble();

        System.out.println("Vücut Kitle İndexsiniz : " + ((kilo)/(Math.pow(boy, 2))));
    }

}
