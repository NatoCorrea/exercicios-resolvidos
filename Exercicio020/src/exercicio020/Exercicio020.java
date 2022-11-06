
package exercicio020;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio020 {

/**
 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos 
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o 
valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado 
de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema 
deverá perguntar se deseja continuar calculando desconto até que a resposta 
seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ano, totalCarros = 0, totalCarrosSemiNovos = 0;
        float valorDesconto, valorPago, valorCarro;
        char opcao = 'S';
        while(opcao == 'S' || opcao == 's'){
            System.out.println("Qual o ano do carro? ");
            ano = sc.nextInt();
            System.out.println("Qual o valor do carro? ");
            valorCarro = sc.nextFloat();
      
            if (ano <= 2000){
                valorDesconto = valorCarro * 0.12f;
                valorPago =  valorCarro - valorDesconto;
                System.out.println("O valor de desconto foi de R$" + valorDesconto);
                System.out.println("Você vai pagar o valor de R$" + valorPago);
                
            }
            else{
                valorDesconto = valorCarro * 0.07f;
                valorPago =  valorCarro - valorDesconto;
                System.out.println("O valor de desconto foi de R$" + valorDesconto);
                System.out.println("Você vai pagar o valor de R$" + valorPago);
                totalCarrosSemiNovos +=1;
            }
        totalCarros += 1;
            System.out.println("Você quer continuar? ");
            opcao = sc.next().charAt(0);  
        }
        System.out.println("Você comprou um total de " + totalCarros + " carros.");
        System.out.println("Você comprou um total de " + totalCarrosSemiNovos + " carros semi novos.");
        
        sc.close();
    }
    
}
