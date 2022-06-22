import java.util.Scanner;

public class TekSayideBoz {
    public static void main(String[] args) {
        int a, total = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Lutfen bir sayi giriniz:");
            a = inp.nextInt();
            if (a % 4 == 0) {
                total = a + total;
            }
        } while ((a % 2) == 0);
        System.out.println("Girdiginiz sayiler icerisinde 2 ve 4'un katlari olan sayilerin toplami=" + total);
    }
}
