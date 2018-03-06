package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		/* 3) De acordo com um valor fornecido pelo usuário, verifique se ele é múltiplo de
	3, ou múltiplo de 7. Apresente uma mensagem mostrando o número digitado e o
	resultado do teste. */
		
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		if(num % 3 ==0 && num % 7 ==0) {
			JOptionPane.showMessageDialog(null, "O número digitado é múltiplo de 3 e 7.");
			
		}else if(num % 3==0) {
			JOptionPane.showMessageDialog(null, "O número digitado é múltiplo de 3.");
			
		}else if(num % 7==0) {
			JOptionPane.showMessageDialog(null, "O número digitado é múltiplo de 7.");
			
		}else 
			JOptionPane.showMessageDialog(null, "Número não é múltiplo de 3 nem de 7, tente novamente.");
		 
					
	}		

}
