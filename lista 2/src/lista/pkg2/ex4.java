
package lista.pkg2;
import java.util.Scanner;

public class ex4 {
    Scanner sc = new Scanner(System.in);
    String palavra;
    String verificacao;
    String status;
    

    public ex4() {
    palavra = sc.nextLine();
    verificacao = new StringBuilder(palavra).reverse().toString();
    status = (palavra.equals(verificacao)) ? palavra + " é um palíndromo" : palavra + " não é um palíndromo";
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

    public String getVerificacao() {
        return verificacao;
    }

    public void setVerificacao(String verificacao) {
        this.verificacao = verificacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
