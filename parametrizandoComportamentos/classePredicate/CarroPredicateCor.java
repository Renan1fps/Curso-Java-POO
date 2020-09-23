package br.com.abc.Java.parametrizandoComportamentos.classePredicate;

import br.com.abc.Java.parametrizandoComportamentos.classes.Carro;
import br.com.abc.Java.parametrizandoComportamentos.interfaces.CarroPredicate;

public class CarroPredicateCor implements CarroPredicate {
    @Override
    public boolean teste(Carro carro) {
        return carro.getCor ().equals ( "verde" );
    }
}
