import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        // CRIANDDO OBJETO SCANNER
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("DIGITE SEU NOME :");
        String nome = scanner.next();

        System.out.println("DIGITE SEU SOBRENOME :");
        String sobrenome = scanner.next();

        System.out.println("DIGITE SUA IDADE :");
        int idade = scanner.nextInt();

        System.out.println("DIGITE SUA ALTURA :");
        double altura = scanner.nextDouble();

        System.out.println("Seja bem vinda : " + nome);

    }

}