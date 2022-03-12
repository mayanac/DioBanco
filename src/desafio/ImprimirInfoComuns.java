
package desafio;


public class ImprimirInfoComuns extends Conta {
    
    @Override
    protected void imprimirExtratos() {
        System.out.println("*** Extrato Conta Corrente ***");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %d", super.saldo));
    }

    public ImprimirInfoComuns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirExtrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
