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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return Renavam;
    }

    public void setRenavam(String renavam) {
        Renavam = renavam;
    }

    public Integer getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Integer anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Double getPotencialMotor() {
        return potencialMotor;
    }

    public void setPotencialMotor(Double potencialMotor) {
        this.potencialMotor = potencialMotor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Boolean getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(Boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public Boolean getFreioAbs() {
        return freioAbs;
    }

    public void setFreioAbs(Boolean freioAbs) {
        this.freioAbs = freioAbs;
    }

    public Boolean getAirBag() {
        return airBag;
    }

    public void setAirBag(Boolean airBag) {
        this.airBag = airBag;
    }

    public Boolean getRadio() {
        return radio;
    }

    public void setRadio(Boolean radio) {
        this.radio = radio;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

}
