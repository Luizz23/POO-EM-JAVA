public class Investimento extends ContaBancaria {
    private String  tipoInvestimento;
    private double rentabilidade;

    public Investimento (String numeroConta, double saldo, String tipoInvestimento, double rentabilidade){
        super(numeroConta, saldo);
        this.tipoInvestimento = tipoInvestimento;
        this.rentabilidade = rentabilidade;
    }
    public String gettipoInvestimento(){
        return tipoInvestimento;
    }
    public void settipoInvestimento(String tipoInvestimento){
        this.tipoInvestimento = tipoInvestimento;
    }
    public double getrentabilidade(){
        return rentabilidade;
    }
    public void setrentabilidade(double rentabilidade){
        this.rentabilidade = rentabilidade;
    }
    @Override
    public void exibirdados(){
        super.exibirdados();
        System.out.println(" o Seu tipo de Investimento é :" + tipoInvestimento);
        System.out.println(" A rentabilidade foi de : " + rentabilidade);
    }
}
