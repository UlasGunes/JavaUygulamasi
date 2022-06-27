import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args) {
        int number, n = 0, i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen asal sayi testine sokmak istediginiz sayiyi giriniz:");
        number = inp.nextInt();
        for (i = 1; i <= number; i++) {
            if (number % i == 0)
                n = n + i;
                if (n - number == 1)
                    System.out.println("Sectiginiz sayi asal bir sayidir.");
        }if (n - number != 1)
        System.out.println("Sectiginiz sayi bir asal sayi degildir.");
    }
}
