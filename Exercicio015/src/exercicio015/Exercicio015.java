package exercicio015;

import java.util.Scanner;

/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio015 {
//15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        if (numero >= 100 && numero <= 200){
            System.out.println("Número no intervalo de 100 a 200");
        }
        else{
            System.out.println("Número fora do intervalo.");
        }
        
        
        sc.close();
        
    }
    
}
