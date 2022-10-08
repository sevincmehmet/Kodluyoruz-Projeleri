package JAVA.src30;
import java.util.Scanner;

public class recursiveFibo {
    public static void main(String[] args) {
        int n;
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Kaç adım bastırmak istediğinizi giriniz : ");
            n = inp.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(recursiveFibonacci(i));
        }
    }
    static int recursiveFibonacci(int sayi) {
        if(sayi == 0 || sayi == 1 ) {
            return sayi;
        }else
            return recursiveFibonacci(sayi-1) + recursiveFibonacci(sayi-2);
    }
}
