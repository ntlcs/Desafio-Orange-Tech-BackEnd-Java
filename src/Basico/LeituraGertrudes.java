package Basico;
import java.util.Scanner;

public class LeituraGertrudes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int paginas = leitor.nextInt();
            int paginasLidas = 3;
            int dias = paginas / paginasLidas;

            System.out.println(dias + " dias");
        }
    }
}
