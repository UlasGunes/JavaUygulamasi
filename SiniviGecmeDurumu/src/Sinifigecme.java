import java.util.Scanner;
public class Sinifigecme {
    public static void main(String[] args) {
        double mat,fiz,turkce,kimya,muzik,ortalama;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik dersi notunuzu giriniz:");
        mat=inp.nextDouble();
        System.out.print("Fizikdersi notunuzu giriniz:");
        fiz=inp.nextDouble();
        System.out.print("Turkce dersi notunuzu giriniz:");
        turkce=inp.nextDouble();
        System.out.print("Kimya dersi notunuzu giriniz:");
        kimya=inp.nextDouble();
        System.out.print("Muzik dersi notunuzu giriniz:");
        muzik=inp.nextDouble();
        if (mat<0 || mat>100){
            mat=0;
        } else if ((fiz < 0 || fiz > 100)) {
            fiz=0;
        } else if ((turkce<0 || turkce>100)) {
            turkce=0;
        } else if ((kimya<0 || kimya>100)) {
            kimya=0;
        } else if ((muzik<0 || muzik>100)) {
            muzik=0;
        }
        ortalama=(mat+fiz+turkce+kimya+muzik)/5;
        System.out.println("ortalamaniz:"+ortalama);
        if (ortalama>=55){
            System.out.println("Tebrikler sinifi basarili ile gectiniz.");
        }else{
            System.out.println("uzgunum sinifta kaldınız.");
        }

    }
}
