import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int INC, FIM;
        INC = sc.nextInt();
        FIM = sc.nextInt();

        int duracao;
        if (INC < FIM) {
            duracao = FIM - INC;
        }
        else {
            duracao = 24 - INC + FIM;
        }

        System.out.println("O JOGO DUROU " + duracao + "HORA(S)");

        sc.close();
        }
    }
