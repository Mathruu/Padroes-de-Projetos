package test;

import classes.FabricaAbstrata;
import classes.FabricaPessoaFisica;
import classes.FabricaPessoaJuridica;
import classes.Pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato de pessoa juridica", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato de pessoa fisica", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirReciboPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo de pessoa juridica", pessoa.emitirRecibo());
    }

    @Test 
    void deveEmitirReciboPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo de pessoa fisica", pessoa.emitirRecibo());
    }
}
