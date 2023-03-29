package Basico;
import java.util.Scanner;

public class MesadaSobrinho {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada = leitor.nextInt();
            int mesada = 50;
            mesada = entrada * mesada;

            System.out.println(mesada);
        }
    }
}
