import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int a,b,x,total=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Ussu alinacak sayi=");
        a= inp.nextInt();
        System.out.print("us olacak sayi=");
        b= inp.nextInt();
        for (x=1; x<=b; x++){
            total=total*a;
        }
        System.out.println("Sonuc="+total);
    }
}
