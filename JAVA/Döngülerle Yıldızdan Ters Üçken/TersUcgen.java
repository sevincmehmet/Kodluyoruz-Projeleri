import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int n;
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.println("Basamak sayısını giriniz : ");
            n=klavye.nextInt();
            
        }
        for (int i = n; i >0 ; i--) {
            for (int j = 0; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((i*2)-1) ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
