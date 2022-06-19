import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double a,b,sonuc;
        int islem;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lutfen hesaplama icin ilk sayiyi giriniz:");
        a=inp.nextDouble();
        System.out.print("Lutfen hesaplama icin ikinci sayiyi giriniz");
        b= inp.nextDouble();
        System.out.print("Yapmak istediginiz islemi seciniz\n 1-Toplama \n 2-Cikarma\n 3-Bolme\n4-Carpma\n");
        islem=inp.nextInt();
        System.out.println("Sectiginiz islem:"+islem);

        switch (islem) {
            case 1:
                sonuc = a + b;
                System.out.println("Isleminizin sonucu:" + sonuc);
                break;
            case 2:
                sonuc= a - b;
                System.out.println("Isleminizn sonucu:"+ sonuc);
                break;
            case 3:
                sonuc=a/b;
            if (b==0) {
                System.out.println("Bu islem tanimsizdir 0 dan baska bir sayi seciniz:");
                break;
            }else {
                System.out.println("isleminizin sonucu:" + sonuc);
                break;
            }
            case 4:
                sonuc=a*b;
                System.out.println("islemizin sonucu:"+sonuc);
                break;
            default:
                System.out.println("Yanlıs bir sayi girdiniz tekrar deneyiniz.");
                break;

        }

    }

}
