package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		/*Uma empresa dar� aumento aos seus funcion�rios, de acordo com sua Classe:
		a. Classe A: 0,10 (10%) de aumento;
		b. Classe B: 0,15 (15%) de aumento;
		c. Classe C: 0,20 (20%) de aumento;
		Fa�a um programa que leia o sal�rio e a classe do funcion�rio, 
		ap�s isso, calcule e exiba os sal�rios com os devidos aumentos. */
		
		double salario;
		String classe;
		double aumento=0;
		
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio:"));
		classe=JOptionPane.showInputDialog("Digite a Classe (A / B / C) do funcion�rio: ");
		
		if(classe.equalsIgnoreCase("A")) {
			aumento=salario*0.10;
			salario=salario+aumento;
			JOptionPane.showMessageDialog(null, "O sal�rio do funcion�rio com aumento �: R$"+salario+" reais");
		}else if(classe.equalsIgnoreCase("B")) {
			aumento=salario*0.15;
			salario=salario+aumento;
			JOptionPane.showMessageDialog(null, "O sal�rio do funcion�rio com aumento �: R$"+salario+" reais");
		}else if(classe.equalsIgnoreCase("C")) {
			aumento=salario*0.20;
			salario=salario+aumento;
			JOptionPane.showMessageDialog(null, "O sal�rio do funcion�rio com aumento �: R$"+salario+" reais");
		}
	}

}
