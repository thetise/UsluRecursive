package Giris;

import java.util.Scanner;
public class HarmonikSayiBul {
    public static void main(String[] args) {

        int number;
        double toplam = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for(double i=1; i <= number; i++){
            toplam = toplam + (1 / i);
        }

        System.out.print("Toplam : ");
        System.out.println(toplam);
    }
}
