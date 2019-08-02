package storyteller;

//
public abstract class Textos {

	public static String getTexto(Pessoa pessoa, int key) {
		switch (key) {
		case 1:
			return pessoa.getNome() + "1";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "5";
		case 7:
			return "5";
		case 8:
			return "5";
		case 9:
			return "5";
		case 10:
			return "5";
		case 11:
			return "5";
		case 12:
			return pessoa.getNome() + "Finalizou";
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}

}
