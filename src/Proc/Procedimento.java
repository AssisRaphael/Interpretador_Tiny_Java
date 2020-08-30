package Proc;

import Variavel.*;
import Comando.*;
import java.util.*;

public class Procedimento {

    String nome;     										// nome do procedimento  
    Vector comandos;    									// vetor de comandos 
    String[] parametros;									// parametros formais 
    String[] variaveisLocal;								// variaveis local
    static Memoria global = new Memoria();;			// variaveis globais

    public Procedimento(String n, String[] p) {
        nome = n;
        parametros = p;
        //global = new Memoria();
    }

    public String getNome() {
        return nome;
    }

    public static void setVariaveisGlobal(String[] vG) {//Declara as variáveis como zero
        char var;
        for (String vG1 : vG) {
            var = vG1.charAt(0);
            if(var>='a' && var<='z' || var>='A' && var<='Z'){
                global.declarada[var - 'a'] = true;
                global.var[var - 'a'] = 0;
            }
        }
    }

    public void setVariaveisLocal(String[] vL) {//Vetor de variáeis locais
        this.variaveisLocal=vL;
    }

    public void setListaComandos(Vector c) {//Lista de comandos
        comandos=c;
    }

    public void executa(double[] argumentos) {
        Memoria local = new Memoria(); 				// variaveis local

        char var;

        // adiciona variaveis locais na memoria local
        if (variaveisLocal != null) {//Se existir umavariável local
            for(int i=0;i<variaveisLocal.length;i++){//Percorre as variáveis locais
                var=variaveisLocal[i].charAt(0);//Pega a variável local
                local.declarada[var-'a']=true;//Declara ela
                local.var[var-'a']=0;//Seta para 0 os valores das var locais declaradas
            }
        }

        // associa argumentos a seus respectivos parametros formais
        if (this.parametros != null) {
            for(int i=0;i<this.parametros.length;i++){//Percorre o vetor de parametros da função
                var=this.parametros[i].charAt(0);//Pega cada parametro
                local.declarada[var-'a']=true;//Declara a variável local respectiva
                local.var[var-'a']=argumentos[var-'a'];//Seta ela com o valor do paramentro
            }
        }

        int pc = 0;
        do {
            pc = ((Comando) comandos.elementAt(pc)).executa(local, global);//Percorre os comandos e executa-os
        } while (pc < comandos.size());
    }
}
