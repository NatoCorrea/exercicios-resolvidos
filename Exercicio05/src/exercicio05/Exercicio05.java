
package exercicio05;

import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio05 {
/*5. Escreva um algoritmo que leia o nome de um aluno e as 
notas das três provas que ele obteve no semestre. No final informar o 
nome do aluno e a sua média (aritmética);
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        float n1, n2, n3, media;
        
        System.out.println("Nome do aluno? ");
        nome = sc.nextLine();
        System.out.println("Qual a primeira nota? ");
        n1 = sc.nextFloat();
        System.out.println("Qual a segunda nota? ");
        n2 = sc.nextFloat();
        System.out.println("Qual a terceira nota? ");
        n3 = sc.nextFloat();
        
        media = (n1 + n2 + n3) / 3;
        
        System.out.println("O aluno " + nome + " recebeu a média " + media);
        
        sc.close();
        
        
    }
    
}
