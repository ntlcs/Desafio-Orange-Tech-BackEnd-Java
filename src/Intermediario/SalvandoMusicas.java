package Intermediario;
import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String arquivoDoPc = leitor.next();

            if (verificarMusica(arquivoDoPc) == true) {
                System.out.println("Salvar");
            } else {
                System.out.println("Deletar");
            }
        }

    }

    public static boolean verificarMusica(String arquivo) {
        if (arquivo.contains(".mp3")) {
            return true;
        } else {
            return false;
        }
    }
}