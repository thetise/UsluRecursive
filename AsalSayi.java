package Giris;
public class AsalSayi {
    public static void main(String[] args) {

        for(int i = 2; i < 100; i++){

            int counter = 0;

            for(int p = 1 ; p <= i ; p++){

                if(i % p == 0){
                    counter++;
                }
            }

            if(counter <= 2){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
