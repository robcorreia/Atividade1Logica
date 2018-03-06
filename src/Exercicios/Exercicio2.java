package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*2) Faça um algoritmo que leia um número e diga se este número está no intervalo
entre 100 e 200. */
		
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		if(num>100 && num<200) {
			
			JOptionPane.showMessageDialog(null, "O número digitado é: "+num+" está entre 100 ~ 200.");
		}else {
			JOptionPane.showMessageDialog(null, "Número inválido, não corresponde as exigências do inunciado.");
		}
	}

}
