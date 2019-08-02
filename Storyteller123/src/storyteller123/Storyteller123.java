package storyteller123;

public class Storyteller123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// comeca intro
//		Narrador.getIntro();
		Pessoa jogador = new Pessoa();

		jogador.setNome(Caixa.retorna("Qual o seu primeiro nome?\n\n"));
		jogador.setIdade(Integer.parseInt(Caixa.retorna("Qual sua idade?\n\n")));

		// comeca historia
		Historia historia = new Historia(5);

		Evento e1 = new Evento(Textos.getTextos(), "Olho o corpo", "Vou embora");
		Evento e2 = new Evento(Textos.getTextos(), "copo", "piano", "veneno");
		Evento e3 = new Evento(Textos.getTextos(), "c ta maluco", "oloco meu", "oloquinho meu");
		// Evento que insere algum dado do jogador:
		Evento e5 = new Evento(Textos.getTextos(jogador), "socar o assassino", "chorar", "gritar");

		historia.addHistoria(e1);
		historia.addHistoria(e2);
		historia.addHistoria(e3);
		historia.addHistoria(e5);

		historia.getHistoria();

	}

}
