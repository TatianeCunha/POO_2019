package storyteller;

import javax.swing.JOptionPane;

public abstract class Caixa {

	public static void messageOk(String message) {
		JOptionPane.showMessageDialog(null, message, null, JOptionPane.PLAIN_MESSAGE);
	}

	public static int getKiller(Pessoa jogador) {
		String killersName = JOptionPane.showInputDialog(null, "Digite o nome do assassino:", null,
				JOptionPane.PLAIN_MESSAGE);
		if (killersName.equals(jogador.getNome())) {
			return 14;
		} else
			return 13;
	}

	public static String retorna(String message) {
		String a = JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE);
		if (a.length() == 0) {
			Caixa.retorna("Me diga por favor\n " + message);
		}
		return a;

	}

	public static int retornaNum(String message) {
		int a = 0;
		try {
			a = Integer.parseInt(Caixa.retorna(message));
			if (a < 18)
				Caixa.retornaNum(message);

		} catch (NumberFormatException e) {
			Caixa.retornaNum("Nao entendi, me responda\n" + message);
		}

		return a;

	}

	public static int caixa2Eventos(String descricao, String[] opcoes) {
		return JOptionPane.showOptionDialog(null, descricao, null, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, null);

	}

}
