import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args){

        // Leia um número real e mostre o valor ao quadrado e ao cubo.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do Denominador: ");
        double denominador = teclado.nextDouble();
        System.out.println("Digite o valor do expoente: ");
        double expoente = teclado.nextDouble();



        double resultado = Math.pow(denominador, expoente);

        System.out.println(resultado);




        //System.out.println("Digite o valor do Area do expoente: ");
        //double areaExpoente = teclado.nextDouble();





    }
}
