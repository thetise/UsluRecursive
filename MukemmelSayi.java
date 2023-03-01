package Giris;

import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        int number;
        int i = 1;
        int toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        do{
            if(number % i == 0){
                toplam = toplam + i;
            }
            i++;
        }while (number > i);
        
        if(toplam == 1){
            System.out.println("1 mükemmel sayı değildir.");
        }
        else{
            if(toplam == number){
                System.out.print(number);
                System.out.println(" Mükemmel sayıdır.");
            }
            else{
                System.out.print(number);
                System.out.println(" Mükemmel sayı değildir.");
            }
        }
    }
}
