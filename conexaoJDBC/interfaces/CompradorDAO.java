package br.com.abc.Java.conexaoJDBC.interfaces;

import br.com.abc.Java.conexaoJDBC.classes.Comprador;

import java.util.List;

public interface CompradorDAO {
    void save(Comprador comprador);

    void deletando(Comprador comprador);

    void update(Comprador comprador);

    List < Comprador > selectAll();

    List < Comprador > searchByNAme(String nome);
}
