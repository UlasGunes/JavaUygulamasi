import java.util.Scanner;

public class KDV_Tutari_Hesaplama {
    public static void main(String[] args) {
        //KDV'siz=10 KDV'li=11 KDVtutarı=1.8 şeklinde bir program yazılması planlanmaktadır.
        Scanner inp=new Scanner(System.in);
        double tutar, kdvli, kdvsiz, kdv, kdvtutari;

        System.out.print("verilen tutar:");
        tutar=inp.nextDouble();
        kdv=0.18;
        kdvli= tutar+(tutar*kdv);
        kdvtutari= tutar*kdv;

        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV'li tutar:"+kdvli);
        System.out.println("KDV Tutari:"+kdvtutari);
        System.out.println("KDV Orani:"+kdv);

    }
}
