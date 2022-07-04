import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {

        int n,i,times=0, times1=0 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sinir Degerini Giriniz:");
        n = inp.nextInt();
        for (i = 1; i <= n; i = i * 4) {
            System.out.println("Dordun "+ times + "." + "Kuvveti Olan Sayi:" + i);
            times++;
        }
        System.out.println("-------------------------------BUNDAN SONRAKI ADIM BESIN KUVVETLERI ICIN YAPILACAKTIR--------------------");
        for (i = 1; i <= n; i = i * 5) {
            System.out.println("Besin " + times1+ "." + "Kuvveti olan sayi:" + i);
            times1++;
        }
        System.out.println("Program Bitti...");
    }
}
