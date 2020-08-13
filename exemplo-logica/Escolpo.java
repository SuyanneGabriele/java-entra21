import java.util.Scanner;
public class Escolpo{

    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        int operacao;

    Scanner sc = new Scanner(System.in);

    System.out.println("");
    System.out.println("Digite a opcao desejada: ");
    System.out.println("");
    System.out.println("1- Somar");
    System.out.println("2- Subtrair");
    System.out.println("");
    operacao = sc.nextInt();
 
    System.out.println("Digite o primeiro valor: ");
    numeroUm = sc.nextInt();

    System.out.println("Digite o segundo valor: ");
    numeroDois = sc.nextInt();

    if (operacao == 1){
        calculo = numeroUm + numeroDois;
        mensagemSoma = "O resultado da soma e: " + calculo;
        System.out.println(mensagemSoma);
    }

    if(operacao == 2){
        calculo = numeroUm - numeroDois;
        mensagemSubtracao ="O resultado da subtracao e: " + calculo;
        System.out.println(mensagemSubtracao);
    }

    sc.close();

    }
}