package br.com.abc.Java.parametrizandoComportamentos.classePredicate;

import br.com.abc.Java.parametrizandoComportamentos.classes.Carro;
import br.com.abc.Java.parametrizandoComportamentos.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarroPredicateAno implements CarroPredicate {
    @Override
    public boolean teste(Carro carro) {
        return  (carro.getAno () > (Calendar.getInstance ().get ( Calendar.YEAR ) - 10));
    }
}
