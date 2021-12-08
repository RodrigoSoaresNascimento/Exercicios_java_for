import java.util.Scanner;
public class tabuada{
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        int x = 0; int multiplicacao = 0;
        
        System.out.println("Deseja a tabuada para qual valor? ");
        int n = entrada.nextInt();
        entrada.close();
        //para de valor inicial = 1 ate valor final = 10, adicione mais 1 e faça, a multiplicação dos valores de 1 a 10 com n//
        for(x = 1; x < 11; x++){
            multiplicacao = x * n;
            System.out.println(n + " * " + x +" = " + multiplicacao);

        }
        


    }
}