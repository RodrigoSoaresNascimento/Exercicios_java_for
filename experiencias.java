import java.util.Scanner;
public class experiencias {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos casos de teste serao digitados? ");
        int testes = entrada.nextInt();
        int cobaias = 0; int rato = 0; int sapo = 0; int coelho = 0; int total = 0;
        double ratoPorce = 0; double coelhoPorce = 0; double sapoPorce = 0;
        String tipo = "";
        for(int i = 0; i <= testes; i++){
            System.out.println("Quantidade de cobaias: ");
            cobaias = entrada.nextInt();
            System.out.println("Tipo de cobaia: ");
            tipo = entrada.next();
            if(tipo.equals("Rato")){
                rato = cobaias + rato;
            }else if(tipo.equals("Coelho")){
                coelho = coelho + cobaias;
            }else if(tipo.equals("Sapo")){
                sapo = sapo + cobaias;
            }else{
                System.out.println("Digite uma cobaia valida: ");
            }
        }
        total = sapo + coelho + rato;
        ratoPorce = (rato * 100)/total ;
        sapoPorce = (sapo * 100)/total ;
        coelhoPorce = (coelho * 100)/total ;
        System.out.println("RELATORIO FINAL: ");
        System.out.println("Total: " + total );
        System.out.println("Ratos" + rato);
        System.out.println("Sapos" + sapo);
        System.out.println("Coelhos" + coelho);
        System.out.println("Ratos" + rato);
        System.out.println("Percentual de ratos:" + ratoPorce);
        System.out.println("Percentual de sapos:" + sapoPorce);
        System.out.println("Percentual de coelhos:" + coelhoPorce);
        entrada.close();
    }
}
