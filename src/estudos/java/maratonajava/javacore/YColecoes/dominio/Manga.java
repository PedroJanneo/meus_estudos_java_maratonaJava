package estudos.java.maratonajava.javacore.YColecoes.dominio;

import java.util.Objects;

/**
 * Diferente do exemplo em ListSortTest01, String/Double ja implementam a Comparable nativamente, diferente da classe Manga (classe criada poe mim)
 */

public class Manga implements Comparable<Manga>{ // implementando a interface para ordenar (Comparable )
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"ID nao pode ser nulo"); // garantir que nao sao nulos + mensagem personalizada ( lancar excessao)
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Manga outroManga) {
        // retornar numero inteiro
        // retorna negativo -> se o this < outroManga
        // retorna 0 se this == outroManga
        // retorna positivo se this > outroManga
//      if(this.id < outroManga.getId()){
//          return -1;
//      }
//      else if(this.id.equals(outroManga.getId())){
//          return 0;
//      }
//      else {
//          return 1;
//      }

//        return  this.id.compareTo(outroManga.getId()); // o codigo 75-83 pode ser resumida esta linha, pois Long ja tem o compareTo / Long (Wrapper)
        // desta forma, estamos organizando por preco
//        return Double.valueOf(preco).compareTo(outroManga.getPreco()); // forçar o preco (double) virar um Wrapper (os Wrapper, ja vem com o compareTo nativo)

        // desta forma estamos organizando em ordem alfabetica
        return this.nome.compareTo(outroManga.getNome()); // Strings ja tem o compareTo nativo

         }
}
