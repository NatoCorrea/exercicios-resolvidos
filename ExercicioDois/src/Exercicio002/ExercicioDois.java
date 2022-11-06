package Exercicio002;

import java.util.Scanner;
/**
 *
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */

public class ExercicioDois {

/*2. Faça um algoritmo que receba dois números e ao final mostre a soma, 
subtração, multiplicação e a divisão dos dois números lidos;
    */   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===========================");
        System.out.println("      RESOLVENDO CONTAS      ");
        System.out.println("===========================");
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("===========================");
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        float divisao = n1 / n2;
        
        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println(n1 + " - " + n2 + " = " + subtracao);
        System.out.println(n1 + " X " + n2 + " = " + multiplicacao);
        System.out.println(n1 + " / " + n2 + " = " + divisao);
        
        
        sc.close();
    }
    
}
