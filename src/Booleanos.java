import java.util.Scanner;

public class Booleanos {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite true ou false: ");
        boolean a = input.nextBoolean();

        System.out.println("Digite true ou false: ");
        boolean b = input.nextBoolean();

        System.out.println("Digite true ou false: ");
        boolean c = input.nextBoolean();

        boolean resultado = (a && b) || (!c);

        System.out.println("O resultador é: " + resultado);









    }
}
