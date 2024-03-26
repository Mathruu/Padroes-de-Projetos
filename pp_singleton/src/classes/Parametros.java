package classes;

public class Parametros {
    
    
    private Parametros() {};

    private static Parametros instance = new Parametros();
    public static Parametros getInstance(){
        return instance;
    }

    
    private String Nome;
    private String Funcao;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setFuncao(String funcao) {
        this.Funcao = funcao;
    }

    public String getFuncao() {
        return Funcao;
    }
}

