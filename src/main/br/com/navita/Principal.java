package main.br.com.navita;

import static main.br.com.navita.Irmao.getMaiorValorDaFamilia;

public class Principal {

    public static void main(String[] args) {
        int maiorValorDaFamilia = getMaiorValorDaFamilia(31221323);
        System.out.println("O maior valor é " + maiorValorDaFamilia);
    }
}
