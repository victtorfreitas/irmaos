package test.br.com.navita;

import org.junit.Before;
import org.junit.Test;

import static main.br.com.navita.Irmao.getMaiorValorDaFamilia;
import static org.junit.Assert.assertEquals;

public class IrmaoTest {

    private int valor;
    private int maiorValorDaFamilia;

    @Before
    public void valoresPadrao() {
        this.valor = 497512;
        this.maiorValorDaFamilia = 975421;
    }

    @Test
    public void deveSerMaiorValorDaFamilia() {
        int maiorValorDaFamiliaRetornado = getMaiorValorDaFamilia(valor);
        assertEquals(maiorValorDaFamilia, maiorValorDaFamiliaRetornado);
    }
}
