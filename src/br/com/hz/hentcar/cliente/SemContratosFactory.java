package br.com.hz.hentcar.cliente;

import br.com.hz.hentcar.carros.*;
import br.com.hz.hentcar.factory.Car;

public class SemContratosFactory extends Factory {
    @Override
    public Car recuperarCarro(String categoriaCarro) {
        switch (categoriaCarro){
            case "A":
                return new UnoCar("1.0",false,"Full",
                        "Compacto","prata","4", false, "Ótima"  );
            case "B":
                return new UnoCar("1.0",true,"Full",
                    "Compacto","preto","4", false, "Perfeita"  );
            case "C":
                return new PrismaCar("1.6",true,"Full",
                    "Intermediário Sedan","cinza","5", false, "Perfeita"  );
            case "D":
                return new KicksCar("1.6 FAST",true,"Full",
                        "SUV","Preto","5", false, "Perfeita"  );
            default:
                System.out.println("Não existe essa catergoria, será selecionado uma categoria padrão");
                System.out.println("-------------------------------");
                System.out.println("Padrão");
                return new Padrão("1.0 ",false,"Full",
                        "Compacto","Cinza","4", false, "Ótima");
        }

    }
}
