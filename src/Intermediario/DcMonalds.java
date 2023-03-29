package Intermediario;
import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String ingredientes = leitor.next();
            String listaIngredientes[] = new String[3];

            listaIngredientes = ingredientes.split(";");
            int i;
            for (i = 0; i < 4; i++) {
                System.out.println(listaIngredientes[i]);
            }
        }
    }
}