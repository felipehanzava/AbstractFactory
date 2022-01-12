package br.com.hz.hentcar.factory;

import br.com.hz.hentcar.cliente.ContratosFactory;
import br.com.hz.hentcar.cliente.Factory;
import br.com.hz.hentcar.cliente.SemContratosFactory;

public class Demo {

    public static void main(String[] args){

        Customer cliente= new Customer("A",true);
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
