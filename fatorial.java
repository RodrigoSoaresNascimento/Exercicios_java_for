import java.util.Scanner;
public class fatorial{
    public static void main(String[]agrs){
        int i; int multiplicacao = 1;
        int resposta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int N = entrada.nextInt();
        
        for(i = 1; i < N; N--){
            multiplicacao = multiplicacao * N;
            
        }
        System.out.println("FATORIAL = " + multiplicacao);
        
        System.out.println("Deseja continuar? [ 1 para Sim ou  2 para Não] ");
        resposta = entrada.nextInt();
        
        while(resposta == 1){
            System.out.println("Digite o valor de N: ");
            N = entrada.nextInt();
            multiplicacao = 1;
            for(i = 1; i < N; N--){
            multiplicacao = multiplicacao * N;
            }
            System.out.println("FATORIAL = " + multiplicacao);
            System.out.println("Deseja continuar? [1 para Sim / 2 para Não] ");
            resposta = entrada.nextInt();
            
        }
        entrada.close();
       
    }
}