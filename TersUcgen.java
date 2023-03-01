package Giris;

import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        int Basamak;

        Scanner input = new Scanner (System.in);
        System.out.print("Basamak Sayısı: ");
        Basamak = input.nextInt();

        int a;
        a = Basamak;

        for (Basamak = Basamak-1; Basamak >= 0 ; Basamak--) {
            for (int j = a; j > Basamak ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * Basamak + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
