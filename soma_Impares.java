import java.util.Scanner;
public class soma_Impares {
    public static void main(String[]agrs){
        //Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números impares entre eles.//

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int X = entrada.nextInt();
        int Y = entrada.nextInt();
        entrada.close();
        int n = 0; int i; int soma = 0;
        if (X > Y){
            n = X;// armazena o variavel x//
            X = Y;// converte X em Y//
            Y = n;// salva a variavel//
        }//para i de X + 1 ate que Y seja maior que i, excluindo Y, interre mais 1//
        for(i = X+1; i < Y; i++){
            if( i % 2 != 0){
                soma = soma + i;
                
            }
        }
        System.out.println("SOMA DOS IMPARES = "+ soma);
        
        
        
        
        
        
    }
}
