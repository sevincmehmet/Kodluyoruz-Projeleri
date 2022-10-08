import java.util.Scanner;

public class Yıldız {
    public static void main(String[] args) {
         
        //DÖNGÜ İLE YILDIZLARDAN ELMAS YAP
        int n;
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Elmasınızın kaç stundan oluşmasını istersiniz : ");
            n = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((i*2)+1) ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
