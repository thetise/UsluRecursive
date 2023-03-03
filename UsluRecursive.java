package Giris;

import java.util.Scanner;
public class UsluRecursive {

    static int RecursiveUslu(int a, int b){

        int sum = 1;
        sum = (int) Math.pow(a,b);
        System.out.print("Sonuç: ");
        return sum;
    }
    public static void main(String[] args) {

        int taban, us;
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Taban değeri giriniz: ");
            taban = input.nextInt();

            System.out.print("Üs değerini giriniz: ");
            us = input.nextInt();

            System.out.println(RecursiveUslu(taban, us));

        }
    }
}
