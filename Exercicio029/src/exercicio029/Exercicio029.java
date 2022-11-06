/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio029;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;
/**
 *  @author renato corrêa
 *  Curso de Lógica para Programação III
 *  Instrutor: Marcio Michelluzzi
 */
public class Exercicio029 {
/*9. Faça um algoritmo que receba o número do mês e mostre o mês correspondente.
Valide mês inválido;
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Qual o mês que você quer saber? ");
        n = sc.nextInt();
        
        switch(n){
            case 1:
                System.out.println("JANEIRO");
                break;
            case 2:
                System.out.println("FEVEREIRO");
                break;
            case 3:
                System.out.println("MARÇO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAIO");
                break;
            case 6:
                System.out.println("JUNHO");
                break;
            case 7:
            System.out.println("JULHO");
                break;
            case 8:
                System.out.println("AGOSTO");
            break;
            case 9:
                System.out.println("SETEMBRO");
                break;
            case 10:
                System.out.println("OUTUBRO");
                break;
            case 11:
                System.out.println("NOVEMBRO");
                break;
            case 12:
                System.out.println("DEZEMBRO");
                break;
            default:
                System.out.println("MÊS INVÁLIDO");
        }
        
        sc.close();
    }
    
}
