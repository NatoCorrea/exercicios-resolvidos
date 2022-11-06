
package exercicio011;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio011 {
/*11. Faça um algoritmo que receba o preço de custo de um produto e mostre o 
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo 
com um percentual informado pelo usuário;
    */
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       float precoCusto, valorVenda, acrescimo;
       
        System.out.println("Qual o preço de custo do produto? R$");
        precoCusto = sc.nextFloat();
        System.out.println("Quantos porcentos de acrescimo o produto tem? ");
        acrescimo = sc.nextFloat();
        
        valorVenda = precoCusto + (precoCusto * (acrescimo / 100));
        System.out.println("O valor de venda do produto será de R$" + valorVenda);        
       sc.close();
    }
    
}
