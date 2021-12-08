import java.util.Scanner;
public class par_impar {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar? ");
        int N = entrada.nextInt();
        
        

        for( int i = 0; i < N; i++){
            System.out.println("Digite um numero: ");
            int X = entrada.nextInt();
            if( X % 2 != 0 && X % 2 < 0){
                
                System.out.println("impar negativo " );
            }else if (X % 2 != 0 && X % 2 > 0){
                
                System.out.println("impar positivo " );

            }else if ( X % 2 <= 0){
                System.out.println("par positivo " );  
            }else if( X % 2 >= 0){
                System.out.println("par negativo " );
            }else{
                System.out.println("nulo");
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        entrada.close();
    }
}