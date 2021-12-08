import java.util.Scanner;
public class dentro_fora {
    public static void main(String[]agrs){
        /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo.*/
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int N = entrada.nextInt();
        int dentro = 0; int fora = 0;
        

        for( int i = 0; i < N; i++){
            System.out.println("Digite um numero: ");
            int X = entrada.nextInt();
            if( X >= 10 && X <= 20){
                dentro++;
                System.out.println("DENTRO " + dentro);
            }else{
                fora++;
                System.out.println("FORA " + fora);

            }
        }
        System.out.println("DENTRO " + dentro);
        System.out.println("FORA " + fora);
        entrada.close();
    }


}
