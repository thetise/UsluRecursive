package Giris;

import java.util.Scanner;
public class EnBuyukEnKucukBul {
    public static void main(String[] args) {

        int adet;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        adet = input.nextInt();

        int i = 1;
        int a = 1;
        int b = 1;
        while (adet > 0){
            System.out.print(i);
            System.out.print(". Sayıyı giriniz: ");
            number = input.nextInt();
            i++;
            adet--;

            if(number > a){

                a = number;
            }

            if(number < b){

                b = number;
            }
        }

        System.out.print("En büyük sayi: ");
        System.out.println(a);

        System.out.print("En küçük sayi: ");
        System.out.println(b);
    }
}
