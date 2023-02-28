package Giris;

import java.util.Scanner;
public class ElmasYapimi{
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int a;
        a = n;

        for (n = n-1; n >= 0 ; n--) {
            for (int j = a; j > n ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * n + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

/*

Output:

Bir Sayı Giriniz: 5
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

*/

