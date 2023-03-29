package Basico;
import java.util.Scanner;

public class LojinhaDoces {
   
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int doces = 2 *  dinheiro;
        
        System.out.println("O cliente obteve " + doces + " doces");
        }}


