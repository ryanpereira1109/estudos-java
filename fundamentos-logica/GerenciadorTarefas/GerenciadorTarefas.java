import java.util.Scanner;
import java.util.*;
public class GerenciadorTarefas {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        int opcao = 0;

        System.out.println(" --- SIMULADOR DE TAREFAS --- ");

        while (opcao != 4) {
            System.out.println(" --- MENU --- ");
            System.out.println(" 1- CRIAR TAREFAS ");
            System.out.println(" 2- LISTAR TAREFAS ");
            System.out.println(" 3- REMOVER TAREFAS ");
            System.out.println(" 4- ENCERRAR");
            System.out.println(" ESCOLHA UMA OPÇÃO: ");
            opcao = l.nextInt();
            l.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa: ");
                    String nomeTarefa = l.nextLine();
                    tarefas.add(nomeTarefa);
                    System.out.println("Tarefa adicionada.");
                    break;

                case 2:
                    System.out.println("TAREFAS ADICIONADAS:");
                    for (String tarefa : tarefas) {
                        System.out.println("- " + tarefa);
                    }

                case 3:
                    System.out.println("Digite o nome da tarefa a ser removida: ");
                    String busca = l.nextLine();
                    if (tarefas.contains(busca)) {
                        tarefas.remove(busca);
                        System.out.println("Sucesso: '" + busca + "' foi encontrada e removida.");
                    } else {
                        System.out.println("Erro: '" + busca + "' não existe na lista.");
                    }
                    break;


                case 4:
                    System.out.println("Encerrando programa..");
                    break;

                default:
                    System.out.println("Digite uma opção valida");
                    break;


            }



        }


    }
}
