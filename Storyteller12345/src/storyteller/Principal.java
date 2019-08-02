package storyteller;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		
		
		
		Pessoa jogador = new Pessoa(Caixa.retorna("Qual o seu primeiro nome?\n\n"), Caixa.retornaNum("Qual sua idade?\n\n"));
		
		// comeca historia
		Historia historia = new Historia(6);

		Evento e1 = new Evento(Textos.getTexto(jogador, 1), "Olho o corpo", "Vou embora", 6, 3);
		Evento e2 = new Evento(Textos.getTexto(jogador, 2), "copo", "piano", "veneno", 3, 4, 5);
		Evento e3 = new Evento(Textos.getTexto(jogador, 3), "c ta maluco", "oloco meu", "oloquinho meu", 2, 3, 4);
		Evento e4 = new Evento(Textos.getTexto(jogador, 4), "botao 1", "botao 2", "botao 3", 4, 3, 2);
		Evento e5 = new Evento(Textos.getTexto(jogador, 5), "socar o assassino", "chorar", "gritar", 5, 3, 2);
		Evento e6 = new EventoFinal(Textos.getTexto(jogador, 12),12);
		
		historia.addHistoria(e6);
		historia.addHistoria(e2);
		historia.addHistoria(e3);
		historia.addHistoria(e4);
		historia.addHistoria(e5);
		
		

		historia.getHistoria();

	}
}