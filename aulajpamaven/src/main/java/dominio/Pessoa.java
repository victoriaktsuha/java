package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//o JPA irá criar uma tabela com o mesmo nome da classe e colunas com os mesmos nomes dos atributos
//@Entity é acrescentado para indicar que essa classe é um entidade de dominio que corresponde a uma tabela
@Entity
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@Id é acrescentado ao atributo que corresponde a chave primária da tabela
	@Id
	//@GeneratedValue mapeamento que indica que a chave será gerada automaticamente pelo banco de dados
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	//@Column serve para indicar um nome diferente do atributo para a coluna no db 
	//@Column(name="nomecompleto")
	private String nome;
	private String email;
	
	public Pessoa() {		
	}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
