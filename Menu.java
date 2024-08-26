import java.util.Scanner;

public class Menu {
    private SistemaFintech  sistemaFintech;
    private Scanner scanner;

    public Menu(){
        sistemaFintech = new SistemaFintech();
        scanner = new Scanner(System.in);

    }
    public void exibirMenu(){
        int opcao = 0;
        do {
System.out.println("Menu Principal");
System.out.println("1- Adicionar Conta");
System.out.println("2- Adicionar Cartão");
System.out.println("3- Adicionar Fatura");
System.out.println("4- Adiconar Investimento");
System.out.println("5- Exibir contas");
System.out.println("0- Sair");
opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarConta();
                    break;
                case 2:
                    adicionarCartao();
                    break;
                case 3:
                    adicionarFatura();
                    break;
                case 4:
                    adicionarInvestimento();
                    break;
                case 5:
                    exibirContas();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 6);
    }

    // Métodos para adicionar e exibir informações

    private void adicionarConta() {
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.next();
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial);
        sistemaFintech.adicionarConta(conta);
        System.out.println("Conta bancária adicionada com sucesso.");
    }

    private void adicionarCartao() {
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.next();
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        System.out.println("Digite o número do cartão:");
        String numeroCartao = scanner.next();
        System.out.println("Digite a validade:");
        String validade = scanner.next();
        System.out.println("Digite o CVV:");
        int cvv = scanner.nextInt();
        System.out.println("Digite o limite:");
        int limite = scanner.nextInt();

        cartao cartao = new cartao(numeroConta, saldoInicial, numeroCartao, validade, cvv, limite);
        sistemaFintech.adicionarCartao(cartao);
        System.out.println("Cartão adicionado com sucesso.");
    }

    private void adicionarFatura() {
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.next();
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        System.out.println("Digite o ID da fatura:");
        String idFatura = scanner.next();
        System.out.println("Digite o valor total:");
        double valorTotal = scanner.nextDouble();
        System.out.println("Digite a data de vencimento:");
        String dataVencimento = scanner.next();
        System.out.println("Digite o status do pagamento:");
        String statusPagamento = scanner.next();

        Fatura fatura = new Fatura(numeroConta, saldoInicial, idFatura, valorTotal, dataVencimento, statusPagamento);
        sistemaFintech.adicionarFatura(fatura);
        System.out.println("Fatura adicionada com sucesso.");
    }

    private void adicionarInvestimento() {
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.next();
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        System.out.println("Digite o tipo de investimento:");
        String tipoInvestimento = scanner.next();
        System.out.println("Digite a rentabilidade:");
        double rentabilidade = scanner.nextDouble();

        Investimento investimento = new Investimento(numeroConta, saldoInicial, tipoInvestimento, rentabilidade);
        sistemaFintech.adicionarInvestimento(investimento);
        System.out.println("Investimento adicionado com sucesso.");
    }

    private void exibirContas() {
        sistemaFintech.exibirContas();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
        }
    }


