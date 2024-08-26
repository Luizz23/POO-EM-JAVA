public class Fatura extends ContaBancaria {
    private String idFatura;
    private double valorTotal;
    private String dataVencimento;
    private String statusPagamento;

    public Fatura (String numeroConta, double saldo, String idFatura, double valorTotal, String dataVencimento, String statusPagamento) {
        super(numeroConta, saldo);
        this.idFatura = idFatura;
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
        this.statusPagamento = statusPagamento;
    }
    public String getidFatura(){
        return idFatura;
    }
    public void setidFatura (String idFatura){
        this.idFatura = idFatura;
    }
    public double getvalortotal(){
        return valorTotal;
    }
    public void setvalorTtoal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    public String getdataVencimento(){
        return dataVencimento;
    }
    public void setdataVencimento(String dataVencimento){
        this.dataVencimento = dataVencimento;
    }
    public String getstatusPagamento(){
        return statusPagamento;
    }
    public void setstatusPagamento(){
        this.statusPagamento = statusPagamento;
    }
    @Override
    public void exibirdados(){
        super.exibirdados();
        System.out.println(" O id da fatura é:" + idFatura);
        System.out.println(" O valor total é:" + valorTotal);
        System.out.println(" A data de Vencimento é: " + dataVencimento);
        System.out.println("O status do pagamento é :" + statusPagamento);
    }
}
