import java.util.Arrays;

public class Tekrar {
    public static void main (String[] args){

        //Bir sayı dizisindeki tekrar eden çift sayıları belirten program

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10+1);
        }

        System.out.print("Diziniz : " + Arrays.toString(arr));
        System.out.print("\nTekrar eden çift sayılar : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i] % 2 == 0) && (arr[i] == arr[j])){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.print("\nTekrar eden tek sayılar : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i] % 2 == 1) && (arr[i] == arr[j])){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
