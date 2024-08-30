
package lista.pkg2;
import java.util.Scanner;

public class ex7 {
    Scanner sc = new Scanner(System.in);
    String email;
    String dominio;
    String[] partes;

    public ex7() {
    email = sc.nextLine();
    partes = email.split("@");
   
    if (partes.length == 2){
        dominio = partes[1];
        System.out.println("Domínio do email: " + dominio);
    }else {
        System.out.println("email inválido!");
    }
   
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String[] getPartes() {
        return partes;
    }

    public void setPartes(String[] partes) {
        this.partes = partes;
    }
    
    
    
}
