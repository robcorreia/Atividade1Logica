package Exercicios;

import javax.swing.JOptionPane;

public class Exercício9 {

	public static void main(String[] args) {
		/*O cardápio da lanchonete Burgão é o seguinte: (..)
Faça um programa que leia o código de um sanduíche e de uma bebida e informe o valor a 
pagar pelo cliente. */
		
		double codSanduiche, codBebida;
		double valorTotal;
		codSanduiche=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Sanduiche:"));
		codBebida=Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Bebida:"));
		
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
