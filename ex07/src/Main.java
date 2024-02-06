import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NUM;
        NUM = sc.nextInt();

        if (NUM >= 0){
          System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        }
    }
