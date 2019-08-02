package storyteller;

//revisado
public class Historia {
	private Evento[] eventos;

	public Historia(int numeroDeEventos) {
		eventos = new Evento[numeroDeEventos];
	}

	public void addHistoria(Evento evento) {
		for (int i = 0; i < eventos.length; i++) {
			if (eventos[i] == null) {
				eventos[i] = evento;
				break;
			}

		}
		System.out.println("Historia adicionada");
	}

	public void getHistoria() {
		for (int i = 0; i < eventos.length; i = (eventos[i].getEvento()-1)) {
			eventos[i].getDescricao();
		}
		
		System.out.println("FIM");
		
	}

}
