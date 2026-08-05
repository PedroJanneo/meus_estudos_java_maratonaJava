package estudos.java.maratonajava.javacore.YColecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // control + o ( para mostrar a opcao de 'manipular' o equals ( e outros metodos )
// Reflexivo: x.equals(x) tem que ser true para qualquer x diferente de null.
// Simétrico: Para x e y diferentes de null, se x.equals(y) == true, então y.equals(x) deve ser true.
// Transitividade: Para x, y e z diferentes de null, se x.equals(y) == true e y.equals(z) == true, logo x.equals(z) deve ser true.
// Consistente: Para x e y diferentes de null, x.equals(y) deve sempre retornar o mesmo valor, desde que os objetos não sejam alterados.
// Não-nulo: Para x diferente de null, x.equals(null) deve sempre retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // se objeto for null retorne false
        if (this == obj) return true; // se obj da classe for igual o parametro retorna true
        if (this.getClass() != obj.getClass())
            return false; // verifica se a classe de ambos é diferente, se for, retorna false
        Smartphone obj1 = (Smartphone) obj; /// criando o objeto em casting
        return serialNumber != null && serialNumber.equals(obj1.serialNumber); // verificando se o serialNumber é o memsmo
    }

    // 1. Se x.equals(y) == true, obrigatoriamente y.hashCode() == x.hashCode().
// 2. Se y.hashCode() == x.hashCode(), NÃO necessariamente y.equals(x) será true (ocorre colisão).
// 3. Se x.equals(y) == false, os hashCodes podem ser iguais ou diferentes.
// 4. Se y.hashCode() != x.hashCode(), obrigatoriamente x.equals(y) é false.
    @Override
    public int hashCode() {

        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
