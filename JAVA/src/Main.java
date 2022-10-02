import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fizik, kimya, mat;

        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("Lütfen matematik notunuzu giriniz :\t");
            mat = klavye.nextDouble();
            while(mat < 0  ||  mat > 100 ){
                System.out.print("Geçersiz not girdiniz lütfen 0-100 arasnda gerçek notunuzu giriniz :\t");
                mat = klavye.nextDouble();
            }

            System.out.print("Lütfen fizik notunuzu giriniz :\t");
            fizik = klavye.nextDouble();
            while(fizik < 0  ||  fizik > 100 ){
                System.out.print("Geçersiz not girdiniz lütfen 0-100 arasnda gerçek notunuzu giriniz :\t");
                fizik = klavye.nextDouble();
            }

            System.out.print("Lütfen kimya notunuzu giriniz :\t");
            kimya = klavye.nextDouble();
            while(kimya < 0  ||  kimya > 100 ){
                System.out.print("Geçersiz not girdiniz lütfen 0-100 arasnda gerçek notunuzu giriniz :\t");
                kimya = klavye.nextDouble();
            }
        }

        double ort = ((kimya + fizik + mat)/3);
        boolean kontrol = ort >= 60;
        String gectiKaldi = kontrol ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println("Ortalamanız :\t" + ort +"\n"+ "Durumunuz :\t" + gectiKaldi);

    }
}
