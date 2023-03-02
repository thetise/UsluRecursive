package Giris;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        int eleman;
        int t1 = 0;
        int t2 = 1;
        int sum;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        eleman = input.nextInt();

        for(int i = 0; i < eleman; i++){
            System.out.print(" "+t1);
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
