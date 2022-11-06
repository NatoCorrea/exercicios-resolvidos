
package exercicio022;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio022 {
/*Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. 
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
Informe o valor de custo de cada produto, o valor de venda de cada produto, 
a média de preço de custo e do preço de venda;
 */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeProduto;
        float precoCusto, precoVenda;
        float totalPrecoCusto = 0, mediaPrecoCusto = 0, totalPrecoVenda = 0, mediaPrecoVenda = 0;
        int qtdProdutos;
        System.out.println("Quantidade de produtos? ");
        qtdProdutos = sc.nextInt();
        
        for(int i = 0; i < qtdProdutos; i++){
            System.out.println("Produto? ");
            nomeProduto = sc.next();
            System.out.println("Preço de custo do " + nomeProduto + "?");
            precoCusto = sc.nextFloat();
            System.out.println("Preço de venda do " + nomeProduto + "?");
            precoVenda = sc.nextFloat();
            
            if (precoCusto > precoVenda){
                System.out.println("A venda do " + nomeProduto + " foi PREJUIZO.");
            }
            else if(precoCusto < precoVenda){
                System.out.println("A venda do " + nomeProduto + " foi LUCRATIVA.");
             }
            else{
                System.out.println("A venda do " + nomeProduto + " foi EMPATE");
            }
            totalPrecoCusto += precoCusto;
            totalPrecoVenda += precoVenda;
        }
        mediaPrecoCusto = totalPrecoCusto / qtdProdutos;
        mediaPrecoVenda = totalPrecoVenda / qtdProdutos;
        
        System.out.println("A média do preço de custo foi de R$" + mediaPrecoCusto);
        System.out.println("A média do preço de venda foi de R$" + mediaPrecoVenda);
        sc.close();
    }
    
}
