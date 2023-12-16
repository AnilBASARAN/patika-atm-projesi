import java.util.Scanner;
public class AtmMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id, pass;
        int selection,deposit,draw;
        int count = 3;
        int bakiye = 1500;

        // bakiyemizi 1500 olarak, şifremizi ve parolamızı da tanımlanıktan sonra programımızı başlatıyoruz

        do {
            System.out.print("Kullanıcı adını giriniz.   ");
            id = input.nextLine();

            System.out.print("Şifrenizi giriniz.   ");
            pass = input.nextLine();

            if (id.equals("patika") && pass.equals("password123")) {
                System.out.println("Giriş yaptınız.");
                break;

            } else {

                System.out.println("Kullanıcı adı veya şifrenizi yanlış girdiniz. Kalan Hakkınız : " + --count);
                if (count == 0) {

                    return;
                }

            }
            // burda count sıfırın altına inene kadar döngümüz devam edecek. count yanlış girme hakkımızın
            // saklandığı değişkenimiz


        } while (count > 0);

        do {
            System.out.print("-----Menu------\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
            System.out.println("----"   );

            selection = input.nextInt();

        switch (selection){
            case 4:
                System.out.print("Çıkış yaptınız. Tekrar görüşmek üzere.");
                return;
            case 1:
                    System.out.println("Yatırmak istediğiniz tutarı giriniz:   ");
                    deposit = input.nextInt();
                    bakiye += deposit;
                    System.out.println("Bakiyeniz:  "+bakiye);
                    break;

                    case 2:
                    System.out.print("Çekmek istediğiniz Tutar:   ");
                    draw = input.nextInt();
                    if(draw > bakiye){
                        System.out.println("Yetersiz Bakiye.");
                    }else{
                        System.out.println("Hazneden paranızı alınız.");
                        bakiye -= draw;
                        System.out.println("Bakiyeniz:  "+bakiye);
                    }
                    break;

                    case 3:
                    System.out.println("Güncel bakiyeniz:  "+bakiye);
                    break;
                }

        } while (selection != 4);

        // tüm işlemler bittiğinde kullanıcıyı uğurlamak için girilen son çıktı,
        // ister 3 defa yanlış girdikten sonra ister 4 e basınca , son olarak bu yazı karşılayacak kullanıcıyı
        System.out.println("Çıkış Yaptınız. Yine bekleriz.");
    }
}