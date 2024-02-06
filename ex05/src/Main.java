import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double COD1, NUM1, VALOR1, COD2, NUM2, VALOR2, SOMA;

        COD1 = sc.nextByte();
        NUM1 = sc.nextByte();
        VALOR1 = sc.nextDouble();
        COD2 = sc.nextByte();
        NUM2 = sc.nextByte();
        VALOR2 = sc.nextDouble();

        SOMA = (VALOR1*NUM1) + (VALOR2*NUM2);

        System.out.printf("VALOR A SER PAGO: R$%.2f%n", SOMA);

        }
    }
