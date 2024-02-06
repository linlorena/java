//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int m;
        m = sc.nextInt();
        System.out.println("Vc digitou: " + m);

        double a;
        a = sc.nextDouble();
        System.out.println("Vc digitou: " + a);

        char z;
        z = sc.next().charAt(0);
        System.out.println("Vc digitou: " + z);

        String p;
        int q;
        double r;
        p = sc.next();
        q = sc.nextInt();
        r = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        sc.close();

        }
    }
