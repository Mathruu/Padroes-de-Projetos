package classes;

public class Carro implements Cloneable {


    private String modelo;
    private Marca marca;
    private String cor;

    public Carro(String modelo, Marca marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.marca = (Marca) carroClone.marca.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + marca.toString() +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}