package br.com.abc.Java.padroesDeProjeto.classes;

public class Pessoa {
    private String nome;
    private String ultimoNome;
    private String nomeDoMeio;
    private String nomePai;
    private String apelido;

    private Pessoa(String nome , String ultimoNome , String nomeDoMeio , String nomePai , String apelido) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.nomeDoMeio = nomeDoMeio;
        this.nomePai = nomePai;
        this.apelido = apelido;
    }

    public static class PessoaBuilder {
        private String nome;
        private String ultimoNome;
        private String nomeDoMeio;
        private String nomePai;
        private String apelido;

        public PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder ultimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
            return this;
        }

        public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }

        public PessoaBuilder nomePai(String nomeDoPai) {
            this.nomePai = nomePai;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }
        public  Pessoa criarPessoa(){
            return new Pessoa ( nome,ultimoNome,nomeDoMeio,nomePai,apelido );
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", apelido='" + apelido + '\'' +
                '}';
    }
}
