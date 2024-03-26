package classes;

import java.util.Date;

public class Carro {

    private String marca;
    private String modelo;
    private Date anoFabricacao;
    private String cor;
    private String placa;
    private String chassi;
    private int quilometragem;
    private String proprietario;
    private String cpfProprietario;
    private String enderecoProprietario;
    private String cidadeProprietario;
    private String estadoProprietario;

    public Carro() {
        this.marca = "";
        this.modelo = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public String getEnderecoProprietario() {
        return enderecoProprietario;
    }

    public void setEnderecoProprietario(String enderecoProprietario) {
        this.enderecoProprietario = enderecoProprietario;
    }

    public String getCidadeProprietario() {
        return cidadeProprietario;
    }

    public void setCidadeProprietario(String cidadeProprietario) {
        this.cidadeProprietario = cidadeProprietario;
    }

    public String getEstadoProprietario() {
        return estadoProprietario;
    }

    public void setEstadoProprietario(String estadoProprietario) {
        this.estadoProprietario = estadoProprietario;
    }
}
