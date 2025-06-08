
import java.util.Scanner;

public class Desafios1{
    public static void main(String[] args) {
        // Pessoa();
        //Calculadora();

        //Musica minhaMusica = new Musica("Nome da Música", "Nome do Artista", 2023);
        //minhaMusica.exibeFichaTecnica();
        //Carro();
        Aluno();
    }
    public void Pessoa(){
        String pessoa = "Olá mundo!";
        System.out.println(pessoa);
    }
    public void Calculadora(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitura.nextInt();
        int dobro = num *2;
        System.out.println("O dobro desse número é: "+ dobro);
        leitura.close();
    }
    public void Carro (){
        String modelo = "Gol";
        int ano = 2023;
        String cor = "Preto";

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);

        int calculaIdade= 2023 - ano;
        System.out.println("Idade do carro: " + calculaIdade + " anos");
    }
    public static void Aluno() {
        String nome = "Akemi";
        int idade = 18;

       System.out.println("Nome do aluno: " + nome);
       System.out.println("Idade do aluno: " + idade);

    }

}
// Classe Musica separada, não dentro de Desafios1
class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
}