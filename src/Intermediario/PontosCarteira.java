package Intermediario;
import java.util.Scanner;

public class PontosCarteira {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int velocidade = leitor.nextInt();
            int multas = leitor.nextInt();
            final int VELOCIDADE_LIMITE = 80;

            if (velocidade > VELOCIDADE_LIMITE) {
                multas = multas + 1;
            }
            if (multas < 3) {
                System.out.println(multas + " multas. Nao levou pontos na carteira");
            } else {
                System.out.println(multas + " multas. Levou pontos na carteira");
            }
        }
    }
}
