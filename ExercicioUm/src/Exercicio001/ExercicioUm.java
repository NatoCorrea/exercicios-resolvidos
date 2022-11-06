package Exercicio001;
/**
 *
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
import java.util.Scanner;
//1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
public class ExercicioUm {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("      SOMANDO NÚMEROS      ");
        System.out.println("===========================");
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("===========================");
        int soma = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + soma);
        
        
        sc.close();
        
        
    }
    
}
