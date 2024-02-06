import java.util.Locale;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, P = 3.14159;
        R = sc.nextDouble();

        A = P*(R*R);

        System.out.printf("A=%.4f%n", A);




        sc.close();
        }
    }