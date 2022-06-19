import java.util.Scanner;
public class KitleIndeksi {
    public static void main(String[] args) {
        //Kitle İndeksi Hesaplama
        double boy,kilo,indeks;
        Scanner inp=new Scanner(System.in);
        System.out.print("Guncel Kilonuzu (kg) Giriniz:");
        kilo= inp.nextDouble();
        System.out.print("Boyunuzu m Olarak Giriniz:");
        boy=inp.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz:"+indeks);
    }
}
