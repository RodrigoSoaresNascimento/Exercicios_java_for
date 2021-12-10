import java.util.Scanner;
public class Fatorial{
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        boolean continuacao = true;
        
        int i; int multiplicacao = 1;
        int numero;
        
        while(continuacao){
            
            System.out.println("Digite o valor de N: ");
            numero = entrada.nextInt();
            multiplicacao = 1;
            for(i = 1; i < numero; numero--){
                multiplicacao = multiplicacao * numero;
            }
            System.out.println("FATORIAL = " + multiplicacao);
            System.out.println("Deseja continuar? [1 para Sim / 2 para Não] ");
            int resposta = entrada.nextInt();
            if(resposta == 2){
                continuacao = false;
            }
            
        }
        entrada.close();



        
    }
}