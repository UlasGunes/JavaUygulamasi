import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n,i,n1=0,n2=1,n3=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Fibonacci Eleman Sayisini giriniz:");
        n= inp.nextInt();
        for (i=1;i<=n;i++) {
            n3=n1+n2;
            n2=n1;
            n1=n3;
            System.out.print(n3 + ",");
        }
    }
}
