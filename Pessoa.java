/*
 * Crie uma classe Pessoa. Nela terá os atributos nome, idade, cpf. 
 *  –Crie um construtor parametrizado inicializando todas as variáveis com os valores recebidos
 *  dos parâmetros. 
 *  –Crie um construtor default (Inicializando as variáveis da classe com valores padrões). 
 *  com valores padrões). 
 *  –Crie um método para receber os 3 valoresdos atributos da classe Pessoa e alterá-los.
 *
 * Crie outra classe, com o método main, para testar a classe Pessoa: 
 *  –Nela, crie 2 objetos da classe Pessoa. Um dos objetos criados deve inicializar as variáveis
 *   pelo construtor. O segundo objeto deve usar o construtor defaultpara criar o objeto, e mudar
 *   os valores de Pessoa acessando o método de alterar
 */
package exercício1;

/**
 *
 * @author Compartilhamento
 */
public class Pessoa {
    String nome;
	int idade;
	int cpf;
	

	public Pessoa(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		
		
	}
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	

	public static void main(String args[]) {

		Pessoa p1 = new Pessoa("Fulano",20,1111111);
		Pessoa p2 = new Pessoa();
		
		p2.setNome("Ciclano");
		p2.setIdade(30);
		p2.setCpf(123456789);
		
                System.out.println(p1.toString());
                System.out.println(p2.toString());
               
		
	}
}
