import java.util.ArrayList;
import java.util.List;

public class SistemaFintech {
    private List<ContaBancaria> contas;

    // Construtor
    public SistemaFintech() {
        contas = new ArrayList<>();
    }

    // Métodos para adicionar diferentes tipos de contas
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void adicionarCartao(cartao cartao) {
        contas.add(cartao);
    }

    public void adicionarFatura(Fatura fatura) {
        contas.add(fatura);
    }

    public void adicionarInvestimento(Investimento investimento) {
        contas.add(investimento);
    }

    // Método para exibir todas as contas
    public void exibirContas() {
        for (ContaBancaria conta : contas) {
            conta.exibirdados();
            System.out.println("----------------------------");
        }
    }
}
