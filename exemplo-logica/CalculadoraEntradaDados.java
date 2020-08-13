import java.util.Scanner;
public class CalculadoraEntradaDados{

	public static void main(String[] args){
                
                /* 
                Desenvolver as quatro operações com entrada de dados
                com 2 numeros
                */

                double numeroUm;
                double numeroDois;
                double soma;
                double subtracao;
                double divisao;
                double multiplicacao;

                Scanner sc = new Scanner(System.in);

                System.out.println("Digite um valor: ");
                numeroUm = sc.nextDouble();

                System.out.println("Digite o segundo valor: ");
                numeroDois = sc.nextDouble();

                soma = numeroUm + numeroDois;
                subtracao = numeroUm - numeroDois;
                divisao = numeroUm / numeroDois;
                multiplicacao = numeroUm * numeroDois;

                System.out.println("O resultado da soma e: " + soma);
                System.out.println("O resultado da subtracao e: " + subtracao);
                System.out.println("O resultado da divisao e: " + divisao);
                System.out.println("O resultado da multiplicacao e: " + multiplicacao);
                System.out.println("Te amo Igor, seeu chato <3 ");

                sc.close();
                
               
        } 

}