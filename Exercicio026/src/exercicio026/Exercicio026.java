
package exercicio026;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio026 {
/*26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
Caso o usuário digite um número que não esteja neste intervalo, exibir a 
seguinte mensagem: número inválido;
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Escolha um número: ");
        n = sc.nextInt();
        
        switch (n){
            case 1:
                System.out.println("UM!");
                break;
            case 2:
                System.out.println("DOIS!");
                break;
            case 3:
                System.out.println("TRÊS!");
                break;
            case 4:
                System.out.println("QUATRO!");
                break;
            case 5:
                System.out.println("CINCO!");
                break;
            default:
                System.out.println("O número escolhido é invalido.");
        }
        sc.close();
    }
    
}
