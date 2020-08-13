import java.util.Scanner;
public class ExemploFluxo{

    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        int calculo;
        int operacao;

    Scanner sc = new Scanner(System.in);

    System.out.println("");
    System.out.println("Digite a opção desejada: ");
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
        System.out.println("O resultado da soma e: " + calculo);
    }

    if(operacao == 2){
        calculo = numeroUm - numeroDois;
        System.out.println("O rsultado da subtracao e: " + calculo);
    }

    sc.close();

    }
}