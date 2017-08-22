package br.com.locadoraDeVeiculos.model;

public class Carro {

    private String placa;
    private String chassi;
    private String Renavam;
    private Integer anoDeFabricacao;
    private Double potencialMotor;
    private String cor;
    private Integer numeroDePortas;
    private Boolean arCondicionado;
    private Boolean direcaoHidraulica;
    private Boolean freioAbs;
    private Boolean airBag;
    private Boolean radio;
    private Modelo modelo;
    private Grupo grupo;
    private Filial filial;

    public Carro() {
    }

    public Carro(String placa, String chassi, String renavam, Integer anoDeFabricacao, Double potencialMotor,
                 String cor, Integer numeroDePortas, Boolean arCondicionado, Boolean direcaoHidraulica, Boolean freioAbs,
                 Boolean airBag, Boolean radio, Modelo modelo, Grupo grupo, Filial filial) {
        super();
        this.placa = placa;
        this.chassi = chassi;
        Renavam = renavam;
        this.anoDeFabricacao = anoDeFabricacao;
        this.potencialMotor = potencialMotor;
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
        this.freioAbs = freioAbs;
        this.airBag = airBag;
        this.radio = radio;
        this.modelo = modelo;
        this.grupo = grupo;
        this.filial = filial;
    }

    public String getPlaca() {
        return placa;
    }

    public String getChassi() {
        return chassi;
    }

    public String getRenavam() {
        return Renavam;
    }

    public Integer getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public Double getPotencialMotor() {
        return potencialMotor;
    }

    public String getCor() {
        return cor;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public Boolean getArCondicionado() {
        return arCondicionado;
    }

    public Boolean getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public Boolean getFreioAbs() {
        return freioAbs;
    }

    public Boolean getAirBag() {
        return airBag;
    }

    public Boolean getRadio() {
        return radio;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Filial getFilial() {
        return filial;
    }
}
