
package lista.pkg2;
import java.util.Scanner;

public class ex9 {
    Scanner sc = new Scanner(System.in);
    String frase;
    String formatada;

    public ex9() {
    frase = sc.nextLine();
    formatada = frase.replaceAll("\\s+", " ").trim();
    
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

    public String getFormatada() {
        return formatada;
    }

    public void setFormatada(String formatada) {
        this.formatada = formatada;
    }
    
    
    
    
}
