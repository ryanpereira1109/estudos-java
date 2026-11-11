import java.util.ArrayList;
import java.util.List;


public class GerenciadorServicos {
    private List<Servico> listaServicos = new ArrayList<>();

    private Servico buscarPorId(int id) {
        for (Servico s : listaServicos) {
            if (s.getNumServico() == id) {
                return s;
            }
        }
        return null;
    }

    public void avaliarServico (int id , double valor) {
        Servico s = buscarPorId(id);

        if (s == null) {
            System.out.println("\n>>> Produto com OS " + id + " não encontrado.");
            return;
        }

        s.cobrarValor(valor);
        System.out.println("Serviço avaliado em: RS" + valor);


    }

    public void atualizarStatus (int id , String status) {
        Servico s = buscarPorId(id);
        if (s == null) {
            System.out.println("\n>>> Serviço com OS " + id + " não encontrado.");
            return;
        }
        s.setStatus(status);
        System.out.println("Status do serviço atualizado:" + status);


    }

    public void adicionarServico(Servico s) {
        listaServicos.add(s);
        System.out.println("\n>>> Serviço cadastrado com sucesso!");

    }

    public void listarServicos () {
        if (listaServicos.isEmpty()) {
            System.out.println("\nNenhum serviço cadastrado");
            return;
        }

        System.out.println("\n--- LISTA DE SERVIÇOS---");

        for (Servico s : listaServicos) {
            if (!"ENTREGUE".equalsIgnoreCase(s.getStatus())) {
                System.out.println("Numero de serviço: " + s.getNumServico() + " | Aparelho: " + s.getModeloAparelho() +" | Valor cobrado: R$ " + s.getValorServico() + " | Status: " + s.getStatus());
            } else {
                System.out.println("Todos serviços entregues");
            }


        }

    }

    public void entregarServico (int id) {
        Servico s = buscarPorId(id);

        if (s == null) {
            System.out.println("\n>>> Serviço com OS " + id + " não encontrado.");
            return;
        }
        s.setStatus("ENTREGUE");
        System.out.println("Serviço de ID: " + id+ " entregue");
        System.out.println("Nome do aparelho: " + s.getModeloAparelho());
        System.out.println("Descrição: " + s.getDescricao());
        System.out.println("Valor total: " + s.getValorServico());
        System.out.println("O pedido foi finalizado.");


    }

}
