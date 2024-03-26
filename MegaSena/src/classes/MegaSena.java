package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MegaSena {

    public double sortearNumeros(List<Integer> bilhete, double valorAposta) {
        List<Integer> numerosSorteados = gerarNumerosSorteados();

        if (!validarBilhete(bilhete, numerosSorteados))
            return 0.0;

        int totalAcertos = contarAcertos(bilhete, numerosSorteados);

        return calcularPremio(totalAcertos, valorAposta);
    }

    private List<Integer> gerarNumerosSorteados() {
        List<Integer> numerosSorteados = new ArrayList<>();
        while (numerosSorteados.size() < 6) {
            int sorteio = new Random().nextInt(59) + 1;
            if (!numerosSorteados.contains(sorteio)) {
                numerosSorteados.add(sorteio);
            }
        }
        return numerosSorteados;
    }

    private boolean validarBilhete(List<Integer> bilhete, List<Integer> numerosSorteados) {
        for (Integer numero : bilhete) {
            if (numero < 1 || numero > 60 || numerosSorteados.contains(numero)) {
                return false;
            }
        }
        return true;
    }

    private int contarAcertos(List<Integer> bilhete, List<Integer> numerosSorteados) {
        int totalAcertos = 0;
        for (Integer num : bilhete) {
            if (numerosSorteados.contains(num)) {
                totalAcertos++;
            }
        }
        return totalAcertos;
    }

    private double calcularPremio(int totalAcertos, double valorAposta) {
        if (totalAcertos == 6) {
            return valorAposta;
        } else if (totalAcertos == 5) {
            return valorAposta * 0.2;
        } else if (totalAcertos == 4) {
            return valorAposta * 0.05;
        }
        return 0.0;
    }
}
