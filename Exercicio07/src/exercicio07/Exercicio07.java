
package exercicio07;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio07 {
/*7. Leia uma temperatura em graus Celsius e apresentá-la convertida 
em graus Fahrenheit. A fórmula de conversão é:F=(9*C+160) / 5, 
sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
    */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float grausFahrenheit, grausCelsius;
        System.out.print("Qual a temperatura atual C");
        grausCelsius = sc.nextFloat();
        
        grausFahrenheit = (9 * grausCelsius + 160) / 5;
        
        System.out.println("A temperatura atual em Fahrenheit é de " + grausFahrenheit);
        
        
        sc.close();
        
    }
    
}
