package Expressao;

import Variavel.*;

public class ExpSqrt extends Expressao {

    String sqrt;

    public ExpSqrt(String sqrt) {
        this.sqrt = sqrt;
    }

    public double avalia(Memoria local, Memoria global) {
        double valor = 0;

        if (sqrt.charAt(0) >= '0' && sqrt.charAt(0) <= '9') {
            valor = Math.sqrt(sqrt.charAt(0));
        } else if (sqrt.charAt(0) >= 'a' && sqrt.charAt(0) <= 'z') {
            if (local.declarada[sqrt.charAt(0) - 'a']) {
                valor = Math.sqrt(local.var[(int) sqrt.charAt(0) - (int) 'a']);
            } else if (global.declarada[sqrt.charAt(0) - 'a']) {
                valor = Math.sqrt(global.var[(int) sqrt.charAt(0) - (int) 'a']);
            } else {
                System.out.println("variavel (" + sqrt + ") nao declarada");
                return -1;
            }
        }

        return valor;
    }

}
