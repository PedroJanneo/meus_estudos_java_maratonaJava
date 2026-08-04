package estudos.java.maratonajava.javacore.Xserializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 739959230178355185L;

    private Long id;
    private String nome;
    private transient String pass; // faz com que este atributo nao seja serializado
    private static String nomeEscola = "devdojo";
    private transient Turma turma;


    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
           String nomeTurma =  ois.readUTF();
           turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }

    public Aluno(Long id, String nome, String pass) {
        this.id = id;
        this.nome = nome;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pass='" + pass + '\'' +
                ", escola=" + nomeEscola + '\'' +
                ",turma=" + turma + '\'' +
                '}';
    }
}
