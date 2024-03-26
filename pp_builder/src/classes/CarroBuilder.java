package classes;

import java.util.Date;

public class CarroBuilder {

    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getMarca().equals("")) {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        return carro;
    }

    public CarroBuilder setMarca(String marca) {
        carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setAnoFabricacao(Date anoFabricacao) {
        carro.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    public CarroBuilder setPlaca(String placa) {
        carro.setPlaca(placa);
        return this;
    }

    public CarroBuilder setChassi(String chassi) {
        carro.setChassi(chassi);
        return this;
    }

    public CarroBuilder setQuilometragem(int quilometragem) {
        carro.setQuilometragem(quilometragem);
        return this;
    }

    public CarroBuilder setProprietario(String proprietario) {
        carro.setProprietario(proprietario);
        return this;
    }

    public CarroBuilder setCpfProprietario(String cpfProprietario) {
        carro.setCpfProprietario(cpfProprietario);
        return this;
    }

    public CarroBuilder setEnderecoProprietario(String enderecoProprietario) {
        carro.setEnderecoProprietario(enderecoProprietario);
        return this;
    }

    public CarroBuilder setCidadeProprietario(String cidadeProprietario) {
        carro.setCidadeProprietario(cidadeProprietario);
        return this;
    }

    public CarroBuilder setEstadoProprietario(String estadoProprietario) {
        carro.setEstadoProprietario(estadoProprietario);
        return this;
    }
}

