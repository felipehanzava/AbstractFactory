package br.com.hz.hentcar.cliente;

import br.com.hz.hentcar.carros.*;
import br.com.hz.hentcar.factory.Car;

public class ContratosFactory extends Factory {

    @Override
    public Car recuperarCarro(String categoriaCarro) {
        switch (categoriaCarro){
            case "A":
                return new KicksCar("1.6",true,"Full",
                        "SUV Manual","Cinza","5", false, "Perfeita"  );
            case "B":
                return new KicksCar("1.6 FAST",true,"Full",
                        "SUV Automatico","Preto","5", true, "Perfeita"  );
            case "C":
                return new CompassCar("1.0 TURBO",true,"Full",
                        "SUV Especial","prata","5", true, "Perfeita"  );
            case "D":
                return new C180Car("4.0 TURBO",true,"Full",
                        "PRIME","Preto","5", false, "Perfeita" );
            case "E":
                return new HiluxCar("2.8 TURBO",true,"Full",
                        "4x4","Preto","5", false, "Otima" );
            case "F":
                return new VanCar("2.0 ",true,"Full",
                        "Van","Cinza","25", false, "Manutenção" );
            default:
                System.out.println("Não existe essa catergoria, será selecionado uma categoria padrão");
                System.out.println("-------------------------------");
                System.out.println("Padrão");
                return new Padrão("1.0 ",false,"Full",
                        "Compacto","Cinza","4", false, "Ótima");

        }
    }
}
