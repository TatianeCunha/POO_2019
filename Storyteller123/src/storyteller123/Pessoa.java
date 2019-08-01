package storyteller123;


public class Pessoa {
    
    private String nome;
    private int idade;
    
        
    public Pessoa(String name, int idade) {
		// TODO Auto-generated constructor stub
    	this.nome = name;
    	this.idade = idade;
   }
    
    public Pessoa() {
		// TODO Auto-generated constructor stub
    }

    //Getters e Setters
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
    

    
}
