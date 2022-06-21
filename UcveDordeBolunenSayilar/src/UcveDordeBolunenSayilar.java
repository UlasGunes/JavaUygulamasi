import java.util.Scanner;

public class UcveDordeBolunenSayilar {
    public static void main(String[] args) {
        int a, toplam = 0, o, t = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz:");
        a = inp.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 00) {
                t++;
                System.out.println("Tur Sayisi" + t);
                System.out.println("3'e ve 4'e tam bolunen sayilar" + i);
                toplam = toplam + i;
                if (i == a) {
                    o = toplam / t;
                    System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin toplamasi" + toplam);
                    System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin ortalamasi" + o);
                } else if (i == a) {
                    o = toplam / t;
                    System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin toplamasi" + toplam);
                    System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e tam bolunen sayilarin ortalamasi" + o);
                }
            }
        }
    }
}