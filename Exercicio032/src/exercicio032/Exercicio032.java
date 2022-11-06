
package exercicio032;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio032 {
/*32. Escreva um algoritmo que leia três valores inteiros e verifique se eles 
podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo 
que eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento 
de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        System.out.println("Valor de A: ");
        a =  sc.nextInt();
        System.out.println("Valor de B: ");
        b = sc.nextInt();
        System.out.println("Valor de C: ");
        c = sc.nextInt();
        
        if(a < b + c && b < a + c && c < a + b){
            if(a == b && a == c){
                System.out.println("TRIÂNGULO EQUILÁTERO!");
            }
            else if(a != b && a != c && b != c){
                System.out.println("TRIÂNGULO ESCALENO!");
            }
            else{
                System.out.println("TRIÂNGULO ISÓSCELES!");
            }
        }
        else{
            System.out.println("NÃO FORMA UM TRIÂNGULO!");
        }
        
        
        
        
        sc.close();
    }
    
}
