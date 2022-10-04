package JAVA.src11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //GİRİLEN 3 SAYIYI KÜÇÜKTEN BÜYÜĞE SIRALAYAN ALGORİTMA

        try (Scanner sc = new Scanner(System.in)) {
            int s[] = new int[3];

            System.out.println("Lütfen sıralayacağınız 3 sayıyı giriniz : ");


            for(int i=0; i<s.length; i++){
                s[i] = sc.nextInt();
            }
            
            for (int i = 0; i < s.length; i++) {
                int enKucuk = i;
                for (int j = i+1; j < s.length; j++) {
                    if(s[j]<s[enKucuk]){
                        enKucuk = j;
                    };
                }
                int temp = s[i];
                s[i] = s[enKucuk];
                s[enKucuk] = temp;    
            }

            System.out.print("Sıralamanız : ");
            
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]+" ");
            }
        }
    }
}
