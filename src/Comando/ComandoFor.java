package Comando;

import Variavel.*;
import Expressao.*;

public class ComandoFor extends Comando {

    int linhaEnd;
    int varValor;
    double limite;
    char variavel;
    String tipo;
    Expressao exp;
    boolean inicio = true;

    public ComandoFor(int lin, String var, String vValor, String tipo, Expressao raizArvoreExpressao) {
        this.exp = raizArvoreExpressao;
        this.tipo = tipo;
        this.linha = lin;
        this.variavel = var.charAt(0);
        //this.limite = exp.avalia(local,global);
        varValor = Integer.valueOf(vValor);
        //Variaveis.var[variavel - 'a'] = varValor;
        inicio = true;
    }

    public void setLinhaEnd(int lin) {
        linhaEnd = lin;
    }

    @Override
    public int executa(Memoria local, Memoria global) {
        if (inicio) {
            this.inicio = false;
            this.limite = exp.avalia(local,global);
            if (local.declarada[variavel - 'a']) {
                local.var[variavel - 'a'] = varValor;
            }
            else if (global.declarada[variavel - 'a']) {
                global.var[variavel - 'a'] = varValor;
            } else {
                System.out.println("variave (" + variavel + ") nao declarada");
            }
        }
        if (tipo.equals("to")) {
            if (local.declarada[variavel - 'a']) {
                if (local.var[variavel - 'a'] <= limite) {
                    return linha + 1;
                } else {
                    this.inicio = true;
                    return linhaEnd + 1;
                }
            }
            else if (global.declarada[variavel - 'a']) {
                if (global.var[variavel - 'a'] <= limite) {
                    return linha + 1;
                } else {
                    this.inicio = true;
                    return linhaEnd + 1;
                }
            }
            else {
                System.out.println("variave (" + variavel + ") nao declarada");
                this.inicio = true;
                return linhaEnd + 1;
            }
        } else if (tipo.equals("downto")) {
            if (local.declarada[variavel - 'a']) {
                if (local.var[variavel - 'a'] >= limite) {
                    return linha + 1;
                } else {
                    this.inicio = true;
                    return linhaEnd + 1;
                }
            }
            else if (global.declarada[variavel - 'a']) {
                if (global.var[variavel - 'a'] >= limite) {
                    return linha + 1;
                } else {
                    this.inicio = true;
                    return linhaEnd + 1;
                }
            }
            else {
                System.out.println("variave (" + variavel + ") nao declarada");
                this.inicio = true;
                return linhaEnd + 1;
            }  
        } else {
            this.inicio = true;
            return linhaEnd + 1;
        }
    }

    public int getVarValor() {
        return varValor;
    }

    public double getLimite() {
        return limite;
    }

    public char getVar() {
        return variavel;
    }

    public String getTipo() {
        return tipo;
    }
}
