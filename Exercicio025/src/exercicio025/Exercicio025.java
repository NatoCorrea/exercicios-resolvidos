
package exercicio025;

import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio025 {
/*Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. 
Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. 
Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        sc.close();
        
        if(n1 == n2){
            System.out.println("O primeiro número e o segundo número são IGUAIS.");
        }
        else{
            if(n1 > n2){
                System.out.println("Números diferentes e o primeiro número é maior que o segundo.");
            }
            else{
                System.out.println("Números diferentes e o segundo número é maior que o primeiro.");
            }
        }
                
    }
    
}
