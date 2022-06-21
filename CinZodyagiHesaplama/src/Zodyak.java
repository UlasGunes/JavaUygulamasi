import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        int y, a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen cin zodyaginizi ogrenmek icin dogum yilinizi giriniz: ");
        y = inp.nextInt();
        a = y % 12;
        if (a == 0) {
            System.out.println("Cin zodyaginiz MAYMUN'dur.");
        } else if (a == 1) {
            System.out.println("Cin zodyaginiz HOROZ'dur");
        } else if (a == 2) {
            System.out.println("Cin zodyaginiz KOPEK'dur");
        } else if (a == 3) {
            System.out.println("Cin zodyaginiz DOMUZ'dur");
        } else if (a == 4) {
            System.out.println("Cin zodyaginiz FARE'dur");
        } else if (a == 5) {
            System.out.println("Cin zodyaginiz OKUZ'dur");
        } else if (a == 6) {
            System.out.println("Cin zodyaginiz KAPLAN'dur");
        } else if (a == 7) {
            System.out.println("Cin zodyaginiz TAVSAN'dur");
        } else if (a == 8) {
            System.out.println("Cin zodyaginiz EJDERHA'dur");
        } else if (a == 9) {
            System.out.println("Cin zodyaginiz YILAN'dur");
        } else if (a == 10) {
            System.out.println("Cin zodyaginiz AT'dur");
        } else if (a == 11) {
            System.out.println("Cin zodyaginiz KOYUN'dur");
        } else {
            System.out.println("Hatali bir deger girdiniz.");
        }
    }
}
