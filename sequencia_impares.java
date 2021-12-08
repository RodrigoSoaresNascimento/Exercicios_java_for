import java.util.Scanner;
public class sequencia_impares {
    public static void main(String[]agrs){
        //Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.//

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int X = entrada.nextInt();
        int i;
        entrada.close();
        for ( i = 1; i <= X; i++ ){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        
        
        
        
        
        
        
        
        
        
       
    }
}
