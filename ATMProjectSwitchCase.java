package Giris;

import java.util.Scanner;
public class ATMProjectSwitchCase {
    public static void main(String[] args) {

        String UserName, Password;

        Scanner input = new Scanner(System.in);

        int right = 3;
        int select;
        int ParaYatir;
        int Balance = 150;
        int ParaCek;

        while(right > 0){

            System.out.print("Kullanıcı adınızı giriniz: ");
            UserName = input.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            Password = input.nextLine();

            if(UserName.equals("patika") && Password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do{
                    System.out.println("1- Para Yatırma");
                    System.out.println("2- Para Çekme");
                    System.out.println("3- Bakiye Sorgula");
                    System.out.println("4- Çıkış Yap");

                    System.out.print("Yapmak istediğiniz işlemin numarasını tuşlayınız: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatımrak istediğiniz miktarı giriniz: ");
                            ParaYatir = input.nextInt();
                            Balance = Balance + ParaYatir;
                            System.out.println(ParaYatir + " TL yatırıldıktan sonra mevcut bakiye: " + Balance);
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            ParaCek = input.nextInt();
                            if (Balance > ParaCek) {
                                Balance = Balance - ParaCek;
                                System.out.println(ParaCek + " TL çekildikten sonra kalan bakiye: " + Balance);
                            } else {
                                System.out.println("Bakiye yetersiz");
                            }

                        case 3:
                            System.out.print("Mevcut para: ");
                            System.out.println(Balance);
                    }
                } while (select != 4);
                System.out.print("Tekrardan görüşmek üzere.");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else{
                    System.out.println("Kalan hakkınız: "+ right);
                }
            }
        }
    }
}
