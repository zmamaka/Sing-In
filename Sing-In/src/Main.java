import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName, password, sifirla, nUserName, nPassword;

        System.out.print("Kullanıcı adını giriniz : ");
        userName = sc.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = sc.nextLine();

        if (userName.equals("patikadev") && password.equals("java1234")){

            System.out.print("Giriş başarılı!");

        }else{

            System.out.println("Şifreniz yanlış.");

            System.out.println("Şifrenizi değiştirmek için SIFIRLA yazınız, istemiyorsanız ctrl f5 basıp tekrar deneyiniz");
            sifirla = sc.nextLine();

            if (sifirla.equals("SIFIRLA")){

                System.out.print("Yeni şifre giriniz : ");
                nPassword = sc.nextLine();

                if (nPassword.equals("java1234")){

                    System.out.print("Şifreniz oluşturulamadı. lütfen başka bir şifre giriniz : ");
                    nPassword = sc.nextLine();

                    if (nPassword.equals("java1234")){

                        System.out.print("Şifreniz oluşturulamadı. lütfen başka bir şifre giriniz : ");
                        nPassword = sc.nextLine();

                        if (nPassword.equals("java1234")){

                            System.out.print("Şifreniz oluşturulamadı. 3 defa hatalı giriş yapıldı. İşleminiz iptal edildi. ");

                        }else {
                            System.out.println("İşlem başarılı");
                        }


                    }else {
                        System.out.println("İşlem başarılı");
                    }

                }else {
                    System.out.println("İşlem başarılı");
                }


            }else {

                System.out.print("İşleminiz iptal edilmiştir");

            }


        }
    }


}