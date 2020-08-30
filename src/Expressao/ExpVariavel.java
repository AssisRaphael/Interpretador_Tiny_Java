package Expressao;

import Variavel.*;

public class ExpVariavel extends Expressao {

    char variavel;

    public ExpVariavel(char nomevar) {
        variavel = nomevar;
    }

    public double avalia(Memoria local, Memoria global) {
        if (local.declarada[variavel - 'a']) {
            return local.var[variavel - 'a'];
        } else if (global.declarada[variavel - 'a']) {
            return global.var[variavel - 'a'];
        } else {
            System.out.println("variave (" + variavel + ") nao declarada");
        }
        return -1;
    }

}
