package Basico;
import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        int i = 0;
        while (i < tamanho) {
            System.out.print("/");
            i = i + 1;
        }
    }
}


