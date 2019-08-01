package storyteller123;

public class Historia {
      private Evento[] eventos;
	
	public Historia (int numeroDeEventos) {
		eventos = new Evento[numeroDeEventos];
	}
    
    public int part;
	
	public void addHistoria(Evento evento) {
		for (int i = 0; i < eventos.length; i++) {
			if (eventos[i] == null) {
				eventos[i] = evento;
				break;
			}
                                                        
		}
		System.out.println("Historia adicionada");
	}
	
	/*
	 * Cada evento, depois de estar em uma história, deve possuir um "destino", um desenrolar da história.
	 * É necessário uma função para organizar essa sequencia depois que estão em uma história, visto que
	 * os acontecimentos não são lineares.
	 * setHistoria -> deve percorrer todos os eventos, recebendo seus possíveis destinos
	 * getHistoria -> de acordo com as respostas de cada evento, deve ir para o evento correto
	*/
	
	public void getHistoria() {
                            int j ;
                            
                           for (int i = 0; i < eventos.length; i = j) {

                                switch (i) {
                                    case 3:
                                        j = eventos[i].getEventoEspecial();
                                        break;
                                    default:
                                        j = eventos[i].getEvento();
                                        break;
                                }
                          }
	}

    
}
