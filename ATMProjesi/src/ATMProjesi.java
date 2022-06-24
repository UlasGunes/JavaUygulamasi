import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        String password ,username;

        int deneme=3;
        Scanner a=new Scanner(System.in);
        for(int i=1;i<=deneme;i++) {
            System.out.print("Kullanici adinizi giriniz:");
            username=a.nextLine();
            System.out.print("Kullanici parolanizi giriniz:");
            password=a.nextLine();
            if (username.equals("fatih") && password.equals("1234")) {
                System.out.println("Basariyla giris yaptiniz...");
                break;
            } else if (deneme == i) {
                System.out.println("Kartiniz bloke oldu lutfen banka ile iletisime geciniz");
                System.exit(0);
            } else {
                System.out.println("Sifre veya giris isminiz yanlis lutfen tekrar deneyiz kalan hakkiniz:"+(deneme-i));
            }
        }
        int choose,yat,cek,x=2,p=1,bakiye=5000;
        while(x>=p){
        System.out.print("yapmak istediginiz islemleri seciniz\n 1-Para yatirma\n 2-Para cekme\n 3-Bakiye Sorgulama\n 4-Cikis\nSeciminiz:");
        choose=a.nextInt();
        switch (choose) {
            case 1:
                System.out.print("yatiracaginiz para miktarini giriniz:");
                yat = a.nextInt();
                System.out.println("Toplam bakiyeniz=" + (bakiye + yat));
                System.out.println("islem menusune donuluyor...");
                bakiye+=yat;
                break;
            case 2:
                System.out.print("cekeceginiz para miktarini giriniz:");
                cek = a.nextInt();
                if (bakiye >= cek) {
                    System.out.println("Kalan bakiyeniz" + (bakiye - cek));
                    System.out.println("islem menusune donuluyor...");
                    bakiye-=cek;
                } else {
                    System.out.println("bakiyenizden daha fazla para cekemezsiniz");
                    System.out.println("islem menusune donuluyor...");
                }
                break;
            case 3:
                System.out.println("Guncel bakiyeniz"+ bakiye);
                System.out.println("islem menusune donuluyor...");
                break;
            case 4:
                System.out.println("Cikis yapiliyor... Iyi Gunler Dileriz");
                System.exit(0);
                break;
        }
        }
    }
}
