import java.util.ArrayList;
import java.util.List;

public class Vendas {
    private Produto p;
    private int idVenda;
    private static int contadorId = 0;
    private int quantidadeVenda;
    private Double valorTotal;



    public Vendas(Produto p, int quantidadeVenda, Double valorTotal) {
        this.p = p;
        contadorId++;
        this.idVenda = contadorId;
        this.quantidadeVenda = quantidadeVenda;
        this.valorTotal = valorTotal;


    }



    public int getIdVenda() {
        return idVenda;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Produto getP() {
        return this.p;
    }



}
