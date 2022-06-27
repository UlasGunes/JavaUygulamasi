import java.util.Scanner;
public class Mukemmel {
    public static void main(String[] args) {
        int a,n=0;
        int i;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        a= inp.nextInt();
        for (i=1; i<a; i++) {
            if (a % i == 0)
                n=i+n;
        }
        if (n==a)
            System.out.println("sectiginiz sayi mukemmel sayidir");
        else
            System.out.println("sectiginiz sayi mukemmel sayi degildir.");
            System.out.println("Tam bolunen sayilarin toplami="+n);
        }
    }
