package br.com.hz.hentcar.factory;

public abstract class Car {

    public String power;
    public boolean arCondicionado;
    public String nivelCombustivel;
    public String categoria;
    public String color;
    public String lugares;
    public boolean blindado;
    public String condicao;

    public Car(String power, boolean arCondicionado, String nivelCombustivel ,String categoria, String color, String lugares, boolean blindado, String condicao) {
        this.power = power;
        this.arCondicionado = arCondicionado;
        this.nivelCombustivel = nivelCombustivel;
        this.categoria = categoria;
        this.color = color;
        this.lugares = lugares;
        this.blindado = blindado;
        this.condicao =condicao;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Categoria: " + categoria);
        System.out.println("Potencia de: " +power);

    }

    public void clean(){
        System.out.println("O carro foi limpo");
    }

    public void mechanicCheck(){
        System.out.println("O carro foi revisado:  "+condicao);
    }

    public void nivelCombustivelCheck(){
        System.out.println("Nível Combustivel:  "+nivelCombustivel);
    }

    public void information(){
        System.out.println("Cor disponivel:  "+color);
        System.out.println("Quantidade de Lugares:  "+lugares);
        System.out.println("Ar Condicionado:  "+arCondicionado);
        System.out.println("Blindado:  "+blindado);
    }
}


