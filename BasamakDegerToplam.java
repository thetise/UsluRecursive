package Giris;

import java.util.Scanner;

public class BasamakDegerToplam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;
        int Basamak;

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        int sayi = number;

        while (sayi != 0) {
            Basamak = sayi % 10;
            total = total + Basamak;
            sayi = sayi / 10;
        }

        System.out.print("Basamakların toplamından elde edilen sayı : ");
        System.out.println(total);

    }
}



