package com.github.CaioPfaltzgraff.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
//    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "caior")
//    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "root")
//    @EnabledOnOs(OS.WINDOWS)
//    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
//    @EnabledOnJre(JRE.JAVA_17)
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioCaio() {
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Concluido");
    }

}
