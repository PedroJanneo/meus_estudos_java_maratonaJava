package estudos.java.maratonajava.javacore.Xserializacao.test;

import estudos.java.maratonajava.javacore.Xserializacao.dominio.Aluno;
import estudos.java.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * pegar um objeto e ficar persistindo nele <br>
 * OS frameworks usam mt este metodo <br>
 * salvar o estado de um objeto e trabalhar om ele depois.
 */
public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(001L,"Peu","12345");
        Turma turma = new Turma("slasajjdisi");
        aluno.setTurma(turma );
        serializar(aluno); // para serializar, a classe aluno tem que implementar a interface Serializable

        deseralizar(); // o construtor nao é chmado



    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pastaSerializar/alunos.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
                oos.writeObject(aluno);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deseralizar(){
        Path path = Paths.get("pastaSerializar/alunos.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
           Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
