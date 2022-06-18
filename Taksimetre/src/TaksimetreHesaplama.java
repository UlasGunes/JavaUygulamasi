import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double perkm=2.20, total, startprice=10, km;

        Scanner inp=new Scanner(System.in);
        System.out.print("Gidilen mesafeyi KM cinsinden yaziniz:");
        km=inp.nextDouble();
        total=startprice+(perkm*km);
        total=(total<20) ? 20 : total;
        System.out.println("Toplam fiyat:"+total);




    }

}
