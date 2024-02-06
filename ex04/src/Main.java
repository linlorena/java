import java.util.Locale;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NUM, HORAS;
        double VALOR, SAL;

        NUM = sc.nextInt();
        HORAS = sc.nextInt();
        VALOR = sc.nextDouble();

        SAL = HORAS*VALOR;

        System.out.println("NUMBER = " + NUM);
        System.out.printf("SALARY = U$ %.2f%n", SAL);

        sc.close();

        }
    }
