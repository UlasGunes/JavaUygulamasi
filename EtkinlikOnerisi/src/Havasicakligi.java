import java.util.Scanner;
public class Havasicakligi {
    public static void main(String[] args) {
        double s;
        Scanner inp=new Scanner(System.in);
        System.out.print("Oneri almak icin hava sicakligini giriniz:");
        s= inp.nextDouble();
        if (s<=5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (s>5 && s<=15 ) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (s>15 && s<=25) {
            System.out.println("Piknige gidebilirsiniz.");
        } else if (s>25) {
            System.out.println("Hava cok guzel yuzmeye git.");
        }

    }
}
