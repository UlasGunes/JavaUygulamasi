import java.util.Scanner;

public class islem {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat= inp.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik=inp.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();
        System.out.print("Turkce Notunuz:");
        turkce=inp.nextInt();
        System.out.print("Tarih Notunuz:");
        tarih=inp.nextInt();
        System.out.print("Müzik Notunuz:");
        muzik=inp.nextInt();

        double Not_Ortalamanız = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        boolean kosul=Not_Ortalamanız>=60;
        System.out.println("Ortalamaniz: "+Not_Ortalamanız);
        System.out.println(Not_Ortalamanız>=60 ? "\nSinifi Gectiniz" : "\nSinifte Kaldınız");


    }
}
