package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		/*Uma empresa dará aumento aos seus funcionários, de acordo com sua Classe:
		a. Classe A: 0,10 (10%) de aumento;
		b. Classe B: 0,15 (15%) de aumento;
		c. Classe C: 0,20 (20%) de aumento;
		Faça um programa que leia o salário e a classe do funcionário, 
		após isso, calcule e exiba os salários com os devidos aumentos. */
		
		double salario;
		String classe;
		double aumento=0;
		
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
		classe=JOptionPane.showInputDialog("Digite a Classe (A / B / C) do funcionário: ");
		
		if(classe.equalsIgnoreCase("A")) {
			aumento=salario*0.10;
			salario=salario+aumento;
			JOptionPane.showMessageDialog(null, "O salário do funcionário com aumento é: R$"+salario+" reais");
		}else if(classe.equalsIgnoreCase("B")) {
			aumento=salario*0.15;
			salario=salario+aumento;
			JOptionPane.showMessageDialog(null, "O salário do funcionário com aumento é: R$"+salario+" reais");
		}else if(classe.equalsIgnoreCase("C")) {
			aumento=salario*0.20;
			salario=salario+aumento;
			JOptionPane.showMessageDialog(null, "O salário do funcionário com aumento é: R$"+salario+" reais");
		}
	}

}
