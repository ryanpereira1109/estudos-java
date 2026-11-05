import java.util.*;

public class ContaBancaria {

    private String titular;
    private int numConta;
    private String cpf;
    private Double saldo;
    private List<Transacao> historico;

    public ContaBancaria(String titular, int numConta , String cpf) {
        this.titular = titular;
        this.numConta = numConta;
        this.cpf = cpf;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar (Double valor) {
        this.saldo = saldo + valor;
        Transacao t = new Transacao("Deposito" , valor);
        historico.add(t);
        System.out.println("Transação feita com sucesso.");
    }

    public void sacar (Double valor) {

        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
            Transacao t = new Transacao("Saque" , valor);
            historico.add(t);
            System.out.println("Transação feita com sucesso.");
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void exibirExtrato () {
        System.out.println("--- EXTRATO BANCÁRIO ---");

        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao t : historico) {
                System.out.println("--- TIPO DA TRANSIÇÃO ---");
                System.out.println(t.getTipo());
                System.out.println("--- VALOR DA TRANSIÇÃO ---");
                System.out.println(t.getValor());
                System.out.println("------------------------\n");
            }
        }
    }
}
