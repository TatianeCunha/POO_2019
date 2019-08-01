package storyteller123;
import java.util.Scanner;

public class Documentos extends Pessoa {

    private String localNasc;
    
    public Documentos(){
         Scanner leitor = new Scanner(System.in);
         //Colocar input para adicionar nome 
         //Colocar imput para adicionar idade
        this.setNome(leitor.next());
    }


    public String getLocalNasc() {
        return localNasc;
    }

    public void setLocalNasc(String localNasc) {
        
        this.localNasc = localNasc;
    }


}
