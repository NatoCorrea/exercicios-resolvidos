
package exercicio008;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio008 {
/*8. Elabore um algoritmo que efetue a apresentação do valor da conversão em 
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor 
da cotação do dólar e também aquantidade de dólares
disponíveis com o usuário;
*/
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float real, qntDolar;
        
        System.out.println("Quantos dolares você possui para trocar? U$");
        qntDolar = sc.nextFloat();
        
        real = qntDolar * 5.22f;
        System.out.println("Ela possui U$" + qntDolar + " e consegue trocar por R$" + real);

        
        sc.close();
    }
    
}
