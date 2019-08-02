package storyteller;

import javax.swing.JOptionPane;

//revisado
public class Evento {
	private String descricao;
	private String[] opcoes;
	private int path1;
	private int path2;
	private int path3;

	public Evento(String descricao, int path1) {
		this.opcoes = new String[0];
		this.descricao = descricao;
		this.path1 = path1;
	}

	public Evento(String descricao, String op1, String op2, int path1, int path2) {
		this.opcoes = new String[2];
		this.opcoes[0] = op1;
		this.opcoes[1] = op2;

		this.path1 = path1;
		this.path2 = path2;

		this.descricao = descricao;
	}

	public Evento(String descricao, String op1, String op2, String op3, int path1, int path2, int path3) {
		this.opcoes = new String[3];
		this.opcoes[0] = op1;
		this.opcoes[1] = op2;
		this.opcoes[2] = op3;

		this.path1 = path1;
		this.path2 = path2;
		this.path3 = path3;

		this.descricao = descricao;
	}

	public int getEvento() {
		if (opcoes.length == 0) {
			Caixa.messageOk(getDescricao());
			return this.path1;
		}

		if (opcoes.length == 2) {
			int key = JOptionPane.showOptionDialog(null, this.getDescricao(), null, JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, this.getOpcoes(), null);
			switch (key) {
			case JOptionPane.YES_OPTION:
				return this.path1;
			case JOptionPane.NO_OPTION:
				return this.path2;
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}

		if (opcoes.length == 3) {
			int key = JOptionPane.showOptionDialog(null, this.getDescricao(), "Evento", JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, this.getOpcoes(), null);
			switch (key) {
			case JOptionPane.YES_OPTION:
				return this.path1;
			case JOptionPane.NO_OPTION:
				return this.path2;
			case JOptionPane.CANCEL_OPTION:
				return this.path3;
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}
		return 0;

	}

	public String getDescricao() {
		return this.descricao;
	}

	public String[] getOpcoes() {
		return this.opcoes;
	}

}
