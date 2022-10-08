import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //GİDİLEN MESAFEYE GÖRE TAKSİMETRE TUTTARI HESAPLAMA

        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("Lütfen kaç km gidildiğini giriniz\t:");

            double yol = klavye.nextDouble();

            while(yol<0){
                System.err.print("Lütfen geçerli bir yol giriniz\t:");
                yol = klavye.nextDouble();
            }

            double ücret = (10 +(yol*2.20));
            
            if(ücret < 20){
               ücret = 20;
            }
            
            System.out.println("Ödenecek tutar\t:" + ücret);
        }
    

    }
}
