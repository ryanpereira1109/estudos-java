import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {

    private List<Produto> listaProdutos = new ArrayList<>();
    private List<Vendas> listaVendas = new ArrayList<>();


    public void adicionarQuantidade(int id, int quantidade) {

        Produto p = buscarPorId(id);

        if (p == null) {
            System.out.println("\n>>> Produto com ID " + id + " não encontrado.");
            return;
        }

        p.setQuantidade(p.getQuantidade() + quantidade);
        System.out.println(quantidade + " unidade(s) de " + p.getNome() + " adicionada(s) com sucesso!");
    }

    public  void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado no estoque.");
            return;
        }
        System.out.println("\n--- LISTA DE PRODUTOS ---");
        for (Produto p : listaProdutos) {
            System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() +" | Preço: R$ " + p.getPreco() + " | Qtd: "+ p.getQuantidade());
        }
    }

    public void adicionarProduto(Produto p) {
        listaProdutos.add(p);
        System.out.println("\n>>> Produto cadastrado com sucesso!");
    }


    public void registrarVenda(int idProduto, int quantidade) {
        Produto p = buscarPorId(idProduto);

        if (p == null) {
            System.out.println("\n>>> Produto com ID " + idProduto + " não encontrado.");
            return;
        }

        if (p.getQuantidade() < quantidade) {
            System.out.println("\n>>> Quantidade insuficiente em estoque! Disponível: " + p.getQuantidade());
            return;
        }


        p.setQuantidade(p.getQuantidade() - quantidade);

        Double valor = quantidade * p.getPreco();


        Vendas venda = new Vendas(p, quantidade , valor);
        listaVendas.add(venda);

        System.out.println(" Venda registrada! valor total: RS" + venda.getValorTotal());
    }

    private Produto buscarPorId(int id) {
        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }




    public void listarVendas() {
        if (listaVendas.isEmpty()) {
            System.out.println("\nNenhuma venda registrada até o momento.");
            return;
        }
        for (Vendas v : listaVendas) {
            System.out.println("ID: " + v.getIdVenda());
            System.out.println ("Produto: " + v.getP().getNome());
            System.out.println("Quantidade: " + v.getQuantidadeVenda());
            System.out.println("Preço: " + v.getValorTotal());
        }
    }

    public void listarProdutosEstoqueBaixo() {

        boolean encontrou = false;
        System.out.println("\n=== RELATÓRIO DE ESTOQUE BAIXO (Abaixo de 5 unidades) ===");
        for (Produto p : listaProdutos) {

            if (p.getQuantidade() < 5) {
                System.out.println("ID: " + p.getId());
                System.out.println("Nome: " + p.getNome());
                System.out.println("Quantidade: " + p.getQuantidade());
                System.out.println("Preço: " + p.getPreco());
                encontrou = true;

            }

        }
        if (!encontrou) {
            System.out.println("Todos os produtos estão com níveis adequados de estoque.");
        }
    }

    public void balancoFinanceiro() {
        double valorTotal = 0;
        for (Produto p : listaProdutos) {
            Double precoUnitario = p.getQuantidade() * p.getPreco();
            System.out.println("Preço total do produto " + p.getNome() + ": " + precoUnitario);
            valorTotal = valorTotal + precoUnitario;


        }

        System.out.println("Dinheiro investido de todos os produtos: " + valorTotal);

    }

}
