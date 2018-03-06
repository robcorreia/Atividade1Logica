package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Dados os tr�s lados de um tri�ngulo, escrever uma mensagem informando se � um tri�ngulo
		equil�tero (todos os lados iguais), is�sceles (dois lados iguais) ou escaleno 
		(tr�s lados de tamanhos diferentes). Lembre-se que os lados s� formam um 
		 tri�ngulo se o comprimento de um lado for sempre menor que a soma dos outros dois 
		 (o programa deve exibir uma mensagem de erro caso esta propriedade n�o seja satisfeita). */
		
		int lado1, lado2, lado3;
		
		lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1 do tri�ngulo:"));
		lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2 do tri�ngulo:"));
		lado3=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3 do tri�ngulo:"));
		
		if(lado1 == lado2 && lado2 == lado3) {
			JOptionPane.showMessageDialog(null,"O tri�ngulo � EQUIL�TERO!");
		}else if(lado1 ==lado2 && lado2 != lado3) {
			
			JOptionPane.showMessageDialog(null,"O tri�ngulo � IS�SCELES!");
		}else {
			JOptionPane.showMessageDialog(null,"O tri�ngulo � ESCALENO!");
		}
	}

}
