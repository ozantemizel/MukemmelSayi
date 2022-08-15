import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Merak edilen sayıyı giriniz:");
        int n = input.nextInt();
        int toplam=0;

        if(n!=1) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                toplam += i;
                }
            }
            if (toplam == n) {
            System.out.println("Girilen " + n + " sayısı Mükemmel sayıdır.");
            } else {
            System.out.println(n + " mükemmel sayı değildir.");
            }
        }else {
            System.out.println(n+" mükemmel sayı değildir.");
        }
    }
}
