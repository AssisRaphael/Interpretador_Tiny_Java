package Expressao;

import Variavel.*;

public class ExpComparativa extends Expressao {

    String op;
    Object exp1, exp2;
    Expressao opr1, opr2;
    static final double TRUE = 1;
    static final double FALSE = 0;

    public ExpComparativa(String op, Object exp1, Object exp2) {
        this.op = op;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public double avalia(Memoria local, Memoria global) {

        boolean v = false;
        double valor = FALSE;

        opr1 = (Expressao) exp1;
        opr2 = (Expressao) exp2;

        if (op.equals("<")) {
            v = opr2.avalia(local,global) < opr1.avalia(local,global);
        }
        else if (op.equals(">")) {
            v = opr2.avalia(local,global) > opr1.avalia(local,global);
        }
        else if (op.equals("<=")) {
            v = opr2.avalia(local,global) <= opr1.avalia(local,global);
        }
        else if (op.equals(">=")) {
            v = opr2.avalia(local,global) >= opr1.avalia(local,global);
        }
        else if (op.equals("=")) {
            v = opr2.avalia(local,global) == opr1.avalia(local,global);
        }
        else if (op.equals("<>")) {
            v = opr2.avalia(local,global) != opr1.avalia(local,global);
        }
        
        if (v == true) {
            valor = TRUE;
        }

        return valor;

    }
}
