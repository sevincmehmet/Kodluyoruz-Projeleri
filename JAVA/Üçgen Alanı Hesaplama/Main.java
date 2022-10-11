import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       
        // ÜÇGEN ALANI HESAPLAMA
        
        int a,b,c;
        double u,A;
        
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.println("Lütfen üçkeninizin kenar uzunluklarını giriniz\t:");
            
            a = klavye.nextInt();
            b = klavye.nextInt();
            c = klavye.nextInt();
        }
        u = ((a+b+c)/2);
        A = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgeninizin Alanı\t:" + A);
    }
}