package br.com.hz.hentcar.carros;

import br.com.hz.hentcar.factory.Car;

public class PrismaCar extends Car {
    public PrismaCar(String power, boolean arCondicionado, String nivelCombustivel, String categoria, String color, String lugares, boolean blindado, String condicao) {
        super(power, arCondicionado, nivelCombustivel, categoria, color, lugares, blindado, condicao);
    }
}
