package classes;

public class FabricaPessoaJuridica implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPessoaJuridica();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPessoaJuridica();
    }

}
