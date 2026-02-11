import java.util.Scanner;



public class ReajusteSalarial {
    public static void main (String args[]) {
        Scanner salario = new Scanner (System.in);
        System.out.println("Digite seu salário: ");
        double salarioInicial = salario.nextDouble();
        double salarioAtualizado = 0;
        double porcentagemAumento = 0;
        String aumento = "";

        if ( salarioInicial <= 2.000 && salarioInicial > 0) {
            porcentagemAumento = salarioInicial * 0.10;
            salarioAtualizado = salarioInicial + porcentagemAumento;
            aumento = "10%";

        } else if ( salarioInicial > 2.000 ){
            porcentagemAumento = salarioInicial * 0.05;
            salarioAtualizado = salarioInicial + porcentagemAumento;
            aumento = "5%";

        } else if ( salarioInicial <=0){
            System.out.println("Salário Inválido");
        }


        if (salarioInicial >= 1) {
        System.out.println("O salário antigo é: " + salarioInicial);
        System.out.println("O aumento foi de: " + aumento);
        System.out.println("O aumento foi de: " + porcentagemAumento);
        System.out.println("O salário atualizado é: " + salarioAtualizado);}






    }
}
