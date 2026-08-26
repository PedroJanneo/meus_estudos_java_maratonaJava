package estudos.java.maratonajava.javacore.ZZAclassesinternas;

/**
 * classes anonimas: classes que vao existir por um curto tempo, e que nao podem ser reutilizadas
 */
class Animal{
    public void Walk(){
        System.out.println("walking");
    }
}
public class AnonymousClassesTest01 {

    public static void main(String[] args) {
        Animal animal = new Animal(){ // classe anonima / abre chaves após o () e aperta CTRL + O
            @Override
            public void Walk(){
                System.out.println("walking in the shadowns");
                jump();
            }

            public void jump(){
                System.out.println("jumping");
            }



        };
        animal.Walk();
//        animal.jump(); -> este metodo nao existe na classe original, so na classe anonima, nao pode ser acessada diretamente

        
    }
}
