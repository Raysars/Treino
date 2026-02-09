import java.util.Scanner;

public class Perimetro {
    public static  void main(String args[]){

        // 3. Leia base e altura de um retângulo e calcule área e perímetro.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base do retangulo:");
        double base = teclado.nextDouble();
        System.out.println("Digite a altura do retangulo:");
        double altura = teclado.nextDouble();

        double perimetro = base*altura;

        System.out.println("Essa é a area do retangulo: " + perimetro);




    }
}
