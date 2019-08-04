package storyteller;

public class Principal {
	public static void main(String[] args) {

		Caixa.messageOk(Textos.getInicio());
		
		Pessoa jogador = new Pessoa(Caixa.retorna("Qual o seu primeiro nome?\n\n"),
				Caixa.retornaNum("Qual sua idade?\n\n"));

		// comeca historia
		Historia historia = new Historia(16);
		
		Evento e0 = new Evento(Textos.getTexto(jogador, 0), 1);
		Evento e1 = new Evento(Textos.getTexto(jogador, 1), "Verificar lembraça", "Verificar o objeto no chão", 2, 3);
		Evento e2 = new Evento(Textos.getTexto(jogador, 2), "Bater na porta e gritar por ajuda", "Verificar o objeto no chão", 8, 3);
		Evento e3 = new Evento(Textos.getTexto(jogador, 3), "Bater na porta e gritar por ajuda", "Analisar a escrivaninha ao lado da porta", "Ouvir a fita cassete que está no chão", 8, 4, 10);
		Evento e4 = new Evento(Textos.getTexto(jogador, 4), "Tentar abrir a porta", "Olhar a roupa do corpo", 5, 7);
		Evento e5 = new Evento(Textos.getTexto(jogador, 5), "Analisar a escrivaninha ao lado da porta", "Olhar a roupa do corpo", 4, 7);
                                     Evento e6 = new Evento(Textos.getTexto(jogador, 6), "Ver a cama no canto da parede", "Gritar", 9, 12);
		Evento e7 = new Evento(Textos.getTexto(jogador, 7), "Olhar em volta do quarto", "Ouvir a fita cassete que está no chão", 6, 10);
		//Olhar esse
                                    Evento e8 = new Evento(Textos.getTexto(jogador, 8), 13);
		Evento e9 = new Evento(Textos.getTexto(jogador, 9), "Tentar abrir a porta","Olhar em volta do quarto", 5, 6 );
		Evento e10 = new Evento(Textos.getTexto(jogador, 10), "Olhar a parede", "Gritar", "Analisar a escrivaninha ao lado da porta",11, 12, 4);
		Evento e11 = new Evento(Textos.getTexto(jogador, 11), "Ver a cama no canto da parede", "Tentar abrir a porta", "Gritar", 9, 5, 12);
                                      //Olhar esse
                                     Evento e12 = new Evento(Textos.getTexto(jogador, 12), 14);
                                     //Olhar esse
		Evento e13 = new EventoFinal(Textos.getTexto(jogador, 13), 13);
		Evento e14 = new Evento(Textos.getTexto(jogador, 14), "Matar", "Não matar",15,16);
                //Olhar esse
		Evento e15 = new EventoFinal(Textos.getTexto(jogador, 15),15);
                //Olhar esse
                                    Evento e16 = new EventoFinal(Textos.getTexto(jogador, 16),16);

		
                
                //Evento e6 = new EventoFinal(Textos.getTexto(jogador, 12), 12);
		
		
		historia.addHistoria(e0);
		historia.addHistoria(e1);
		historia.addHistoria(e2);
		historia.addHistoria(e3);
		historia.addHistoria(e4);
		historia.addHistoria(e5);
		historia.addHistoria(e6);
                		historia.addHistoria(e7);
		historia.addHistoria(e8);
		historia.addHistoria(e9);
		historia.addHistoria(e10);
		historia.addHistoria(e11);
		historia.addHistoria(e12);
		historia.addHistoria(e13);
                		historia.addHistoria(e14);
		historia.addHistoria(e15);
		historia.addHistoria(e16);

		historia.getHistoria();

	}
}