
package exercicio028;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio028 {
/*28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o 
seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu 
novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;
    
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        float salario, salarioMinimo, reajuste, novoSalario, folhaPagamento = 0.0f;
        int n, i = 0;
        
        System.out.println("Quantos funcionarios terão salarios reajustados? ");
        n = sc.nextInt();
   
        for(; i < n; i++){
            System.out.println("Nome: ");
            nome = sc.next();
            System.out.println("Salário: ");
            salario = sc.nextFloat();
            System.out.println("Salário mínimo: ");
            salarioMinimo = sc.nextFloat();
            if(salario <= (3 * salarioMinimo)){
                //+0.50
                reajuste = salario * 0.50f;
                novoSalario = salario + reajuste;
                System.out.println("O sálario do funcionario " + nome + " é de R$" + salario);
                System.out.println("Ele recebeu um aumento de R$" + reajuste + " em cima do seu salário");
                System.out.println("E o seu novo salario é R$" + novoSalario);
            }
            else if (salario <= (10 * salarioMinimo)){
                //+0.20
                reajuste = salario * 0.20f;
                novoSalario = salario + reajuste;
                System.out.println("O sálario do funcionario " + nome + " é de R$" + salario);
                System.out.println("Ele recebeu um aumento de R$" + reajuste + " em cima do seu salário");
                System.out.println("E o seu novo salario é R$" + novoSalario);
            }
            else if (salario <= (20 * salarioMinimo)){
                //+0.15
                reajuste = salario * 0.15f;
                novoSalario = salario + reajuste;
                System.out.println("O sálario do funcionario " + nome + " é de R$" + salario);
                System.out.println("Ele recebeu um aumento de R$" + reajuste + " em cima do seu salário");
                System.out.println("E o seu novo salario é R$" + novoSalario);
            }else{
                //+0.10
                reajuste = salario * 0.10f;
                novoSalario = salario + reajuste;
                System.out.println("O sálario do funcionario " + nome + " é de R$" + salario);
                System.out.println("Ele recebeu um aumento de R$" + reajuste + " em cima do seu salário");
                System.out.println("E o seu novo salario é R$" + novoSalario);
            }
            
            folhaPagamento = folhaPagamento + reajuste;
           
        }
        System.out.println("A empresa terá que aumentar sua folha de pagamento em R$" + folhaPagamento);
        
        sc.close();
    }
    
}
