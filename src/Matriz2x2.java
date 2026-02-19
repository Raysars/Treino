import java.util.Scanner;


public class Matriz2x2 {

    public static void main(String args[]) {

        int [][] matriz = new int [2][2];

    }
    public static int[][] criarMatriz(int tamanhoVetor) {
        Scanner scanner =  new Scanner(System.in);
        int [][] matriz = new int[2][2];
        int numeros;

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                System.out.println("Digite um número inteiro: ");
                numeros = scanner.nextInt();
                matriz[i][j] = numeros;

            }
        }

        return matriz;
    }

    public static void mostrarMatrix () {
        
    }



}
