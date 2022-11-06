
package exercicio013;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio013 {
/*13. Faça um algoritmo que receba um número e mostre uma mensagem caso este 
número seja maior que 10;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        
        if(n > 10){
            System.out.println("O número digitado é maior que 10.");
        }
        sc.close();
    }
    
}
