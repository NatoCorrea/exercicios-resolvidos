
package exercicio024;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio024 {
/*24. Faça um algoritmo que receba “N” números e mostre positivo, 
negativo ou zero para cada número;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, qtdNumero, i = 0;
        
        System.out.println("Quantos números você vai digitar? ");
        qtdNumero = sc.nextInt();
        
        for(; i < qtdNumero; i++){
            System.out.println("número: ");
            n = sc.nextInt();
            
            if(n > 0){
                System.out.println("O número " + n + " é POSITIVO.");
            }
            else if(n < 0){
                System.out.println("O número " + n + " é NEGATIVO.");
            }
            else{
                System.out.println("O número digitado é igual a ZERO.");
            }
        }
        
       
        
        
        
        
        sc.close();
        
    }
    
}
