package Comando;
	
import Variavel.*;
import Expressao.*;
	 
public class ComandoIf extends Comando implements Condicao{
   
   int linhaEnd;
   Expressao exp;
 
   public ComandoIf(int lin, Expressao raizArvoreExpressao) {
       linha=lin;
       exp=raizArvoreExpressao;
   }
   
   public void setLinhaEnd(int lin){
       linhaEnd=lin;
   }
	
   public int executa(Memoria local, Memoria global) {
       if(exp.avalia(local,global)==1)
           return linha + 1;
       else
           return linhaEnd;				
   }
}

