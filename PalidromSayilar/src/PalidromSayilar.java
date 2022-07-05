import java.util.Scanner;

public class PalidromSayilar {
    static boolean isTest(int number) {
        int temp = number, ters = 0, son;
        while (temp != 0) {
            son = temp % 10;
            ters = (ters * 10) + son;
            temp /= 10;
        }
        if (number == ters) {
            System.out.println("Girdiginiz Sayi Bir Palidrom Sayidir");
            return true;
        } else {
            System.out.println("Girdiginiz Sayi Bir Palidrom Sayi Degildir");
            return false;
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Palidrom testi icin lutfen bir sayi giriniz:");
        number = inp.nextInt();
        System.out.println(isTest(number));

    }
}
