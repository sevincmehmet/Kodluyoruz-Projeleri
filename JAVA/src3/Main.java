package JAVA.src3;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       
        // ÜÇGEN ALANI HESAPLAMA
        
        int a,b,c;
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.println("Lütfen üçkeninizin kenar uzunluklarını giriniz\t:");
            
            a = klavye.nextInt();
            b = klavye.nextInt();
            c = klavye.nextInt();
        }
        double u = ((a+b+c)/2);
        double A = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgeninizin Alanı\t:" + A);
    }
}