# Interpretador Tiny em Java
Este repositório contém um interpretador para a linguagem tiny feito em java

Este projeto implementa em Java um interpretador para a linguagem tiny, a qual possui a seguinte
gramática:
~~~xml
<programa> => <lista_comandos> "endp"
<lista_comandos> => <comando> ";"
                 => <comando> ";" <lista_comandos>
<comando> => "writeStr" "(" <string> ")"
          => "writeVar" "(" variavel ")"
          => "writeln"
          => "read" "(" <variavel> ")" <variavel> ":=" <expressao>
          => "for" <variavel> ":= "<expressao> "to" <expressao> "do" <lista_comandos> "end"
          => "while" <expressao> "do" <lista_comandos> "end"
          => "if" <expressao> "then" <lista_comandos> "endif"
          => "if" <expressao> "then" <lista_comandos> "else" <lista_comandos> "endif"
~~~
Esse projeto utiliza diversos conceitos de orientação por objetos disponíveis em Java, como
classes (incluindo classes abstratas), métodos construtores, controle de visibilidade adequados,
herança e pacotes.

Observações sobre a Linguagem tiny:
* Variáveis possuem apenas uma letra (isto é, as variáveis disponíveis vão de 'a' a 'z').
* Todas variáveis são do tipo real.
* Variáveis são declaradas automaticamente assim que são usadas pela primeira vez. Além disso, variáveis são automaticamente inicializadas com o valor zero.
