package com.github.CaioPfaltzgraff.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa ruan = new Pessoa("Ruan", LocalDateTime.of(2000, 1, 1, 10, 52));
        Assertions.assertEquals(23, ruan.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa ruan = new Pessoa("Ruan", LocalDateTime.of(2000, 1, 1, 10, 52));
        Assertions.assertTrue(ruan.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}
