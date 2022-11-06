
package exercicio017;
import java.util.Scanner;
/**
 *
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio017 {
/* 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no 
intervalo entre 10 (inclusive) e 150
(inclusive);
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros, qtdNumeros;
        int totalNumeros = 0;
        int i = 0;
        System.out.println("Quantos números você quer digitar? ");
        qtdNumeros = sc.nextInt();
        
        for(; i < qtdNumeros; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros = sc.nextInt();
            if (numeros >= 10 && numeros <=150){
                totalNumeros += 1;
            }
        }
        System.out.println("Foram inscritos um total de " + i + " números e " 
                + totalNumeros + " estavam no intervalo entre 10 e 150.");
        
        sc.close();
        
    }
    
}
