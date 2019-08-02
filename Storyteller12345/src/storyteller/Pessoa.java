package storyteller;

//Classe para inicializar uma pessoa, nesse caso, o jogador
public class Pessoa {

	private final String nome;
	private final int idade;

	public Pessoa(String name, int idade) {
		this.nome = name;
		this.idade = idade;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
