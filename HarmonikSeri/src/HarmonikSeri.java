import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        double total=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Harmonik Seriyi Hesaplamak icin N degerinin giriniz:");
        n= inp.nextInt();
        for (double i=1;i<=n;i++){
            total=total+1/i;
        }
        System.out.println("Girdiginiz degerin harmonik seri sonucu="+total);
    }
}
