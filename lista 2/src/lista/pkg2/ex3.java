
package lista.pkg2;
import java.util.Scanner;

public class ex3 {
    Scanner sc = new Scanner(System.in);
    String palavra;
    String invertida;

    public ex3() {
    palavra = sc.nextLine();    
    invertida = new StringBuilder(palavra).reverse().toString();   
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getInvertida() {
        return invertida;
    }

    public void setInvertida(String invertida) {
        this.invertida = invertida;
    }
    
    
}
