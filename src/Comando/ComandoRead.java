package Comando;

import java.io.*;
import java.util.*;
import Variavel.*;

import lp.*;

public class ComandoRead extends Comando {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    char variavel;
    Scanner input = new Scanner(System.in);

    public ComandoRead(int lin, String txt) {
        linha = lin;
        variavel = txt.charAt(0);
    }

    public int executa(Memoria local, Memoria global) {

        try {
            if (variavel >= 'a' && variavel <= 'z') {
                if (local.declarada[variavel - 'a']) {
                    local.var[variavel - 'a'] = input.nextFloat();
                } else if (global.declarada[variavel - 'a']) {
                    global.var[variavel - 'a'] = input.nextFloat();
                } else {
                    System.out.println("variave (" + variavel + ") nao declarada");
                }
            }
            else
            throw new Exception();
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
        return linha + 1;
    }
}
