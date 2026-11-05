public class Transacao {
    private String tipo;
    private Double valor;


    public Transacao(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;

    }

    public String getTipo() {
        return tipo;
    }


    public Double getValor() {
        return valor;
    }




}
