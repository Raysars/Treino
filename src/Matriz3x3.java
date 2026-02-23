import java.util.Scanner;

public class Matriz3x3 {

    public static void main(String args[]){
        int [][] matriz3x3 = criandoMatriz(3,3);
        mostrarESomar(matriz3x3);
    }

    public static int [][] criandoMatriz (int tamanhoLinha, int tamanhoColuna){
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int [tamanhoLinha][tamanhoColuna];
        int numeros;

        for (int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Digite um numero inteiro:");
                numeros = scanner.nextInt();
                System.out.printf("O número escolhido foi %d %n", numeros);
                matriz[linha][coluna]=numeros;
            }

        }
        return matriz;
    }


    public static void mostrarESomar (int [][] matriz){

        int soma = 0;
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.printf("%5d", matriz[linha][coluna]);
                soma += matriz[linha][coluna];

            }
            System.out.printf("%n");
        }
        System.out.printf("A soma é igual %d", soma);

    }



}
