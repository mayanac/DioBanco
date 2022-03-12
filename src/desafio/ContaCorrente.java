
package desafio;

public class ContaCorrente extends ImprimirInfoComuns {
    
    public ContaCorrente(){
        super();
    }

    @Override
    public void imprimirExtrato() {
       System.out.println("*** Extrato conta corrente ***");
    }
}