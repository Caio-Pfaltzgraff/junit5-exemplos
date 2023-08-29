package com.github.CaioPfaltzgraff.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no db
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("Removeu dados");
    }

}
