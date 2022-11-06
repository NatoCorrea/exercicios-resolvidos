
package exercicio023;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio023 {
/*Faça um algoritmo que receba um número e mostre uma mensagem caso este 
número sege maior que 80,
menor que 25 
ou igual a 40;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Escolha um número: ");
        n = sc.nextInt();
        
        if(n > 80){
            System.out.println("O número digitado é maior do que 80.");
        }
        else if(n < 25){
            System.out.println("O número digitado é menor do que 25.");
        }
        else if(n == 40){
            System.out.println("O número digitado é igual a 40.");
        }
        
        sc.close();
        
    }
    
}
