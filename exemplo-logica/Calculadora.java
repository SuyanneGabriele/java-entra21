import java.util.Scanner;
public class Calculadora{

	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                
                System.out.println("Digite um numero:");
                int numeroUm = sc.nextInt();

                System.out.println("Digite outro numero:");
                int numeroDois = sc.nextInt();

                sc.close();

                int resultadoSoma = numeroUm + numeroDois;
                int resultadoSubtracao = numeroUm - numeroDois;
                double resultadoDivisao = numeroUm / numeroDois;
                int resultadoMultiplicacao = numeroUm * numeroDois;

                System.out.println("O resultado da soma desses numeros e " + resultadoSoma);
                System.out.println("O resultado da subtracao desses numeros e " + resultadoSubtracao);
                System.out.println("O resultado da divisao desses numeros e " + resultadoDivisao);
                System.out.println("O resultado da multiplicacao desses numeros e " + resultadoMultiplicacao);

                
        } 

}