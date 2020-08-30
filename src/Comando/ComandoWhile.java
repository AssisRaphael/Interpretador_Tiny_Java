package Comando;

import Variavel.*;
import Expressao.*;

public class ComandoWhile extends Comando {

    int linhaEnd;
    Expressao exp;

    public ComandoWhile(int lin, Expressao raizArvoreExpressao) {
        this.exp=raizArvoreExpressao;
        this.linha=lin;
    }

    public void setLinhaEnd(int lin) {
        linhaEnd = lin;
    }

    public int executa(Memoria local, Memoria global) {
        if(exp.avalia(local,global)!=0){
            return linha+1;
        }
        else
            return linhaEnd+1;
    }
}
