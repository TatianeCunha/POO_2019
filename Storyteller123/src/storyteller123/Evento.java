package storyteller123;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import Imagens.*;


public class Evento {
     private String descricao;
    private String[] opcoes;
    private int p;

    public int setGetP() {
        this.p ++;
        return p;
    }
	
	public Evento (String descricao, String op1, String op2) {
		opcoes = new String[2];
		opcoes[0] = op1;
		opcoes[1] = op2;
		
		this.descricao = descricao;
	}
	
	public Evento (String descricao, String op1, String op2, String op3) {
		opcoes = new String[3];
		opcoes[0] = op1;
		opcoes[1] = op2;
		opcoes[2] = op3;
		
		this.descricao = descricao;
	}
	
	public int getEvento() {
		
 
		if (opcoes.length == 2) {
			 JOptionPane.showOptionDialog(null, this.getDescricao(), "Evento", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, this.getOpcoes(), null);
                                                        return setGetP();
		}
		if (opcoes.length == 3) {
			JOptionPane.showOptionDialog(null, this.getDescricao(), "Evento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, this.getOpcoes(), null);
                                                        return setGetP();
		}else {
			return -1;
		}
		
	}
        
                    public int getEventoEspecial(){
                                //Serão eventos que conterão imagens
                                
                                    ImageIcon quadro1 = new ImageIcon(Imagens.class.getResource("86c0728f69316a7cbffd8de3005a52a7 555555.jpg"));
                                    ImageIcon quadro2 = new ImageIcon(Imagens.class.getResource("tumblr_nbhkx8FhKP1ryvq99o2_500.gif"));
                                    

                        
                                if (opcoes.length == 2) {
                                              JOptionPane.showOptionDialog(null, this.getDescricao(), "Evento", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, quadro1, this.getOpcoes(), null);
                                              return setGetP();
                                  }
                                  if (opcoes.length == 3) {
                                                JOptionPane.showOptionDialog(null, this.getDescricao(), "Evento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, quadro2, this.getOpcoes(), null);
                                               return setGetP();
                                  }else {
                                               return -1;
                                   }
                    }
   

	public String getDescricao() {
		return this.descricao;
	}

	public String[] getOpcoes() {
		return this.opcoes;
	}
	

}
