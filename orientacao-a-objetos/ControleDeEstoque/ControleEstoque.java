
import java.util.Scanner;


public class ControleEstoque {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        GerenciadorEstoque g = new GerenciadorEstoque();

        int opcao = 0;

        exibirCabecalho();



        while (opcao != 8) {
            exibirMenu();
            opcao = l.nextInt();
            l.nextLine();
            switch (opcao) {
                case 1 -> {
                    Produto p = cadastrarProduto(l);
                    g.adicionarProduto(p);
                }

                case 2 -> {
                   g.listarProdutos();
                }

                case 3 -> {
                    addQuantidade(l , g);
                }

                case 4 -> {
                    addVenda(l , g);
                }

                case 5 -> {
                    g.listarProdutosEstoqueBaixo();
                }

                case 6 -> {
                    g.balancoFinanceiro();
                }

                case 7 -> {
                    g.listarVendas();
                }

                case 8 -> {
                    System.out.println("Encerrando programa");
                }

                default -> {
                    System.out.println("Opção invalida");
                }
            }
        }



    }

    public static void exibirCabecalho() {
        System.out.println("=============================");
        System.out.println("---- CONTROLE DE ESTOQUE -----");
        System.out.println("=============================");
    }

    public static void exibirMenu() {
        System.out.println("1 - CADASTRAR PRODUTOS");
        System.out.println("2 - LISTAR PRODUTOS");
        System.out.println("3 - ADICIONAR QUANTIDADE");
        System.out.println("4 - CADASTRAR VENDAS");
        System.out.println("5 - ESTOQUE CRITICO");
        System.out.println("6 - BALANÇO FINANCEIRO");
        System.out.println("7 - LISTAS DE VENDAS");
        System.out.println("8 - SAIR");
        System.out.println("ESCOLHA A OPÇÃO DESEJADA:");

    }

    public static Produto cadastrarProduto(Scanner l) {
       System.out.println("Digite o nome do produto: ");
       String nome = l.nextLine();
       System.out.println("Digite o preco do produto: ");
       Double preco = l.nextDouble();
       System.out.println("Digite a quantidade do produto: ");
       int quantidade = l.nextInt();

       return new Produto(nome, preco, quantidade);

    }

    public static void addQuantidade(Scanner l , GerenciadorEstoque g) {
        System.out.println("Digite o ID do produto: ");
        int id = l.nextInt();
        System.out.println("Digite a quantidade para adicionar ao produto: ");
        int quantidade = l.nextInt();

        g.adicionarQuantidade(id , quantidade);
    }

    public static void addVenda(Scanner l , GerenciadorEstoque g) {
        System.out.println("Digite o ID do produto: ");
        int id = l.nextInt();
        System.out.println("Digite a quantidade vendida do produto: ");
        int quantidade = l.nextInt();

        g.registrarVenda(id , quantidade);
    }


}
