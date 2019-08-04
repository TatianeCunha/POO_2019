package storyteller;

import javax.swing.JOptionPane;

public class EventoFinal extends Evento {

	public EventoFinal(String descricao, int path1) {
		super(descricao, path1);
	}

	@Override
	public int getEvento(Pessoa jogador) {
		JOptionPane.showMessageDialog(null, getDescricao());
		return 2019;
	}
}
