package Intermediario;
import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String frase = leitor.next();

            System.out.println(reformularInformaçoes(frase));
        }
    }

    public static String reformularInformaçoes(String informacao) {
        String array[] = new String[3];
        array = informacao.split("/");
        return "Imovel: " + array[0].concat(" R$") + array[1].concat(" ") + array[2];
    }
}