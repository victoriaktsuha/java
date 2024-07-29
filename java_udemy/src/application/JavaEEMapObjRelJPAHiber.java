package application;

public class JavaEEMapObjRelJPAHiber {

	public static void main(String[] args) {
	
		//290. Nivelamento: mapenamento objeto-relacional com JPA / Hibernate
		
		//292. Instalação Postman e STS
		
		//293 - 295. Nivelamento JPA/Hibernate
		
		/* JPA - especificação (interface) da biblioteca padrão de persistencia de dados do Java baseado
		 * no princípio do mapeamento do objeto-relacional
		 * Hibernate - uma das implementações mais populares dessa especificação
		 * 
		 * Principais classes: 
		 * 
		 * - EnitityManager: 
		 * Um objeto EntityManager encapsula uma conexão com a base de dados 
		 * e serve para efetuar operações de acesso a dados (inserção, remoção, deleção, 
		 * atualização) em entidades (clientes, produtos, pedidos, etc.) por ele monitoradas 
		 * em um mesmo contexto de persistência.
		 * Escopo: tipicamente mantem-se uma instância única de EntityManager para cada thread 
		 * do sistema (no caso de aplicações web, para cada requisição ao sistema).
		 * 
		 * - EntityManagerFactory:
		 * Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.
		 * Escopo: tipicamente mantem-se uma instância única de EntityManagerFactory para 
		 * toda aplicação.
		 * 
		 * Mapeamento a objeto-relacional:
		 * 
		 * PROBLEMA
		 * Por vários anos, a maior dificuldade de se usar a abordagem orientada a objetos
		 * é a comunicação com o banco de dados relacional.
		 * 
		 * O banco de dados não é orientado a objetos, tendo então, o paradigma relacional.
		 * Quando um sistema era desenvolvido com orientação a objetos, existia um
		 * esforço grande para programar a orientação entre o sistema e o banco de dados.
		 * Utilizava-se o JDBC e devia programar a tradução do db relacional/tabela para as classes 
		 * orientadas a objetos
		 * 
		 * Era também necessário programar:
		 * - Contexto de persistência (objetos que estão ou não atrelados a uma conexão em
		 * um dado momento)
		 * - Mapa de identidade (cache de objetos já carregados)
		 * - Carregamento tardio (lazy loading)
		 * - Outros
		 * 
		 * ==== RECAPITULANDO ====:
		 * 
		 * Paradigmas ("Algo que serve de exemplo geral ou de modelo") da programação:
		 * 
		 * "O paradigma de uma linguagem de programação é a sua identidade. Corresponde a um 
		 * conjunto de características que, juntas, definem como ela opera e resolve os 
		 * problemas. Algumas linguagens, inclusive, possuem mais de um paradigma, são as 
		 * chamadas multi paradigmas (como o PHP)."
		 * 
		 * = LINGUAGENS = :
		 * 
		 * - Baixo nível (próxima da linguagem de máquina): Assembly/binária
		 * - Alto nível (próxima da linguagem humana): C, PHP, Java, Rust, C#, Python, Ruby, etc
		 * 
		 * - Funcional: focado em funções matematicas -  F# (da Microsoft), Lisp, Heskell, 
		 * Erlang, Elixir, Mathematica
		 * 
		 * - Lógico: também conhecido como restritivo, utilizado por AI, opera com lógica de 
		 * predicados - Prolog
		 * 	-- Proposições: base de fatos concretos e conhecidos.
		 * 	-- Regras de inferência: definem como deduzir proposições.
		 * 	-- Busca: estratégias para controle das inferências.
		 * 
		 * Exemplo:
		 * Proposição: Chico é um gato.
		 * Regra de inferência: Todo gato é um felino.
		 * Busca: Chico é um felino?
		 * A resposta para a Busca acima precisa ser verdadeira. 
		 * A conclusão lógica é: 
		 * Se Chico é um gato e todo gato é felino, então Chico é um felino. 
		 * 
		 * - Declarativo: baseado no lógico e funcional, descrevem o que fazem e não exatamente 
		 * como suas instruções funcionam. - HTML, XML, XSLT, XAML, Prolog
		 * 
		 * - Imperativo: programação procedural/programação modular - C, C++, PHP, Perl, 
		 * C#, Ruby - focado na mudança de estados de variáveis (exemplo: if)
		 * 
		 * - Orientado a objetos: OO (sigla para orientação a objetos), preocupação em esconder
		 * o que não é importante e em realçar o que é importante; ao invés de construirmos 
		 * nossos sistemas com um conjunto estrito de procedimentos, utilizamos uma lógica bem 
		 * próxima do mundo real, lidando com objetos.
		 * Implementa-se um conjunto de classes que definem objetos. Cada classe determina o 
		 * comportamento (definido nos métodos) e estados possíveis (atributos) de seus objetos,
		 * assim como o relacionamento entre eles. - C#, Java, PHP, Ruby, C++, Python etc
		 * 
		 * - Orientado a eventos:Toda linguagem que faz uso de interface gráfica, o fluxo de 
		 * execução do software é baseado na ocorrência de eventos externos, normalmente 
		 * disparados pelo usuário. - Delphi, Visual Basic, C#, Python, Java
		 * 
		 * 
		 * = TERMOS =:
		 * 
		 * UML - Unified Modeling Language/Linguagem de modelagem unificada
		 * 
		 * JDBC - Java Database Connectivity - API de baixo nível; conjunto de classes e 
		 * interfaces escritas em Java que fazem o envio de instruções SQL para qualquer banco 
		 * de dados relacional. permite que os desenvolvedores se conectem a um banco de dados 
		 * relacional e executem consultas SQL para recuperar, inserir, atualizar e excluir 
		 * dados. Ele fornece uma maneira padrão de interagir com bancos de dados e é uma das 
		 * camadas mais baixas da pilha de persistência de dados em Java. Com o JDBC, os 
		 * desenvolvedores precisam escrever código manualmente para criar conexões, preparar e
		 *  executar consultas, e processar os resultados.
		 *  
		 * JPA - Java Persistence API - é uma especificação do Java que define uma interface 
		 * de programação de aplicativos para gerenciamento de dados em aplicações Java. 
		 * Ele oferece uma maneira mais simplificada e orientada a objetos de interagir com 
		 * bancos de dados, permitindo que os desenvolvedores usem anotações para mapear 
		 * objetos Java para tabelas de banco de dados e executem operações CRUD (Criar, Ler,
		 *  Atualizar, Deletar) de forma mais eficiente. No entanto, o JPA em si é apenas uma 
		 *  especificação e precisa de uma implementação para ser utilizada.
		 *  
		 * Hibernate - é uma das implementações mais populares da especificação JPA. Ele é um 
		 * framework de mapeamento objeto-relacional (ORM) que simplifica o desenvolvimento 
		 * de aplicações Java que interagem com bancos de dados relacionais. O Hibernate 
		 * mapeia objetos Java para tabelas de banco de dados e gerencia automaticamente o 
		 * ciclo de vida dos objetos, incluindo a geração de consultas SQL, controle de 
		 * transações e otimizações de desempenho. Ele oferece recursos avançados, como lazy 
		 * loading, caching e suporte a consultas HQL (Hibernate Query Language).
		 * 
		 * Spring Data JPA - O Spring Data JPA é uma parte do ecossistema Spring que 
		 * simplifica ainda mais o desenvolvimento de aplicações JPA. Ele fornece uma camada 
		 * de abstração sobre o JPA, permitindo que os desenvolvedores escrevam menos código 
		 * repetitivo e se concentrem mais na lógica de negócios. Com o Spring Data JPA, os 
		 * desenvolvedores podem definir repositórios de dados usando interfaces simples e 
		 * métodos de consulta derivados, evitando a necessidade de escrever consultas SQL 
		 * manualmente. Além disso, o Spring Data JPA integra-se facilmente com outros 
		 * recursos do Spring, como injeção de dependência, transações declarativas e 
		 * segurança.
		 * 
		 * Em resumo, o JDBC é a API de conexão de baixo nível para bancos de dados em Java, 
		 * o JPA é uma especificação que define uma interface de programação de aplicativos 
		 * para persistência de dados, o Hibernate é uma implementação popular dessa 
		 * especificação que simplifica o desenvolvimento de aplicações JPA e o Spring Data 
		 * JPA é uma camada de abstração adicional que simplifica ainda mais o desenvolvimento 
		 * de aplicações JPA em conjunto com o ecossistema Spring.
		 * 
		 * SQL - Structured Query Languages / Linguagem de Consulta Estruturada
		 * 
		 * API - Application Programming Interface / Interface de Programação de Aplicação
		 * 
		 * Martin Fowler - Patterns of Enterprise Application Architecture
		 * 
		 * Maven: gerenciador de dependencias e build do Java - onde fica hibernate
		 */

	}

}
