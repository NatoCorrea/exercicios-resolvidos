
package Exercicio004;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class ExercicioQuatro {
/*4. Escreva um algoritmo que leia o nome de um vendedor, 
o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
informar o seu nome, o salário fixo e salário no final do mês;
    */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        float salario;
        float totalVendas;
        float salarioFinal;
        float comissao;
        
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Salário Fixo: ");
        salario = sc.nextFloat();
        System.out.println("Total de vendas: ");
        totalVendas = sc.nextFloat();
        comissao = 0.15f * totalVendas;
        salarioFinal = salario + comissao;
        
        System.out.println("O vendedor se chama " + nome 
                + " e o seu salário fixo é de R$" + salario 
                + " mas neste mês ele vendeu um total de R$" + totalVendas 
                + " por isso o seu salário final será de R$" + salarioFinal);
        
       
        sc.close();
    }
    
}
