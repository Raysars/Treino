import java.util.Scanner;

public class Diagonal3x3 {
    public static void main(String args[]) {
        int [][] matriz3x3 = criarMatriz(3,3);
        imprimirDiagonal(matriz3x3);
        int resultado =  Soma(matriz3x3);

        System.out.printf("Esse é o resultado da soma da Diagonal %d", resultado);
        
    }

    public static int [][] criarMatriz(int linha, int coluna){
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[linha][coluna];
        int inteiro;

        for (linha = 0; linha < matriz.length; linha++){
            for(coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite um número inteiro:");
                inteiro = scanner.nextInt();
                matriz[linha][coluna] = inteiro;
            }
        }


        return matriz;
    }

    public static void imprimirDiagonal(int [][] matriz){

        for (int linha = 0; linha < matriz.length; linha++){
            System.out.printf("%5d", matriz[linha][linha]);
        }

        System.out.println();

    }

    public static int Soma (int [][] matriz){
        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            soma += matriz[linha][linha];
        }

        return soma;
    }
}
