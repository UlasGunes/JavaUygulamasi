import java.util.Scanner;
public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        int sayi,k=0,total=0,i;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sectiginiz sayiyi giriniz:");
        sayi= inp.nextInt();
        for (i=0;sayi>0;i++){
            k=sayi%10;
            System.out.println("Sectiginiz sayinin basamaklari sirasiyla\t"+k);
            total=total+k;
            sayi=sayi/10;
        }System.out.println("Basamaklarindaki sayilarin toplami="+total);
        System.out.println("Sectiginiz sayi\t"+ i +"\tbasamaklidir");
    }
}
