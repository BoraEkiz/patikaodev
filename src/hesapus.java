import java.util.Scanner;

public class hesapus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Alt sayıyı giriniz");
        int altsayi = scanner.nextInt();

        System.out.println("Üst sayıyı giriniz");
        int üstsayi = scanner.nextInt();


        int sayicevap = üstsayi(altsayi,üstsayi);
        System.out.println(altsayi+"^"+üstsayi+"cevap: " + sayicevap);

    }

    private static int üstsayi(int altsayi, int üstsayi){
        if(üstsayi==0) return 1;

      return altsayi*üstsayi(altsayi,üstsayi-1);


    }
}
