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


        //Criar mais objetos
        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        Animal roedor; //declarar
        roedor = new Animal(); //Instancia
        Animal x;

        x = new Animal();

        //Consultar dados do objeto cao
        cao.nome = "Pluto";
        System.out.println(cao.nome);
    }

}
