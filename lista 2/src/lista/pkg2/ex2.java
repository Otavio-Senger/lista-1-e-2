
package lista.pkg2;
import java.util.Scanner;

public class ex2 {
    Scanner sc = new Scanner(System.in);
    String frase;
    String frasemodificada;

    public ex2() {
    frase = sc.nextLine();
    frasemodificada = frase.replace('a', '*').replace('A', '*');
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

    public String getFrasemodificada() {
        return frasemodificada;
    }

    public void setFrasemodificada(String frasemodificada) {
        this.frasemodificada = frasemodificada;
    }
    
    
    
    
}
