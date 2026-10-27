
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtde = 5;
        int numeros[] = new int[qtde];
        int soma = 0;
        double media;
        
        //entrada
        for (int i = 0; i < qtde; i++) {
            numeros[i] = leia.nextInt();
        }
        //processamento
        for (int i = 0; i < qtde; i++) {
            soma = soma + numeros[i];
        }
        media = (double)soma / qtde;
        
        //saída
        System.out.printf("A soma é %d e a média é %.2f\n", soma, media);
    }
}
