public class ContaBancaria {
    
    private String titular;
    private Double saldo;
    
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        // saldo += valor; Mesma coisa!
    }

    public void sacar(double valor){
        if ( valor <= saldo){
            saldo -= valor; // saldo = saldo - valor
        } else {
            System.out.println("ERROR: Saldo insuficiente");
        }
    }

    public double getSaldo(){
        return saldo;
    }

}
