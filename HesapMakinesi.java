package Giris;

import java.util.Scanner;
public class HesapMakinesi {
    static int toplama(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.print("Sonuç: ");
        return sum;
    }

    static int cikarma(int a, int b) {
        int sum = 0;
        sum = a - b;
        System.out.print("Sonuç: ");
        return sum;
    }

    static int carpma(int a, int b) {
        int sum = 1;
        sum = a * b;
        System.out.print("Sonuç: ");
        return sum;
    }

    static int bolme(int a, int b) {
        int sum = 1;
        sum = a / b;
        System.out.print("Sonuç: ");
        return sum;
    }

    static int uslu(int a, int b) {
        int sum = 1;
        sum = (int) Math.pow(a,b);
        System.out.print("Sonuç: ");
        return sum;
    }

    static int faktoriyel(int a) {
        int sum = 1;
        for(int i = 1; i <= a; i++){
            sum = sum * i;
        }
        System.out.print("Sonuç: ");
        return sum;
    }

    static int mod(int a, int b) {
        int sum = 0;
        sum = a % b;
        System.out.print("Sonuç: ");
        return sum;
    }

    static int dikdortgen(int a, int b) {
        int alan = 0;
        int cevre = 0;
        alan = a * b;
        cevre = (a + b) * 2;
        System.out.println("Alan: " + alan);
        System.out.print("Çevre : ");
        return cevre;
    }

    public static void main(String[] args) {

        int select;
        int number1, number2;


        System.out.println("1- Toplama İşlemi");
        System.out.println("2- Çıkarma İşlemi");
        System.out.println("3- Çarpma İşlemi");
        System.out.println("4- Bölme İşlemi");
        System.out.println("5- Üslü Sayı Hesaplama");
        System.out.println("6- Faktöriyel Hesaplama");
        System.out.println("7- Mod Alma");
        System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");

        Scanner input = new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemin rakamını giriniz: ");
        select = input.nextInt();


        if (select == 1) {

            System.out.print("İlk sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            System.out.println(toplama(number1, number2));
        }
        else if (select == 2) {

            System.out.print("İlk sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            System.out.println(cikarma(number1,number2));
        }
        else if (select == 3) {

            System.out.print("İlk sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            System.out.println(carpma(number1,number2));
        }
        else if (select == 4) {

            System.out.print("İlk sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            System.out.println(bolme(number1,number2));
        }
        else if (select == 5) {

            System.out.print("İlk sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            System.out.println(uslu(number1,number2));
        }
        else if (select == 6) {

            System.out.print("Sayı giriniz: ");
            number1 = input.nextInt();

            System.out.println(faktoriyel(number1));
        }
        else if (select == 7) {

            System.out.print("İlk sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            System.out.println(mod(number1,number2));
        }
        else if (select == 8) {

            System.out.print("Dikdörtgenin kısa kenarını giriniz:  ");
            number1 = input.nextInt();
            System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
            number2 = input.nextInt();

            System.out.println(dikdortgen(number1,number2));
        }
        else{
            System.out.println("Yanlış bir tuşlama yaptınız. Lütfen tekrardan tuşlama yapınız");
        }
    }
}