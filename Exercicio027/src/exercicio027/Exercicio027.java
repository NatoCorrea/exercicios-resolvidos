package exercicio027;
import java.util.Scanner;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio027 {
/*7. A concessionária de veículos “CARANGO” está vendendo os seus veículos com 
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a 
ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo 
de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
Com valor do veículo zero encerra entrada de dados. Informe total de desconto 
e total pago pelos clientes;

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float valorDesconto = 0.0f, valorPago = 0.0f, valorVeiculo;
        char combustivel;
        float totalDesconto = 0, totalPago = 0.0f;
      
        System.out.println("Qual o valor do carro? ");
        valorVeiculo = sc.nextFloat();
        do{
            System.out.println("Qual o combustivel?");
            combustivel = sc.next().charAt(0);
            if (combustivel == 'A' || combustivel == 'a'){
                //0.25%
                valorDesconto = 0.25f * valorVeiculo;
                valorPago = valorVeiculo - valorDesconto;
                System.out.println("Você recebeu um desconto de R$" + valorDesconto);
                System.out.println("O valor a pagar pelo carro a ÁLCOOL é de R$" + valorPago);
                totalPago = totalPago + valorPago;
                totalDesconto = totalDesconto + valorDesconto;
                
            }
            else if (combustivel == 'G' || combustivel == 'g'){
                //0.21%
                valorDesconto = 0.21f * valorVeiculo;
                valorPago = valorVeiculo - valorDesconto;
                System.out.println("Você recebeu um desconto de R$" + valorDesconto);
                System.out.println("O valor a pagar pelo carro a GASOLINA é de R$" + valorPago);
                totalPago = totalPago + valorPago;
                totalDesconto = totalDesconto + valorDesconto;
            }
            else if (combustivel == 'D' || combustivel == 'd'){
                //0.14%
                valorDesconto = 0.14f * valorVeiculo;
                valorPago = valorVeiculo - valorDesconto;
                System.out.println("Você recebeu um desconto de R$" + valorDesconto);
                System.out.println("O valor a pagar pelo carro a DIESEL é de R$" + valorPago);
                totalPago = totalPago + valorPago;
                totalDesconto = totalDesconto + valorDesconto;
                
            }
        System.out.println("Qual o valor do carro? ");
        valorVeiculo = sc.nextFloat();   
        }while(valorVeiculo != 0.0f);
        
        System.out.println("O total pago foi de " + totalPago);
        System.out.println("O total de desconto foi de " + totalDesconto);
        
        
        sc.close();
    }
    
}
