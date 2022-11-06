package Exercicio003;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class ExercicioTres {
/*3. Escreva um algoritmo para determinar o consumo médio 
de um automóvel sendo fornecida a distância total percorrida 
pelo automóvel e o total de combustível gasto;
    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float consumoMedio, distanciaTotal, totalCombustivel = 0.0f;
        
        System.out.println("Qual a distância total percorrida? ");
        distanciaTotal = sc.nextFloat();
        System.out.println("Qual o total de combustível gasto? ");
        totalCombustivel = sc.nextFloat();
        consumoMedio = distanciaTotal / totalCombustivel;
        System.out.println("O consumo médio do veiculo foi de: " + consumoMedio +"Km/l");
        
        sc.close();
    }
    
}
