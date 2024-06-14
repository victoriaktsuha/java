package model.exceptions;

// se a classe de exceção personalizada estender a classe Exception, ela será obrigada a tratar a exceção
// já se a classe estender a RuntimeException, ela não é obrigada a tratar a exceção
public class DomainException extends Exception{
//Exception transforma a classe em serializable - os objetos desse tipo de classe pode ser convertidos para bytes e assim trafegar em redes, ser gravados em arquivos, etc

	//declaração default de um id para classe serializable
	private static final long serialVersionUID = 1L;
	
	//permite instanciar passando uma mensagem ao construtor da superclasse
	public DomainException(String msg) {
		super(msg);
	}

	
}
