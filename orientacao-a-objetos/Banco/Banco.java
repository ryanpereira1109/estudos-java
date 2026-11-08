import java.util.Scanner;


public class Banco {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        int opcao = 0;


        exibirCabecalho();

        ContaBancaria c = cadastro(l);

        while (opcao != 4) {
            exibirMenu();
            System.out.println("--- SALDO ATUAL: " + c.getSaldo());
            opcao = l.nextInt();

            switch (opcao) {
              case 1 -> {
                  executarSaque(l,c);
              }

              case 2 -> {
                  executarDeposito(l,c);

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

    private static void exibirCabecalho() {
        System.out.println("=======================================");
        System.out.println("         SISTEMA BANCÁRIO JAVA         ");
        System.out.println("=======================================");
    }

    private static void exibirMenu() {
        System.out.println("\n---------------------------------------");
        System.out.println("1 - Realizar Saque");
        System.out.println("2 - Realizar Depósito");
        System.out.println("3 - Consultar Extrato");
        System.out.println("4 - Sair");
        System.out.println("---------------------------------------");

    }

    public static ContaBancaria cadastro(Scanner l) {
        System.out.println("--- SEJA BEM VINDO AO BANCO ---");
        System.out.println("--- FAÇA SEU LOGIN ---");
        System.out.println("--- NOME ---");
        String nome = l.nextLine();
        System.out.println("--- CPF ---");
        String cpf = l.nextLine();

        return new ContaBancaria(nome ,1 , cpf);

    }

    public static void executarSaque (Scanner l , ContaBancaria c) {
        System.out.println("--- DIGITE O VALOR DO SAQUE ---");
        Double saque = l.nextDouble();
        c.sacar(saque);
    }

    public static void executarDeposito (Scanner l , ContaBancaria c) {
        System.out.println("--- DIGITE O VALOR DO DEPOSITO ---");
        Double deposito = l.nextDouble();
        c.depositar(deposito);
    }
}
