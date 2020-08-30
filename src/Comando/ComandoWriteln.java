package Comando;

import Variavel.Memoria;
import java.io.*;  
import java.util.*;

import lp.*; 

public class ComandoWriteln extends Comando {
   	
   public ComandoWriteln(int lin) {
      linha= lin;
   }
   
   public int executa(Memoria local, Memoria global) {
      System.out.println();
      return linha+1;
   }
}