
package exercicio012;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio012 {
/*12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o 
percentual do distribuidor e dos impostos aplicados (primeiro os impostos são 
aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre 
o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o 
custo ao consumidor do mesmo;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float carroNovo, custoFabrica, custoComImposto;  
        float percentualDistribuidor = 0.28f;
        float impostosAplicados = 0.45f;
        
        System.out.println("Qual o custo de fábrica do carro? ");
        custoFabrica = sc.nextFloat();
        
        custoComImposto = custoFabrica + custoFabrica * impostosAplicados;
        carroNovo = custoComImposto + custoComImposto * percentualDistribuidor;
        System.out.println("O valor do carro novo é de R$" + carroNovo);
        
        sc.close();
    }
    
}
