package exercicio019;

import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio019 {
/*19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e 
informe o nome e se ela é homem ou mulher. No final informe total de 
homens e de mulheres;

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        char sexo;
        int totalHomens = 0, totalMulheres = 0;
        int qtdPessoas;
        
        int i = 0;
        System.out.println("Quantas pessoas serão cadastradas? ");
        qtdPessoas = sc.nextInt();
        
        for(;i < qtdPessoas; i++){
            System.out.print("Nome: ");
            nome = sc.next();
            sc.nextLine();
            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);
            sc.nextLine();
            if(sexo == 'F' || sexo == 'f'){
                System.out.println(nome + " é uma mulher.");
                totalMulheres += 1;
            }
            else{
                System.out.println(nome + " é um homem.");
                totalHomens +=1;
            }
        }
        
        System.out.println("Foram cadastradas um total de " + qtdPessoas + " pessoas.");
        System.out.println(totalHomens + " homens.");
        System.out.println(totalMulheres + " mulheres.");
        
        
        
        sc.close();
    }
    
}
