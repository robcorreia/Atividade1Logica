package Exercicios;

import javax.swing.JOptionPane;

public class Exerc�cio9 {

	public static void main(String[] args) {
		/*O card�pio da lanchonete Burg�o � o seguinte: (..)
Fa�a um programa que leia o c�digo de um sandu�che e de uma bebida e informe o valor a 
pagar pelo cliente. */
		
		double codSanduiche, codBebida;
		double valorTotal;
		codSanduiche=Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do Sanduiche:"));
		codBebida=Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo da Bebida:"));
		
		if(codSanduiche==100) {
			codSanduiche = 5.5;	
		}else if(codSanduiche==101) {
			codSanduiche = 3;	
		}else if(codSanduiche==102) {
			codSanduiche = 3.5;
		}
		
		if(codBebida==201) {
			codBebida = 3.5;
		}else if(codBebida==202){
			codBebida = 3;
		}else if(codBebida==203) {
			codBebida =2.5;
		}
		
		valorTotal = codSanduiche+codBebida;
		
		JOptionPane.showMessageDialog(null,"O valor total da compra foi de: R$ "+valorTotal+ " reais.");
		
	}

}
