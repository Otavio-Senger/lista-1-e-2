
package lista.pkg2;
import java.util.Scanner;

public class ex10 {
    Scanner sc = new Scanner(System.in);
    String palavra;
    int vogais = 0;
    int consoantes = 0;
    
    
    public ex10() {
   palavra = sc.nextLine();
   
   palavra = palavra.toLowerCase();
   
   for (char contador : palavra.toCharArray()) {
       if (contador == 'a' || contador == 'e' || contador == 'i' || contador == 'o' || contador == 'u'){
           vogais++;
       }else if (contador >='a' && contador <='z'){
           consoantes++;
       }
       
   }
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

    public int getVogais() {
        return vogais;
    }

    public void setVogais(int vogais) {
        this.vogais = vogais;
    }

    public int getConsoantes() {
        return consoantes;
    }

    public void setConsoantes(int consoantes) {
        this.consoantes = consoantes;
    }
    
    
}
