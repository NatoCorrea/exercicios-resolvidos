package exercicio09;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
import java.util.Scanner;

public class Exercicio09 {
/*
9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor 
com rendimento após um mês. Considere fixo o juros da poupança em 0,07% a. m;
    */
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       float valorDeposito;
       
        System.out.print("Digite de quanto será o deposito R$");
        valorDeposito = sc.nextFloat();
        
        System.out.println("Após um mês de rendimento na poupança o cliente terá um total de R$" + (valorDeposito + (valorDeposito * 0.07f)));
        
        
        
    }
    
}
