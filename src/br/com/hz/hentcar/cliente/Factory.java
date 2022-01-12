package br.com.hz.hentcar.cliente;

import br.com.hz.hentcar.factory.Car;

public abstract class Factory {

    public Car create(String categoriaCarro){
        Car car = recuperarCarro(categoriaCarro);
        car = prepararCarro(car);
        return car;
    }

    private Car prepararCarro(Car car){
        car.startEngine();
        car.clean();
        car.mechanicCheck();
        car.nivelCombustivelCheck();
        car.information();
        return car;
    }

    public abstract Car recuperarCarro(String categoriaCarro);
}
