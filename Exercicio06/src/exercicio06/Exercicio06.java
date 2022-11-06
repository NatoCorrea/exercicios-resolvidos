
package exercicio06;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio06 {
/*6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores 
de forma que a variávelA passe a possuir ovalor da variável B e a variável B 
passe a possuir o valor da variável A. Apresentar osvalores trocados; 
    */
  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("INVERTENDO NÚMEROS");
        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);
        
        
        
        sc.close();
    }
    
}
