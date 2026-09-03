package estudos.java.maratonajava.javacore.ZZDoptional.dominio;

public class Manga {
    private Integer id;
    private String title;
    private  int chapters;

    public Manga(Integer id, String nome, int chapters) {
        this.id = id;
        this.title = nome;
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
