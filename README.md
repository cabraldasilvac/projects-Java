# Projects-Java

Iniciando o estudo de JAVA.
Instalando e configurando o ambiente de trabalho.

### RESUMO DE ESTUDO:
	Variáveis, Tipos de Dados e Operadores Matemáticos em JAVA.

*Prof. Thiago Leite e Carvalho.*
*DIO*

### Objetivo do curso

Possibilitar que o aluno entenda o que são variáveis, como criá-las e manipula-las.

- **Percurso**
  - Aula 01 - Conceituação e Criação
  - Aula 02 - Tipos de dados
  - Aula 03 - Operadores aritméticos
  - Aula 04 - Conversões(casting)

- **Requisitos**
    * Lógica de programação
    * [Java](https://www.java.com/pt-BR/)
    * [IntelliJ IDEA](https://www.jetbrains.com/idea/) - *_Eu usei o VsCode_*
---
### AULA 01 - Conceituação e Criação
---
    1 - Entender o que são variáveis
    2 - Saber como criar variáveis

### Conceituação de variáveis

**“Um espaço na memória do computador, onde se pode guardar valores.**

    Existem 4  tipos:
    1 - Instância: Objeto
    2 - Classe: classe
    3 - Local: dentro de métodos
    4 - Parâmetros: Na assinatura do método 


### Padrão de definição:

    <?visibilidade?><?modificador?>tipo nome<?=valorinicial?>;
    V:”public”, “protected”e “private”
    M:”static” e “final”
    T: tipo de dado
    N: nome que é fornecido a variável
    VI: um valor inicial, caso se deseje

---
### AULA 02 - TIPOS DE DADOS
---
### Conceituação - Tipos de Dados

**“São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente."**

### Tipificação:
* Estática(forte) vs Dinâmica(fraco)
* Primitivo vs Composto

### Opções de Tipos:

* Textual
* Numeral
* Lógico
* Objeto

### Exemplo Numeral:

    • byte: - 128 até 127 ==> byte b=15;
    • Short: -32.768 até 32.767 ==> short s = -15785;
    • Int: -2.147.483.648 até 2.147.483.647 ==> int i = 8515785;
    • Long: - 9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 ==> long l = 5938515785L;
    • Float: + 3.40282347E+38F ==> float f = 3.14…(f);
    • Double: + 1.79769313486231570E+308 ==> double d = 3.14…(d);

### Exemplo Textual:

    • Char: carácteres de 16-bit Unicode ==> char c = ‘\u0084’ou char c = ‘T’;
    • String: um tipo “especial”==> String s = “T”;

### Exemplo Lógico:

    • Boolean: true e false ==> boolean s = false;

### Exemplo Objeto:

    • Cena dos próximos capítulos. Matéria a ser estudada.



### Utilização

    Tipo de dado	Valor default
    byte 			0
    Short			0
    Int 			0
    Long			0L
    Float			0.0f
    Double			0.0d
    Char			‘\u0000’ = vazio
    String(e objetos)	null
    Boolean			false

### Boas práticas

**Usar de forma adequada cada tipo de dado para cada informação.**

### Exercitando

    Criar um simples projeto e criar duas variáveis para cada tipo de dados apresentado.
	
*Criado o arquivo exercicioVariaveis.java*

---
### AULA 03 -  Operadores Aritméticos
---

### Objetivos

    1 - Entender o que são Operadores Aritméticos
    2 - Saber como usar cada um deles

### Conceituação

**“São símbolos especiais quais são capazes de realizar ações específicas em um,
dois ou mais operandos e, em seguida, retornar um resultado.“** 

    Tipos:
    • pós-fixado: exp++ ou exp- -
    • Prefixado: ++exp ou - -exp
    • Aritmético: +, - , * , /  e %
    • Atribuição: =, += , -= , *= , /= e %=

### Utilização

### Precedências:

    Operador		Precedência
    Pós-fixado		exp++, exp - -
    Prefixado		++exp, - - exp
    Multiplicativo 		*,  / , %
    Aditivo			+ , -
    Atribuição 		=, += , -=, *=, /=, %=

### Exercitando 

- Criar um simples projeto e as variáveis e operações apresentadas.
- Crie expressões em que as precedências influenciam nos resultados.

*Criado arquivo exerciciosOperadoresAritmeticos.java*

---
### AULA 04 -  Conversões (casting)
---
### Objetivos

    • Entender o que é casting
    • Tipos de casting no JAVA
    • Saber como e quando usar o casting

### Conceituação

 **“É a transformação de uma determinada variável de tipo mesmo específico
 para um tipo mais especifico ou vice-versa”.**

     ## Tipos:
    • Upcast (implícito)
    • Downcast (explícito)

### Exercitando

- Criar um simples projeto e criar variáveis de vários tipos diferentes
para assim realizar casting(conversões).

*Criado o arquivo exerciciosConversaoCasting.java*
