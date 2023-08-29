package com.github.CaioPfaltzgraff.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioCaio() {
        Assumptions.assumeTrue("caio".equalsIgnoreCase("Caio"));
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Concluido");
    }

}
