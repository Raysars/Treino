import java.util.Scanner;

public class Media8 {
    public static void main(String args[]){

        Scanner num = new Scanner(System.in);
        double [] vetorNumeros = new double[8];
        double numeros = 0;
        double soma;
        double media;

//        for (int i =0; i < 8 ; i++ ){
//            System.out.println("Digite um numero real: ");
//            numeros = num.nextDouble();
//            vetorNumeros[i] = numeros;
//            PrintarVetor(vetorNumeros);
//        }

        double[] novoVetorNumero = criaVetor(6);

        media = calculaMedia(novoVetorNumero);
        System.out.println(media);
    }

    public static double[] criaVetor(int tamanhoVetor) {
        Scanner scanner = new Scanner(System.in);
        double [] vetorNumeros = new double[tamanhoVetor];
        double inputNumero;

        for (int i =0; i < tamanhoVetor ; i++ ){
            System.out.println("Digite um numero real: ");
            inputNumero = scanner.nextDouble();
            vetorNumeros[i] = inputNumero;
            PrintarVetor(vetorNumeros);
        }

        return vetorNumeros;
    }

    public static double calculaMedia(double[] vetor){

        double soma = 0;
        double media = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma/ vetor.length;

        return media;
    }


    public static void PrintarVetor(double[] vetor) {

        for (double item : vetor){
            System.out.printf("%.2f ", item);
        }

        System.out.println();
    }


    /**
    public static void calculoMatemetico(double[] numeross) {
        for (double s : numeross){
        **/

    }

