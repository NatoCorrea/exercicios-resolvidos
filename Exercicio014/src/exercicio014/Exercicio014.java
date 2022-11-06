package exercicio014;
import java.util.Scanner;

/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio014 {
//14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        
        if(n1 > n2){
            System.out.println("O primeiro número é maior que o segundo.");
            System.out.println("Primeiro número: " + n1);
            System.out.println("Segundo número: " + n2);
        }
        else
        if(n2 > n1)
            {
            System.out.println("O segundo número é maior que o primeiro.");
            System.out.println("Primeiro número: " + n1);
            System.out.println("Segundo número: " + n2);
        }
        else{
            System.out.println("O primeiro número é igual ao segundo.");
            System.out.println("Primeiro número: " + n1);
            System.out.println("Segundo número: " + n2);
        }
        sc.close();
    }
    
}
