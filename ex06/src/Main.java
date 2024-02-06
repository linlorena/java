//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C, TRI, CIR, TRA, QUA, RET;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        TRI = A*C / 2.0;
        CIR = 3.14159 * C * C;
        TRA = (A+B) / 2.0 * C;
        QUA = B*B;
        RET = A*B;

        System.out.printf("TRI: %.3f%n", TRI);
        System.out.printf("CIR: %.3f%n", CIR);
        System.out.printf("TRA: %.3f%n", TRA);
        System.out.printf("QUA: %.3f%n", QUA);
        System.out.printf("RET: %.3f%n", RET);

        sc.close();
        }
    }
