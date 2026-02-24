import java.util.Scanner;

public class Contagem10 {

    public static void main (String[] args){

        int [][] matriz3x3 = criandoMatriz(3,3);

        mostrarMatriz(matriz3x3);

        int linha = 0; int coluna =0;
        int contador = 0;
        for (linha = 0; linha < matriz3x3.length; linha++) {
            for (coluna = 0; coluna < matriz3x3[linha].length; coluna++){
                if (matriz3x3[linha][coluna] > 10) {
                    contador++;
                    //System.out.println("Elemento [" + linha + "][" + coluna + "] = " + matriz3x3[linha][coluna]);
                    System.out.printf("Elemento[%d][%d] = %d%n", linha, coluna, matriz3x3[linha][coluna]);
                }
            }
        }
        System.out.println();
        System.out.println("A quantidade de elementos maior que 10 é: " + contador);
        System.out.println();
    }


    public static int [][] criandoMatriz (int linha, int coluna) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[linha][coluna];
        int numero = 0;

        for (linha = 0; linha < matriz.length; linha++){
            for (coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite um número inteiro: ");
                numero = scanner.nextInt();
                matriz[linha][coluna] = numero;
            }
        }



        return matriz;
    }

    public static void mostrarMatriz (int [][] matriz3x3) {
        int soma = 0;
        for (int linha=0; linha < matriz3x3.length; linha++){

            for ( int coluna=0; coluna < matriz3x3[linha].length; coluna++) {
                System.out.printf("%4d", matriz3x3[linha][coluna]);

            }
            System.out.print("\n");
        }

    }


}
