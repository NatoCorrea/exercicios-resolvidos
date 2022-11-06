
package exercicio010;
import java.util.Scanner;

/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio010 {
/*10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações 
sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o 
valor das prestações;
*/
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float valorCompra, valorParcela;
        int numeroParcelas;
        
        System.out.println("Qual o valor total da compra?");
        System.out.print("R$");
        valorCompra = sc.nextFloat();
        System.out.println("Em quantas parcelas você irá dividir?");
        numeroParcelas = sc.nextInt();
        
        valorParcela = valorCompra / numeroParcelas;
        
        System.out.println("Sua compra foi de R$" + valorCompra 
                + " e você pagará em " + numeroParcelas 
                + " parcelas de R$" + valorParcela);
        
        sc.close();
        
    }
    
}
