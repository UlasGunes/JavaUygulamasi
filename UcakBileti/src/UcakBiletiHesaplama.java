import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        double a,b,c,toplam,d;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz:");
        a= inp.nextDouble();
        System.out.print("Gideceginiz yolu km cinsinden giriniz:");
        b=inp.nextDouble();
        System.out.println("Lutfen tercihinizi yapiniz \n 1-Sadece Gidis \n 2-Gidis Donus \n Tercihinz:");
        c= inp.nextDouble();
        toplam=(b*0.10);
        if (12>a && c==1 && b>0){
            d=toplam/2;
            System.out.println("Bilet Fiyatınız:"+d + "\tTL'dir");
        } else if (a<=24 && a>=12 && c==1 && b>0) {
            d=toplam*0.9;
            System.out.println("Bilet Fiyatiniz:"+d + "\tTL'dir");
        } else if (a>24 && c==1 && b>0 && a<=65) {
            d=toplam;
            System.out.println("Bilet Fiyatiniz:"+d + "\tTL'dir");
        } else if (a>65 && c==1 && b>0) {
            d=toplam*0.7;
            System.out.println("Bilet Fiyatiniz:"+d + "\tTL'dir");
        } else if (12>a && c==2 && b>0) {
            d=((toplam/2)*0.8)*2;
            System.out.println("Bilet Fiyatiniz:"+d + "\tTL'dir");
        } else if (a<24 && a>=12 && c==2 && b>0) {
            d=((toplam*0.9)*0.8)*2;
            System.out.println("Bilet Fiyatiniz:"+d + "\tTL'dir");
        }else if (a>24 && c==2 && b>0 && a<=65) {
            d = toplam*0.8;
            System.out.println("Bilet Fiyatiniz:" + d + "\tTL'dir");
        }else if (a>65 && c==2 && b>0) {
            d=((toplam*0.7)*0.8)*2;
            System.out.println("Bilet Fiyatiniz:"+d + "\tTL'dir");
        }else{
            System.out.println("Yanlis Giris Yaptiniz.");
        }
    }
}
