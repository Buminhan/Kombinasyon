import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        double a, b, c=1, d=1, e=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kombinasyon hesaplamak için iki sayı giriniz.");
        a = inp.nextDouble();
        b = inp.nextDouble();
        for(int i=1; i <=a; i++){
            c *=i;
        }
        for(int i=1; i <=b; i++){
            d *=i;
        }
        for(int i=1; i <=(a-b); i++){
            e *=i;
        }
        System.out.println("C("+a+","+b+") : "+(c/(d*e)));
    }
}
