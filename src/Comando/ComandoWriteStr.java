package Comando;

import Variavel.Memoria;
import java.io.*;  
import java.util.*;

import lp.*; 

public class ComandoWriteStr extends Comando {
   
   String texto;
   	
   public ComandoWriteStr(int lin, String txt) {
      linha= lin;
      texto= txt;
   }
   
   public int executa(Memoria local, Memoria global) {
      System.out.print(texto);
      return linha+1;
   }
}