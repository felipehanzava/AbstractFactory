package br.com.hz.hentcar.factory;

public class Customer {

    private String categoriaCarro;
    private Boolean temContrato;

    public Customer(String categoriaCarro, boolean temContrato){
        this.categoriaCarro = categoriaCarro;
        this.temContrato = temContrato;
    }

    public Boolean HasCompanyContract() {
        return temContrato;
    }

    public String getCategoriaCarro() {
        return categoriaCarro;
    }
}
