package storyteller;

//
public abstract class Textos {
	
	
	public static String getInicio() {
		return "Inicio da historia";
	}
	
	
	public static String getTexto(Pessoa pessoa, int key) {
		switch (key) {
		case 1:
			return pessoa.getNome() + " 1";
		case 2:
			return "Teste 2";
		case 3:
			return "abc 3";
		case 4:
			return "asd 4";
		case 5:
			return "ag 5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "11";
		case 12:
			return pessoa.getNome() + "Finalizou";
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}

}
