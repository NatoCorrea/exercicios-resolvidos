
package exercicio018;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio018 {
/*18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem 
informando “maior de idade” e “menor de idade” para cada pessoa. Considere a 
idade a partir de 18 anos como maior de idade;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, qtdPessoas;
        String nome;
        int i = 0;
        int totalMaiores = 0, totalMenores = 0;
        
        System.out.println("Digite a quantidade de pessoas que serão consultadas.");
        qtdPessoas = sc.nextInt();
        
        for(; i < qtdPessoas; i++){
            System.out.print("Nome: ");
            nome = sc.next();
            sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            
            if (idade >= 18){
                System.out.println(nome + " tem " + idade + " e é MAIOR DE IDADE.");
                totalMaiores += 1;
            }
            else{
                System.out.println(nome + " tem " + idade + " e é MENOR DE IDADE.");
                totalMenores += 1;
            }
        }
        
        System.out.println("Você cadastrou um total de " + qtdPessoas + " pessoas.");
        System.out.println(totalMaiores + " eram maiores de idade.");
        System.out.println(totalMenores + " eram menores de idade.");
        
        sc.close();
    }
    
}
