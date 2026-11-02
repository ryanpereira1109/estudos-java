import java.util.Scanner;

public class CalculoMedia {
    public static void main (String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = l.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = l.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Média do aluno: "+ media);


        if (media >= 7.0) {
            System.out.println("Situação: Aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Situação: Recuperação!");
        } else {
            System.out.println("Situação: Reprovado!");
        }


        l.close();
    }
}
