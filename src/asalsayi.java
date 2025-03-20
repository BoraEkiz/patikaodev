import java.util.Scanner;

public class asalsayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz: ");
        int a = scanner.nextInt();
        scanner.close();

        if (asalsayi(a,a-1)){
            System.out.println(a+ "Asal Sayıdır");
        }
        else {
            System.out.println(a+ "Asal Sayı değildir");
        }




    }

    public static boolean asalsayi(int a, int b){

        if(a<=2) return false;
        if(b==1) return true;
        if(a%b==0) return false;
        return asalsayi(a,b-1);

    }

}
