
package exercicio016;

import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio016 {
/*6. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
menção aprovado (media >= 7), 
       Reprovado (media <= 5) e 
       Recuperação (media entre 5.1 a 6.9);

    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        float n1, n2, n3, media;
        
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno: ");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota do aluno: ");
        n3 = sc.nextFloat();
        
        media = (n1 + n2 + n3) / 3;
        if (media >= 7){
            System.out.println("O aluno " + nome + " foi APROVADO com a média " + media);
        }
        else if(media <= 5){
        System.out.println("O aluno " + nome + " foi REPROVADO com a média " + media);
        }
        else{
            System.out.println("O aluno " + nome + " ficou na RECUPERAÇÃO com a média " + media);
        }
        sc.close();
    }
    
}
