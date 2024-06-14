package model.exceptions;

// se a classe de exce��o personalizada estender a classe Exception, ela ser� obrigada a tratar a exce��o
// j� se a classe estender a RuntimeException, ela n�o � obrigada a tratar a exce��o
public class DomainException extends Exception{
//Exception transforma a classe em serializable - os objetos desse tipo de classe pode ser convertidos para bytes e assim trafegar em redes, ser gravados em arquivos, etc

	//declara��o default de um id para classe serializable
	private static final long serialVersionUID = 1L;
	
	//permite instanciar passando uma mensagem ao construtor da superclasse
	public DomainException(String msg) {
		super(msg);
	}

	
}
