package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		/* 3) De acordo com um valor fornecido pelo usu�rio, verifique se ele � m�ltiplo de
	3, ou m�ltiplo de 7. Apresente uma mensagem mostrando o n�mero digitado e o
	resultado do teste. */
		
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		if(num % 3 ==0 && num % 7 ==0) {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � m�ltiplo de 3 e 7.");
			
		}else if(num % 3==0) {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � m�ltiplo de 3.");
			
		}else if(num % 7==0) {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � m�ltiplo de 7.");
			
		}else 
			JOptionPane.showMessageDialog(null, "N�mero n�o � m�ltiplo de 3 nem de 7, tente novamente.");
		 
					
	}		

}
