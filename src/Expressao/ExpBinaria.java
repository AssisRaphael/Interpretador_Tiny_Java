package Expressao;

import Variavel.*;

public class ExpBinaria extends Expressao {

    String op;
    Object exp1, exp2;
    Expressao cmd1, cmd2;

    public ExpBinaria(String op, Object exp1, Object exp2) {
        this.op = op;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public double avalia(Memoria local, Memoria global) {

        cmd1 = (Expressao) exp1;
        cmd2 = (Expressao) exp2;

        if (op.equals("*")) {
            return cmd1.avalia(local,global) * cmd2.avalia(local,global);
        } else if (op.equals("/")) {
            return cmd2.avalia(local,global) / cmd1.avalia(local,global);
        } else if (op.equals("+")) {
            return cmd1.avalia(local,global) + cmd2.avalia(local,global);
        } else if (op.equals("-")) {
            return cmd2.avalia(local,global) - cmd1.avalia(local,global);
        } else {
            return 0;
        }

    }

}
