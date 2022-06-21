import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Girmek istediginiz yil:");
        a = inp.nextInt();
        if (((a % 400) == 0) && (a>0)) {
            System.out.println(a + "\t bir artik yidir.");
        } else if (((a % 100) == 0) && (a>0)) {
            System.out.println(a + "\t bir artik yil degildir.");
        } else if (((a % 4) == 0) && (a>0)) {
            System.out.println(a + "\tbir artik yildir");
        } else if (a <= 0) {
            System.out.println("Hatali bir yil girdiniz lutfen degistiriniz.");
        } else {
            System.out.println(a + "\t bir artik yil degildir.");
        }
    }
}
