package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*2) Fa�a um algoritmo que leia um n�mero e diga se este n�mero est� no intervalo
entre 100 e 200. */
		
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		if(num>100 && num<200) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado �: "+num+" est� entre 100 ~ 200.");
		}else {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido, n�o corresponde as exig�ncias do inunciado.");
		}
	}

}
