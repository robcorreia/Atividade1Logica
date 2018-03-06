package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10) Faça um programa que leia o sexo e a altura de uma pessoa e calcule o seu peso ideal, 
		utilizando as seguintes fórmulas:
		
		a. para homens: (72.7 * altura) – 58
		b. para mulheres: (62.1 * altura) -44.7 */
		
		String sexo;
		double altura;
		double pesoIdeal;
		
		sexo=JOptionPane.showInputDialog("Digite o sexo da pessoa: (Masculino / Feminino");
		altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
		
		if(sexo.equalsIgnoreCase("Masculino")) {
			pesoIdeal = (72.7*altura)-58;
			
			JOptionPane.showMessageDialog(null, "O peso ideal é: "+pesoIdeal+" para as informações fornecidas.");
			
		}else if(sexo.equalsIgnoreCase("Feminino")) {
			pesoIdeal = (62.1*altura)-44.7;
		
		JOptionPane.showMessageDialog(null, "O peso ideal é: "+pesoIdeal+" para as informações fornecidas.");
		}
	}

}
