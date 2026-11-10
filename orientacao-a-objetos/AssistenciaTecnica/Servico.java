public class Servico {
    private String nome;
    private String modeloAparelho;
    private String descricao;
    private int numServico;
    private String status;
    private static int contadorId = 0;
    private double valorServico;

    public Servico(String nome, String modeloAparelho, String descricao) {
        contadorId++;
        this.nome = nome;
        this.modeloAparelho = modeloAparelho;
        this.descricao = descricao;
        this.numServico = contadorId;
        this.status = ("EM  ANALISE");

    }

    public void cobrarValor(double valorCobrado) {
       this.valorServico = valorCobrado;

    }

    public String getNome() {
        return nome;
    }

    public String getModeloAparelho() {
        return modeloAparelho;
    }

    public int getNumServico() {
        return numServico;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
