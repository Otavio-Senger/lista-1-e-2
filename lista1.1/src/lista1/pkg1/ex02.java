
package lista1.pkg1;

import java.util.Scanner;


public class ex02 {

    Scanner sc = new Scanner(System.in);
    String nome;
    String texto;
    String pedido;

    public ex02() {
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        texto = "olá " + nome + ", bem vindo ao programa";
        
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
    
    
}


