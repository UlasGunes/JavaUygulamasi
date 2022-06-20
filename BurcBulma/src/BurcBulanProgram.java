import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int a, g;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogdunuz ayi giriniz(1-12):");
        a = inp.nextInt();
        System.out.print("Dogdunuz gunu giriniz:");
        g = inp.nextInt();
        if (a == 1) {
            System.out.println("Ocak ayinda dogdunuz");
            if (g <= 21 && g >= 1) {
                System.out.println("Oglak burcusunuz");
            } else if (g > 21 && g <= 31) {
                System.out.println("Kova Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 2) {
            System.out.println("Subat ayinda dogdunuz");
            if (g <= 19 && g >= 1) {
                System.out.println("Kova burcusunuz");
            } else if (g > 19 && g <= 28) {
                System.out.println("Balık Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 3) {
            System.out.println("Mart ayinda dogdunuz");
            if (g <= 20 && g >= 1) {
                System.out.println("Balik burcusunuz");
            } else if (g > 20 && g <= 31) {
                System.out.println("Koc Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        }else if (a == 4) {
            System.out.println("Nisan ayinda dogdunuz");
            if (g <= 20 && g >= 1) {
                System.out.println("Koc burcusunuz");
            } else if (g > 20 && g <= 30) {
                System.out.println("Boga Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 5) {
            System.out.println("Mayıs ayinda dogdunuz");
            if (g <= 22 && g >= 1) {
                System.out.println("Boga burcusunuz");
            } else if (g > 22 && g <= 31) {
                System.out.println("ikizler Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        }else if (a == 6) {
            System.out.println("Haziran ayinda dogdunuz");
            if (g <= 22 && g >= 1) {
                System.out.println("ikizler burcusunuz");
            } else if (g > 22 && g <= 30) {
                System.out.println("Yengec Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 7) {
            System.out.println("Temmuz ayinda dogdunuz");
            if (g <= 22 && g >= 1) {
                System.out.println("Yengec burcusunuz");
            } else if (g > 22 && g <= 31) {
                System.out.println("Aslan Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        }else if (a == 8) {
            System.out.println("Agustos ayinda dogdunuz");
            if (g <= 23 && g >= 1) {
                System.out.println("Aslan burcusunuz");
            } else if (g > 23 && g <= 31) {
                System.out.println("Basak Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 9) {
            System.out.println("Eylul ayinda dogdunuz");
            if (g <= 23 && g >= 1) {
                System.out.println("Basak burcusunuz");
            } else if (g > 23 && g <= 30) {
                System.out.println("Terazi Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 10) {
            System.out.println("Ekim ayinda dogdunuz");
            if (g <= 23 && g >= 1) {
                System.out.println("Terazi burcusunuz");
            } else if (g > 23 && g <= 31) {
                System.out.println("Akrep Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        }else if (a == 11) {
            System.out.println("Kasım ayinda dogdunuz");
            if (g <= 21 && g >= 1) {
                System.out.println("Akrep burcusunuz");
            } else if (g > 21 && g <= 30) {
                System.out.println("Yay Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        } else if (a == 12) {
            System.out.println("Aralik ayinda dogdunuz");
            if (g <= 21 && g >= 1) {
                System.out.println("Yay burcusunuz");
            } else if (g > 20 && g <= 31) {
                System.out.println("Oglak Burcusunuz");
            } else {
                System.out.println("Gecersiz bir deger girdiniz");
            }
        }else{
            System.out.println("Gecersiz bir deger girdiniz tekrar deneyiniz");
        }
    }
}