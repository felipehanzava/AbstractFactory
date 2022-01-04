package br.com.hz.hentcar.factory;

import br.com.hz.hentcar.Car;

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

    abstract Car recuperarCarro(String categoriaCarro);
}
