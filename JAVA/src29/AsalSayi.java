package JAVA.src29;

public class AsalSayi {
	public static void main(String[] args) {
		
        //1-100 ARASI ASAL YAZDIRAN PROGRAM
		
		for(int i=1; i < 100; i++) {
			int sayac = 0;
			for(int j=1; j <= i; j++) {
				if(i % j == 0) {
					sayac++;
				}
			}
			if(sayac == 2) {
				System.out.print(i +" ");
			}
		}

	}

}