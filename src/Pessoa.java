public class Pessoa {
    //Atribbutos
    String nome;
    String sobrenome;
    //Métodos
    public void falar(){
        System.out.println("falei");
    }
    //Sobrecarga do metodo falar()
    public String falar(String volume){
        return "falei" + volume;

    }
    //Construtor
    Pessoa(){

    }
    Pessoa(String _nome){
        this.nome = _nome;
    }
}
