package Fundamentos.Exemples.Enum;

public enum EstadoBrasileiro{
    SAO_PAULO ("SP", "São Paulo"),
    ALAGOAS ("AL", "Alagoas"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),

    ;

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }


}