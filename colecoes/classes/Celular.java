package br.com.abc.Java.colecoes.classes;

public class Celular {
    private String nome;
    private String imei;

    public Celular() {
    }

    public Celular(String nome , String imei) {
        this.nome = nome;
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Celular:" +
                "nome: " + nome +
                " imei: " + imei
                ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
