import java.util.Arrays;
import java.util.Scanner;


public class Matriz2x2 {

    public static void main(String[] args) {
        //System.out.printf("Aluno: %-10s | Nota: %5.2f %n", "Andre", 10.0);
        //System.out.printf("Aluno: %-10s | Nota: %5.2f %n", "Guilherme", 7.258);


        int [][] matriz = criarMatriz(3, 3);

        mostrarMatriz(matriz);

    }
    public static int[][] criarMatriz(int tamanhoLinha, int tamanhoColuna) {
        Scanner scanner =  new Scanner(System.in);
        int [][] matriz = new int[tamanhoLinha][tamanhoColuna];
        int numeros;

        // matriz.length = tamanhoLinha
        // matriz[i].length = tamanhoColuna

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                System.out.println("Digite um número inteiro: ");
                numeros = scanner.nextInt();
                System.out.printf("O numero escolhiido foi %30.2f %n", (double) numeros);
                matriz[i][j] = numeros;

            }
        }

        return matriz;
    }

    public static void mostrarMatriz (int [][] matriz) {
        int soma = 0;
        for (int i=0; i < matriz.length; i++){
            for ( int j=0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);

            }
            System.out.printf("\n");
        }
        System.out.println("a soma é: " + soma);
    }



}
