/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio033;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio033 {
/*33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$13,00 por hora/aula;
b. Professor Nível 2 R$18,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
    */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qtHora, nivel;
        float salario;
        String nome;
        
        System.out.println("Nome do professor: ");
        nome = sc.next();
        System.out.println("Quantas horas " + nome + " trabalhou? ");
        qtHora = sc.nextInt();
        System.out.println("Em qual nível o professor ensina? ");
        nivel = sc.nextInt();
        
        switch(nivel){
            case 1:
                salario = qtHora * 13.0f;
                System.out.println("O professor " + nome + " trabalhou " + qtHora + " horas no mês.");
                System.out.println("Seu salário é de R$" + salario);
                break;
            case 2:
                salario = qtHora * 18.0f;
                System.out.println("O professor " + nome + " trabalhou " + qtHora + " horas no mês.");
                System.out.println("Seu salário é de R$" + salario);
                break;
            case 3:
                salario = qtHora * 25.0f;
                System.out.println("O professor " + nome + " trabalhou " + qtHora + " horas no mês.");
                System.out.println("Seu salário é de R$" + salario);
                break;
            default:
                System.out.println("Nível inexistente.");
        }
        sc.close();
    }
    
}
