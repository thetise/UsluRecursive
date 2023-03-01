package Giris;


import java.util.Scanner;
public class EBOBEKOKBul {
    public static void main(String[] args) {

        int number1, number2;

        int i = 2;
        int j = 2;
        int smallestnumber;
        int BiggestNumber = 1;
        int EKOK;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();


        if(number1 < number2){
            smallestnumber = number1;
        }
        else{
            smallestnumber = number2;
        }

        do {
            int a;
            int b;

            if(number1 % i == 0 && number2 % j == 0){

                a = i;
                b = j;

                if(a == b){
                    int FirstNumber = 1;
                    int Enbuyuk = 1;

                    if(a > FirstNumber){
                        BiggestNumber = a;
                        FirstNumber = a;
                    }
                }
            }
            i++;
            j++;
        }while (smallestnumber >= i);


        System.out.print("EBOB: ");
        System.out.println(BiggestNumber);

        EKOK = (number1 * number2) / BiggestNumber;

        System.out.print("EKOK: ");
        System.out.println(EKOK);


    }
}
