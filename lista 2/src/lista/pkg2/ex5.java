
package lista.pkg2;
import java.util.Scanner;

public class ex5 {
    Scanner sc = new Scanner(System.in);
    String frase;
    String[] palavras;
    int quantidade;

    public ex5() {
    frase = sc.nextLine();
    palavras = frase.split("\\s+");
    quantidade = palavras.length; 
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
}
