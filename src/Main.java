public class Main {
    public static void main(String[] args) {
        //Aula inicial de Orientação á Objetos
        Pessoa adao = new Pessoa();
        //Declarção
        Pessoa qualquer;
        //Instanciação
        qualquer = new Pessoa();
        //Definir forma do objeto;
        qualquer.nome = "rita";
        qualquer.sobrenome = "Lee";
        //Definir comportamento;
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));
    }
}
