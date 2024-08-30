
package lista.pkg2;
import java.util.Scanner;

public class ex8 {
    
    Scanner sc = new Scanner(System.in);
    String numero;
    String numerosfinais;
    String camuflagem;
    String finais;

    public ex8() {
    numero = sc.nextLine();
    
    if (numero.length() >=4) {
        numerosfinais = numero.substring(numero.length() - 4);
        
        camuflagem = "*".repeat(numero.length() -4);
        finais = camuflagem + numerosfinais;
        
        System.out.println("Últimos 4 dígitos: " + finais);
    }else{
        System.out.println("Número inválido!");
    }
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumerosfinais() {
        return numerosfinais;
    }

    public void setNumerosfinais(String numerosfinais) {
        this.numerosfinais = numerosfinais;
    }
    
    
    
}
