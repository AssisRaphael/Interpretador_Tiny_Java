package Comando;

import Variavel.*;

public class ComandoEndfor extends Comando {

    int linhaFor;
    char variavel;
    String tipo;

    public ComandoEndfor(int lin, int linFor, char var, String tipo) {
        linhaFor = linFor;
        this.linha = lin;
        variavel = var;
        this.tipo = tipo;
    }

    public int executa(Memoria local, Memoria global) {
        if (tipo.equals("to")) {
            if (local.declarada[variavel - 'a']) {
                local.var[variavel - 'a']++;
            }
            else if (global.declarada[variavel - 'a']) {
                global.var[variavel - 'a']++;
            } else {
                System.out.println("variave (" + variavel + ") nao declarada");
            }
        } else if (tipo.equals("downto")) {
            if (local.declarada[variavel - 'a']) {
                local.var[variavel - 'a']--;
            }
            else if (global.declarada[variavel - 'a']) {
                global.var[variavel - 'a']--;
            } else {
                System.out.println("variave (" + variavel + ") nao declarada");
            };
        }
        return linhaFor;
    }
}
