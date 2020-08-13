public class CalcularValores{

	public static void main(String[] args){

        double numeroUm;
        double numeroDois;
        double soma, subtracao, divisao, multiplicacao;


        // Irá fazer um calculo de soma
        numeroUm = 15;
        numeroDois = 80;

        soma = numeroUm + numeroDois;
        subtracao = numeroUm - numeroDois;
        divisao = numeroUm / numeroDois;
        multiplicacao = numeroUm * numeroDois;
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtracao: " + subtracao);
        System.out.println("Resultado da divisao: " + divisao);
        System.out.println("Resultado da multipicacao: " + multiplicacao);
}

}