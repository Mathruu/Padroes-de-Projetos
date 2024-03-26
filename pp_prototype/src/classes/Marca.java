package classes;

public class Marca implements Cloneable {
    private String nome;
    private int anoFundacao; 

    public Marca(String nome, int anoFundacao) {
        super();
        this.nome = nome;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", anoFundacao=" + anoFundacao +
                '}';
    }
}
