package lista.pkg2;

import java.util.Scanner;

public class ex6 {

    Scanner sc = new Scanner(System.in);
    String nome;
    StringBuilder palavra2;
    String nomeformatado;
    String[] palavras;
    String nomefinal;

    public ex6() {
        nome = sc.nextLine();
        palavra2 = new StringBuilder();
        palavras = nome.split("\\s+");

        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                String palavra1 = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
                palavra2.append(palavra1).append(" ");

                nomefinal = palavra2.toString().trim();
            }
        }

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

    public StringBuilder getPalavra2() {
        return palavra2;
    }

    public void setPalavra2(StringBuilder palavra2) {
        this.palavra2 = palavra2;
    }

    public String getNomeformatado() {
        return nomeformatado;
    }

    public void setNomeformatado(String nomeformatado) {
        this.nomeformatado = nomeformatado;
    }

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public String getNomefinal() {
        return nomefinal;
    }

    public void setNomefinal(String nomefinal) {
        this.nomefinal = nomefinal;
    }

}
