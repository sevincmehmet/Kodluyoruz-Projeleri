import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //SWİTCH CASE İLE HESAP MAKİNASI YAPIMI
        
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.println("1.Toplama\n2.çıkarma\n3.çarpma\n4.bölme\n\nLütfen yapmak istediğiniz işlemi seçiniz : ");

            int n = klavye.nextInt();
            islem(n);
        }

    }
    static void islem(int n){
        try(Scanner klavye = new Scanner(System.in)){
        
            System.out.println("İlk sayıyı giriniz : ");
        
            double s1 = klavye.nextDouble();
            System.out.println("İkinci sayıyı giriniz : ");
            double s2 = klavye.nextDouble();
        
            switch (n){
          
                case 1 :
                    System.out.println("Sonuç : " + (s1+s2));
                break;

                case 2:
                    System.out.println("Sonuç : " + (s1-s2));
                break;

                case 3:
                    System.out.println("Sonuç : " + (s1*s2));
                break;

                case 4:
                    if(s2 != 0) 
                        System.out.println("Sonuç : " + s1/2);
                    else
                        System.err.println("Sayı bölü sıfır tanımsızlığı!!");    
                break;
                default :
                    System.out.println("Böyle bir işlem yok");
                break;
            }
            
        }
    }
}
