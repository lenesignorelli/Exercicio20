/*
 20. A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os 
seus ve�culos com desconto. Fa�a um algoritmo que calcule e exiba o valor
do desconto e o valor a ser pago pelo cliente de v�rios carros. 
O desconto dever� ser calculado de acordo com o ano do ve�culo. 
At� 2000 - 12% e acima de 2000 - 7%. O sistema dever� perguntar se deseja 
continuar calculando desconto at� que a resposta seja: �(N) N�o�. 
Informar total de carros com ano at� 2000 e total geral;
*/
package Exercicio20;

import java.util.Scanner;
        
/**
 *
 * @author Lene
 */
public class Main {
    public static void main(String[] args) {
    
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float valorDesconto = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorPagar = 0.0f;
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
        
            //Entrada de dados
            System.out.println("Digite o ano de fabrica��o do veiculo");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do carro");
            valorCarro = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
            //12%
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            
            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago �: " + valorPagar);
            
            System.out.println("Deseja fazer mais cadastros? S -sim / N - n�o");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
    
}
