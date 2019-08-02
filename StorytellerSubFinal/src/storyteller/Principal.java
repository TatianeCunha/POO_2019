package storyteller;

public class Principal {
	public static void main(String[] args) {

		Caixa.messageOk(Textos.getInicio());
		
		Pessoa jogador = new Pessoa(Caixa.retorna("Qual o seu primeiro nome?\n\n"),
				Caixa.retornaNum("Qual sua idade?\n\n"));

		// comeca historia
		Historia historia = new Historia(7);
		
		Evento e0 = new Evento(Textos.getTexto(jogador, 8), 1);
		Evento e1 = new Evento(Textos.getTexto(jogador, 1), "Olho o corpo", "Vou embora", 2, 3);
		Evento e2 = new Evento(Textos.getTexto(jogador, 2), "copo", "piano", "veneno", 3, 4, 5);
		Evento e3 = new Evento(Textos.getTexto(jogador, 3), "c ta maluco", "oloco meu", "oloquinho meu", 2, 5, 6);
		Evento e4 = new Evento(Textos.getTexto(jogador, 4), "botao 1", "botao 2", 5, 3);
		Evento e5 = new Evento(Textos.getTexto(jogador, 5), "socar o assassino", "chorar", "gritar", 6, 3, 2);
		Evento e6 = new EventoFinal(Textos.getTexto(jogador, 12), 12);
		
		
		historia.addHistoria(e0);
		historia.addHistoria(e1);
		historia.addHistoria(e2);
		historia.addHistoria(e3);
		historia.addHistoria(e4);
		historia.addHistoria(e5);
		historia.addHistoria(e6);

		historia.getHistoria();

	}
}