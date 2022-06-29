import java.util.Scanner;
public class Terscevirme {
    public static void main(String[] args) {
        int n, i, c = 0, number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ters cevirmek istediginiz sayiyi giriniz:");
        n = inp.nextInt();
        number = n;
        for (i = 0; n > 0; i++) {
            n = n / 10;
        }System.out.println("sectiginiz sayi " +i+ " basamaklidir");
        for (; i > 0; i--) {
            c = number % 10;
            number = number / 10;
            System.out.print(c);
        }
    }
}
