import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        int opcao = 0;

        System.out.println("--- SEJA BEM VINDO AO BANCO ---");
        System.out.println("--- FAÇA SEU LOGIN ---");
        System.out.println("--- NOME ---");
        String nome = l.nextLine();
        System.out.println("--- CPF ---");
        String cpf = l.nextLine();
        ContaBancaria c = new ContaBancaria( nome, 1 , cpf);

        while (opcao != 4) {
            System.out.println("--- SEJA BEM VINDO AO BANCO ---");
            System.out.println("--- ESCOLHA A OPÇÃO DESEJADA: ---");
            System.out.println("--- 1 - SAQUE ---");
            System.out.println("--- 2 - DEPOSITO ---");
            System.out.println("--- 3 - EXTRATO BANCÁRIO ---");
            System.out.println("--- 4 - SAIR ---");
            System.out.println("--- SALDO ATUAL: " + c.getSaldo());
            opcao = l.nextInt();

            switch (opcao) {
              case 1 -> {
                  System.out.println("--- DIGITE O VALOR DO SAQUE ---");
                  Double saque = l.nextDouble();
                  c.sacar(saque);
              }

              case 2 -> {
                  System.out.println("--- DIGITE O VALOR DO DEPOSITO ---");
                  Double deposito = l.nextDouble();
                  c.depositar(deposito);

              }

              case 3 -> {
                  c.exibirExtrato();
              }

              case 4 -> {
                  break;
              }

              default -> {
                  System.out.println("--- DIGITE UMA OPÇÃO VALIDA ---");
              }

            }
        }




    }
}
