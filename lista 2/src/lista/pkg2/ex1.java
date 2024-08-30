
package lista.pkg2;
import java.util.Scanner;

public class ex1 {
  Scanner sc = new Scanner(System.in);
    String palavra;
   int contagem;

    public ex1() {
        palavra = sc.nextLine();
        contagem = palavra.length();
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

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
   
   
}
