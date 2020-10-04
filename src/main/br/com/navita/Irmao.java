package main.br.com.navita;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Irmao {
    private static final int TAMANHO_MAXIMO_PERMITIDO = 100000000;

    public static int getMaiorValorDaFamilia(Integer valor) {
        if (valor > TAMANHO_MAXIMO_PERMITIDO) {
            return -1;
        }

        var valores = String.valueOf(valor)
                .chars()
                .mapToObj(c -> (char) c)
                .sorted(Comparator.comparingInt(o -> o))
                .collect(Collectors.toList());
        Collections.reverse(valores);

        StringBuilder valorEmString = new StringBuilder();
        valores.forEach(valorEmString::append);

        return Integer.parseInt(valorEmString.toString());
    }
}
