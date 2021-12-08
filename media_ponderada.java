import java.util.Scanner;
public class media_ponderada {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        /*Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
        teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo 
        que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar 
        que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida 
        pela soma dos pesos.*/ 
        System.out.println("Quantos casos voce vai digitar? ");
        int N = entrada.nextInt();
        int i;
        double nota1, nota2, nota3, mediaP;
        
        for(i=0; i < N; i++){
            System.out.println("Quantos casos voce vai digitar? ");
            nota1 = entrada.nextDouble();
            nota2 = entrada.nextDouble();
            nota3 = entrada.nextDouble();
            mediaP = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/ (2+3+5);
            System.out.println("Media =" + mediaP);
        }
        entrada.close();
    }
}
