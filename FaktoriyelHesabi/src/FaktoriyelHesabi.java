import java.util.Scanner;
public class FaktoriyelHesabi {
    public static void main(String[] args) {
        int n,r,a,i,t=1,tr=1,tf=1,b,f;
        Scanner inp=new Scanner(System.in);
        System.out.print("N degerini giriniz:");
        n= inp.nextInt();
        System.out.print("r degerini giriniz:");
        r= inp.nextInt();
        for (i=1;i<=n;i++){
            t=t*i;
        }System.out.println("n!="+t);
        for (a=1;a<=r;a++){
            tr= tr*a;
        }System.out.println("r!="+tr);
        for (b=1;b<=(n-r);b++){
            tf=tf*b;
        }System.out.println("n-r!="+tf);
        f=t/(tr*tf);
        System.out.println(n+"\tdegerinin\t"+r+"\tli kombinasyonunun sonucu\t"+f);
    }

}
