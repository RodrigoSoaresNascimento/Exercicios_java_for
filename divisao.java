import java.util.Scanner;
public class divisao {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos casos voce vai digitar? ");
        int N = entrada.nextInt();
        int i;
        double numerador, denominador, div;
        
        for(i = 0; i < N; i++){
            System.out.println("Entre com o numerador: ");
            numerador = entrada.nextDouble();
            System.out.println("Entre com o denominador: ");
            denominador = entrada.nextDouble();
            if (denominador == 0){
                System.out.println("DIVISAO IMPOSSIVEL ");
            }else{
                div = numerador/denominador;
                System.out.println("DIVISAO = " + div);
            }
            
        }
        entrada.close();
        
        
        
        
        
        
    }
}
