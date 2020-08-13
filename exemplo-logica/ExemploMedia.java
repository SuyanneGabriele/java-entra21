import java.util.Scanner;

public class ExemploMedia{

    public static void main(String[] args) {
        double numeroUm;
        double numeroDois;
        double numeroTres;
        double numeroQuatro;
        double media;
        double soma;

    //  Trabalhando com a classe ClasseMatematica
    Scanner sc = new Scanner(System.in);


    //  Entrar com 4 valores e calcular a media deles

    System.out.println("Digite o primeiro valor: ");
    numeroUm = sc.nextDouble();
    System.out.println("Digite o segundo valor: ");
    numeroDois = sc.nextDouble();
    System.out.println("Digite o terceiro valor: ");
    numeroTres = sc.nextDouble();
    System.out.println("Digite o quarto valor: ");
    numeroQuatro = sc.nextDouble();
    
    sc.close();

    soma = numeroUm + numeroDois + numeroTres + numeroQuatro;
    media = soma / 4;

    System.out.println("A media entre os quatro numeros e: " + media);

   

    }
}