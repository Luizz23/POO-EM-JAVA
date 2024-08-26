public class cartao extends ContaBancaria {
    private String numeroCartao;
    private String validade;
    private int cvv;
    private int limite;

    public cartao (String numeroConta, double saldo, String numeroCartao, String validade, int cvv, int limite){
        super(numeroConta, saldo);
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
        this.limite = limite;


    }
    public String getnumeroCartao() {
        return  numeroCartao;
    }
    public void setnumeroCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    public String getvalidade(){
        return validade;
    }
    public void setvalidade(String validade){
        this.validade = validade;
    }
    public int getcvv(int cvv){
        return cvv;
    }
    public void setint(int cvv){
        this.cvv = cvv;
    }
    public int getlimite(int limite){
        return limite;
    }
    public void setlimite(int limite){
        this.limite = limite;
    }
@Override
    public void exibirdados(){
        super.exibirdados();
        System.out.println(" O seu numero do Cartão é:" + numeroCartao);
        System.out.println(" A Validade ele é:" + validade);
        System.out.println(" O cvv é:" + cvv);
        System.out.println(" O limte dele é: " + limite);

    }
}
