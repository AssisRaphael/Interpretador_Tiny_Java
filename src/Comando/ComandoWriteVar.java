package Comando;

import Variavel.Memoria;
import java.io.*;
import java.util.*;

import lp.*;

public class ComandoWriteVar extends Comando {

    char variavel;

    public ComandoWriteVar(int lin, String txt) {
        linha = lin;
        variavel = txt.charAt(0);
    }

    public int executa(Memoria local, Memoria global) {
        if (variavel >= 'a' && variavel <= 'z') {
            if (local.declarada[variavel - 'a']) {
                System.out.print(local.var[variavel - 'a']);
            } else if (global.declarada[variavel - 'a']) {
                System.out.print(global.var[variavel - 'a']);
            } else {
                System.err.println("variave (" + variavel + ") nao declarada");
            }
        }
        return linha + 1;
    }
}
