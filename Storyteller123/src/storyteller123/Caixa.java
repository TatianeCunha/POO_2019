package storyteller123;
import javax.swing.JOptionPane;

public class Caixa {
	
	public static void messageOk (String message) {
		JOptionPane.showMessageDialog(null, message, null, JOptionPane.DEFAULT_OPTION);
	}
	
	public static String retorna (String message) {
		return (JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE));
		
	}


}
