import java.util.Scanner;
public class GelismisHesapMakinesi {
    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Sonuc=" + result);
        return result;
    }
    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("Sonuc="+result);
        return result;
    }
    static int carpma(int a,int b){
        int result=a*b;
        System.out.println("Sonuc="+result);
        return result;
    }
    static int bolme(int a, int b){
        int result=a/b;
        System.out.println("Sonuc="+result);
        return result;
    }
    static int uslu(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++) {
            result *= a;
        }
        System.out.println("Sonuc="+result);
        return result;
    }
    static int mod(int a, int b){
        int result=a%b;
        System.out.println("sonuc="+result);
        return result;
    }
    static int dortgen(int a,int b){
        int alan=a*b;
        int cevre=2*(a+b);
        System.out.println("Alan="+alan);
        System.out.println("Cevre="+cevre);
        return cevre;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            int secim, a, b;
            Scanner inp = new Scanner(System.in);
            System.out.print("1-Toplama islemi\n2-Cikarma islemi\n3-Carpma islemi\n4-Bolme islemi\n5-Uslu Sayi Alma\n6-Mod alma\n7-Dikdortgende Alan ve Cevre Hesabi\n8-Cikis Yap\nSeciminiz:");
            secim = inp.nextInt();
            if (secim<1 || secim>8) {
                System.out.println("Hatali bir deger girdiniz lutfen tekrar deneyin");
                continue;
            }
            if (secim==8) {
                System.out.println(".........Cikis Yapiliyor Hoscakalin........");
                break;
            }
            System.out.print("lutfen islem icin birinci sayiyi giriniz:");
            a = inp.nextInt();
            System.out.print("Lutfen islem icin ikinci sayiyi giriniz:");
            b = inp.nextInt();
            if (secim==4 && b==0) {
                System.out.println("islem gecersizdir lutfen 0 dan baska bir deger seciniz.");
                continue;
            }
            switch (secim) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    uslu(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dortgen(a,b);
                    break;
            }
        }
    }
}