
package exercicio030;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio030 {
/*30. Escreva um algoritmo que leia três valores inteiros distintos e os 
escreva em ordem crescente;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Digite o 1 número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2 número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o 3 número: ");
        n3 = sc.nextInt();
        
        if(n1 > n2 && n1 > n2){
            if (n2 > n3){
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }
            else{
                System.out.println(n2 + ", " + n3 + ", " + n1);
            }
        }
        else if(n2 > n1 && n2 > n3){
            if (n1 > n3){
                System.out.println(n3 + ", " + n1 + ", " + n2);
            }
            else{
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        }
        else if(n3 > n1 && n3 > n2){
            if (n1 > n2){
                System.out.println(n2 + ", " + n1 + ", " + n3);
            }
            else{
                System.out.println(n1 + ", " + n2 + ", " + n3);
            }
        }
        
        sc.close();
    }
    
}
