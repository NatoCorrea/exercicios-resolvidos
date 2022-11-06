
package exercicio034;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio034 {
/*34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em 
uma das seguintes categorias:
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        System.out.println("Qual o nome do nadador? ");
        nome = sc.next();
        System.out.println("Qual a idade de " + nome + "?");
        idade = sc.nextInt();
        
        if(idade >= 5 && idade <= 7){
            System.out.println("O atleta " + nome + " tem "+ idade + " anos de idade e é da  categoria INFANTIL A");
        }
        else if(idade >= 8 && idade <= 10){
            System.out.println("O atleta " + nome + " tem "+ idade + " anos de idade e é da  categoria INFANTIL B");
        }
        else if(idade >= 11 && idade <= 13){
            System.out.println("O atleta " + nome + " tem "+ idade + " anos de idade e é da  categoria JUVENIL A");
        }
        else if(idade >= 14 && idade <= 17){
            System.out.println("O atleta " + nome + " tem "+ idade + " anos de idade e é da  categoria JUVENIL B");
        }
        else if(idade >= 18 && idade <= 25){
            System.out.println("O atleta " + nome + " tem "+ idade + " anos de idade e é da  categoria SÊNIOR");
        }
        else{
            System.out.println("Idade fora da faixa etária.");
        }
        
        sc.close();
    }
    
}
