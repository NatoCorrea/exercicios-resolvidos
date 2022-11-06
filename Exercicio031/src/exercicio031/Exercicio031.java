
package exercicio031;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio031 {
/*31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere,
pede-se para imprimir o resultado da operação de A por B se C for um símbolo de 
operador aritmético; caso contrário deve ser impressa uma mensagem de operador 
não definido. Tratar erro de divisão por zero;
    */
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float a, b, resultado;
        char c;
        System.out.println("Digite o valor de A: ");
        a = sc.nextFloat();
        System.out.println("Digite o valor de B: ");
        b = sc.nextFloat();
        System.out.println("Digite o operador: ");
        c = sc.next().charAt(0);
        
        switch (c){
            case '+':{
                resultado = a + b;
                System.out.println(a + " + " + b + " = " + resultado);
                break;
            }
            case '-':{
                resultado = a - b;
                System.out.println(a + " - " + b + " = " + resultado);
                break;
            }
            case '*':{
                resultado = a * b;
                System.out.println(a + " X " + b + " = " + resultado);
                break;
            }
            case '/':{
                if(b > 0){
                    resultado = a / b;
                    System.out.println(a + " / " + b + " = " + resultado);
                    break;
                }
            }
            default:
                System.out.println("Operador não defenido.");
        }
        sc.close();
    }
    
}
