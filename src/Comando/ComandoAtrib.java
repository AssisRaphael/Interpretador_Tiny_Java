package Comando;
	
import Variavel.*;
import Expressao.*;
	 
public class ComandoAtrib extends Comando {
   
   char variavel;
   Expressao exp;
   	
   public ComandoAtrib(int lin, char var, Expressao raizArvoreExpressao) {
         this.linha=lin;
         variavel=var;
         exp=raizArvoreExpressao;  
   }
   
   public int executa(Memoria local, Memoria global) {
        if(local.declarada[variavel-'a'])
            local.var[variavel-'a'] = exp.avalia(local,global);
        else if(global.declarada[variavel-'a'])
            global.var[variavel-'a'] = exp.avalia(local,global);
        else
            System.out.println("variavel ("+variavel+ ") nao declarada");
        return linha+1;
   }
}

