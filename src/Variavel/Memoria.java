package Variavel;

public class Memoria {

    public double[] var;
    public boolean[] declarada;
    
    public Memoria() {
        var = new double[26];
        declarada= new boolean[26];
        for (int i = 0; i < 26; i++) {
            var[i] = -1;
            declarada[i]=false;
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            sb.append("[").append(i).append("] = ").append(var[i]).append("\n");
        }

        return sb.toString();
    }

}
