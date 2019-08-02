package storyteller;

import javax.swing.JOptionPane;

public abstract class Caixa {

	public static void messageOk(String message) {
		JOptionPane.showMessageDialog(null, message, null, JOptionPane.DEFAULT_OPTION);
	}

	public static String retorna(String message) {

		return (JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE));

	}

	public static int retornaNum(String message) {
		int a = 0;
		try {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE));

			if (a < 18)
				Caixa.retornaNum(message);

		} catch (NumberFormatException e) {
			Caixa.retornaNum(message);
		}

		return a;

	}

}
