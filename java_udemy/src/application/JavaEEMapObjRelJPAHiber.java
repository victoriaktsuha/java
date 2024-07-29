package application;

public class JavaEEMapObjRelJPAHiber {

	public static void main(String[] args) {
	
		//290. Nivelamento: mapenamento objeto-relacional com JPA / Hibernate
		
		//292. Instala��o Postman e STS
		
		//293 - 295. Nivelamento JPA/Hibernate
		
		/* JPA - especifica��o (interface) da biblioteca padr�o de persistencia de dados do Java baseado
		 * no princ�pio do mapeamento do objeto-relacional
		 * Hibernate - uma das implementa��es mais populares dessa especifica��o
		 * 
		 * Principais classes: 
		 * 
		 * - EnitityManager: 
		 * Um objeto EntityManager encapsula uma conex�o com a base de dados 
		 * e serve para efetuar opera��es de acesso a dados (inser��o, remo��o, dele��o, 
		 * atualiza��o) em entidades (clientes, produtos, pedidos, etc.) por ele monitoradas 
		 * em um mesmo contexto de persist�ncia.
		 * Escopo: tipicamente mantem-se uma inst�ncia �nica de EntityManager para cada thread 
		 * do sistema (no caso de aplica��es web, para cada requisi��o ao sistema).
		 * 
		 * - EntityManagerFactory:
		 * Um objeto EntityManagerFactory � utilizado para instanciar objetos EntityManager.
		 * Escopo: tipicamente mantem-se uma inst�ncia �nica de EntityManagerFactory para 
		 * toda aplica��o.
		 * 
		 * Mapeamento a objeto-relacional:
		 * 
		 * PROBLEMA
		 * Por v�rios anos, a maior dificuldade de se usar a abordagem orientada a objetos
		 * � a comunica��o com o banco de dados relacional.
		 * 
		 * O banco de dados n�o � orientado a objetos, tendo ent�o, o paradigma relacional.
		 * Quando um sistema era desenvolvido com orienta��o a objetos, existia um
		 * esfor�o grande para programar a orienta��o entre o sistema e o banco de dados.
		 * Utilizava-se o JDBC e devia programar a tradu��o do db relacional/tabela para as classes 
		 * orientadas a objetos
		 * 
		 * Era tamb�m necess�rio programar:
		 * - Contexto de persist�ncia (objetos que est�o ou n�o atrelados a uma conex�o em
		 * um dado momento)
		 * - Mapa de identidade (cache de objetos j� carregados)
		 * - Carregamento tardio (lazy loading)
		 * - Outros
		 * 
		 * ==== RECAPITULANDO ====:
		 * 
		 * Paradigmas ("Algo que serve de exemplo geral ou de modelo") da programa��o:
		 * 
		 * "O paradigma de uma linguagem de programa��o � a sua identidade. Corresponde a um 
		 * conjunto de caracter�sticas que, juntas, definem como ela opera e resolve os 
		 * problemas. Algumas linguagens, inclusive, possuem mais de um paradigma, s�o as 
		 * chamadas multi paradigmas (como o PHP)."
		 * 
		 * = LINGUAGENS = :
		 * 
		 * - Baixo n�vel (pr�xima da linguagem de m�quina): Assembly/bin�ria
		 * - Alto n�vel (pr�xima da linguagem humana): C, PHP, Java, Rust, C#, Python, Ruby, etc
		 * 
		 * - Funcional: focado em fun��es matematicas -  F# (da Microsoft), Lisp, Heskell, 
		 * Erlang, Elixir, Mathematica
		 * 
		 * - L�gico: tamb�m conhecido como restritivo, utilizado por AI, opera com l�gica de 
		 * predicados - Prolog
		 * 	-- Proposi��es: base de fatos concretos e conhecidos.
		 * 	-- Regras de infer�ncia: definem como deduzir proposi��es.
		 * 	-- Busca: estrat�gias para controle das infer�ncias.
		 * 
		 * Exemplo:
		 * Proposi��o: Chico � um gato.
		 * Regra de infer�ncia: Todo gato � um felino.
		 * Busca: Chico � um felino?
		 * A resposta para a Busca acima precisa ser verdadeira. 
		 * A conclus�o l�gica �: 
		 * Se Chico � um gato e todo gato � felino, ent�o Chico � um felino. 
		 * 
		 * - Declarativo: baseado no l�gico e funcional, descrevem o que fazem e n�o exatamente 
		 * como suas instru��es funcionam. - HTML, XML, XSLT, XAML, Prolog
		 * 
		 * - Imperativo: programa��o procedural/programa��o modular - C, C++, PHP, Perl, 
		 * C#, Ruby - focado na mudan�a de estados de vari�veis (exemplo: if)
		 * 
		 * - Orientado a objetos: OO (sigla para orienta��o a objetos), preocupa��o em esconder
		 * o que n�o � importante e em real�ar o que � importante; ao inv�s de construirmos 
		 * nossos sistemas com um conjunto estrito de procedimentos, utilizamos uma l�gica bem 
		 * pr�xima do mundo real, lidando com objetos.
		 * Implementa-se um conjunto de classes que definem objetos. Cada classe determina o 
		 * comportamento (definido nos m�todos) e estados poss�veis (atributos) de seus objetos,
		 * assim como o relacionamento entre eles. - C#, Java, PHP, Ruby, C++, Python etc
		 * 
		 * - Orientado a eventos:Toda linguagem que faz uso de interface gr�fica, o fluxo de 
		 * execu��o do software � baseado na ocorr�ncia de eventos externos, normalmente 
		 * disparados pelo usu�rio. - Delphi, Visual Basic, C#, Python, Java
		 * 
		 * 
		 * = TERMOS =:
		 * 
		 * UML - Unified Modeling Language/Linguagem de modelagem unificada
		 * 
		 * JDBC - Java Database Connectivity - API de baixo n�vel; conjunto de classes e 
		 * interfaces escritas em Java que fazem o envio de instru��es SQL para qualquer banco 
		 * de dados relacional. permite que os desenvolvedores se conectem a um banco de dados 
		 * relacional e executem consultas SQL para recuperar, inserir, atualizar e excluir 
		 * dados. Ele fornece uma maneira padr�o de interagir com bancos de dados e � uma das 
		 * camadas mais baixas da pilha de persist�ncia de dados em Java. Com o JDBC, os 
		 * desenvolvedores precisam escrever c�digo manualmente para criar conex�es, preparar e
		 *  executar consultas, e processar os resultados.
		 *  
		 * JPA - Java Persistence API - � uma especifica��o do Java que define uma interface 
		 * de programa��o de aplicativos para gerenciamento de dados em aplica��es Java. 
		 * Ele oferece uma maneira mais simplificada e orientada a objetos de interagir com 
		 * bancos de dados, permitindo que os desenvolvedores usem anota��es para mapear 
		 * objetos Java para tabelas de banco de dados e executem opera��es CRUD (Criar, Ler,
		 *  Atualizar, Deletar) de forma mais eficiente. No entanto, o JPA em si � apenas uma 
		 *  especifica��o e precisa de uma implementa��o para ser utilizada.
		 *  
		 * Hibernate - � uma das implementa��es mais populares da especifica��o JPA. Ele � um 
		 * framework de mapeamento objeto-relacional (ORM) que simplifica o desenvolvimento 
		 * de aplica��es Java que interagem com bancos de dados relacionais. O Hibernate 
		 * mapeia objetos Java para tabelas de banco de dados e gerencia automaticamente o 
		 * ciclo de vida dos objetos, incluindo a gera��o de consultas SQL, controle de 
		 * transa��es e otimiza��es de desempenho. Ele oferece recursos avan�ados, como lazy 
		 * loading, caching e suporte a consultas HQL (Hibernate Query Language).
		 * 
		 * Spring Data JPA - O Spring Data JPA � uma parte do ecossistema Spring que 
		 * simplifica ainda mais o desenvolvimento de aplica��es JPA. Ele fornece uma camada 
		 * de abstra��o sobre o JPA, permitindo que os desenvolvedores escrevam menos c�digo 
		 * repetitivo e se concentrem mais na l�gica de neg�cios. Com o Spring Data JPA, os 
		 * desenvolvedores podem definir reposit�rios de dados usando interfaces simples e 
		 * m�todos de consulta derivados, evitando a necessidade de escrever consultas SQL 
		 * manualmente. Al�m disso, o Spring Data JPA integra-se facilmente com outros 
		 * recursos do Spring, como inje��o de depend�ncia, transa��es declarativas e 
		 * seguran�a.
		 * 
		 * Em resumo, o JDBC � a API de conex�o de baixo n�vel para bancos de dados em Java, 
		 * o JPA � uma especifica��o que define uma interface de programa��o de aplicativos 
		 * para persist�ncia de dados, o Hibernate � uma implementa��o popular dessa 
		 * especifica��o que simplifica o desenvolvimento de aplica��es JPA e o Spring Data 
		 * JPA � uma camada de abstra��o adicional que simplifica ainda mais o desenvolvimento 
		 * de aplica��es JPA em conjunto com o ecossistema Spring.
		 * 
		 * SQL - Structured Query Languages / Linguagem de Consulta Estruturada
		 * 
		 * API - Application Programming Interface / Interface de Programa��o de Aplica��o
		 * 
		 * Martin Fowler - Patterns of Enterprise Application Architecture
		 * 
		 * Maven: gerenciador de dependencias e build do Java - onde fica hibernate
		 */

	}

}
