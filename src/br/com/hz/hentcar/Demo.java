package br.com.hz.hentcar;

import br.com.hz.hentcar.factory.ContratosFactory;
import br.com.hz.hentcar.factory.Factory;
import br.com.hz.hentcar.factory.SemContratosFactory;

public class Demo {

    public static void main(String[] args){

        Customer cliente= new Customer("e",false);
        Factory factory = getFactory(cliente);
        factory.create(cliente.getCategoriaCarro());
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.HasCompanyContract()){
            return new ContratosFactory();
        }
        else {
            return new SemContratosFactory();
        }
    }
}
