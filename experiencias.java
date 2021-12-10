import java.util.Scanner;
public class experiencias {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos casos de teste serao digitados? ");
        int testes = entrada.nextInt();
        int cobaias = 0;
        for(int i = 0; i <= testes; i++){
            System.out.println("Quantidade de cobaias: ");
            cobaias = entrada.nextInt();
            
            System.out.println("Tipo de cobaia: ");
        }

        entrada.close();
    }
}
