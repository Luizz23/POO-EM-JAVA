public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta,  double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
public String getNumeroConta() {
return numeroConta;
}
public void setNumeroConta (String numeroConta){
        this.numeroConta = numeroConta;
}
public double getSaldo(){
        return saldo;
}
public void setSaldo (double saldo){
        this.saldo =saldo;
}
public void exibirdados(){
    System.out.println("O numero da sua conta é:" + numeroConta);
    System.out.println("Oseu saldo é: " + saldo);
}
}