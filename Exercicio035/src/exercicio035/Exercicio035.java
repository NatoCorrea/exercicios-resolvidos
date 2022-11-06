
package exercicio035;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio035 {
/*35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qtEnergia, tipo;
        float totalPagar;
       
        
        System.out.println("Quanto KW foi consumido de energia no mês? ");
        qtEnergia = sc.nextInt();
        System.out.println("Qual o tipo de estabelecimento? ");
        System.out.println("1 - RESIDÊNCIA");
        System.out.println("2 - COMÉRCIO");
        System.out.println("3 - INDÚSTRIA");
        tipo = sc.nextInt();
        
        switch (tipo) {
            case 1:
                totalPagar = qtEnergia * 0.60f;
                System.out.println("O valor total a pagar será de R$" + totalPagar);
                break;
            case 2:
                totalPagar = qtEnergia * 0.48f;
                System.out.println("O valor total a pagar será de R$" + totalPagar);
                break;
            case 3:
                totalPagar = qtEnergia * 1.29f;
                System.out.println("O valor total a pagar será de R$" + totalPagar);
                break;
            default:
                System.out.println("TIPO INEXISTENTE!");
        }
        
        sc.close();
    }
    
}
