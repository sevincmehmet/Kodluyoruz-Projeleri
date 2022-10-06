package JAVA.src19;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Kombinasyonunu öğrenmek isteddiğniz sayıları C(n,r) şeklinde giriniz.");
        do{
            System.out.print("Lütfen negatif giriş yapmayınız n ? : ");
            n = scan.nextInt();
        }while(n<0);
        
        do{
            System.out.print("Lütfen negatif giriş yapmayınız r ? : ");
            r = scan.nextInt();
        }while(n<0);

        System.out.println("Cevap : " + combination(n, r));
    }

    public static int facktorial(int n){
      if(n==0){
        return 1;
      }else 
        return n * facktorial(n-1);
    }

    public static int combination(int n, int r){
       return (facktorial(n)) / (facktorial(r)*facktorial(n-r));
    }
}
