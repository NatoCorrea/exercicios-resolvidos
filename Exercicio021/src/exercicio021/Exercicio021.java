
package exercicio021;

import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio021 {
/*21. Escreva um algoritmo que leia os dados de 
“N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        char sexo, saude;
        int idade, qtdPessoas = 0, i = 0, totalAptos = 0;
        
        System.out.println("Quantas pessoas vão se alistar? ");
        qtdPessoas = sc.nextInt();
        
        for(; i < qtdPessoas; i++){
            System.out.println("Nome: ");
            nome = sc.next();
            System.out.println("Sexo: M / F");
            sexo = sc.next().charAt(0);
            System.out.println("Idade: ");
            idade = sc.nextInt();
            System.out.println("Saúde: A - Apto / I - Inapto");
            saude = sc.next().charAt(0);
            
            if (idade >= 18){
                if (saude == 'A' || saude == 'a'){
                    System.out.println(nome + " tem " + idade + " anos e está APTA para o serviço milatar. ");
                    totalAptos ++;
                }
                else{
                    System.out.println(nome + " tem " + idade + " anos e está INAPTA por questões de saúde. ");
                }
            }
            else{
                System.out.println(nome + " tem " + idade + " anos e ainda não tem idade para o serviço militar. ");
            }
        }
        System.out.println("Tivemos um total de " + qtdPessoas + " pessoas alistadas.");
        System.out.println("Apenas " + totalAptos + " pessoas estão aptas.");

        sc.close();
    }
    
}
