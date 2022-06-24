import java.util.Scanner;
public class YildizlarUcgeni {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Olusturmak istediginiz basamak sayisini seciniz:");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space >= 0; space--) {
                System.out.print(" ");
            }for (int y = 1; y <= 2 * i - 1; y++)
                System.out.print("*");
            System.out.println("");
        }for (int k = 1; k <= n; k++) {
            for (int space = 0; space <= k; space++) {
                System.out.print(" ");
            }for (int t=1;t<=2*(n-k)-1;t++){
                System.out.print("*");
            }System.out.println("");
        }
    }
}