public class Ortalama {
    public static void main(String[] args) {
        
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        
        int toplam = 0;
        int arr[] = {26, 24, 45, 12, 3};

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println("Dizinizin harmonik ortalaması : " + arr.length / toplam);
    }
}
