package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Dados os três lados de um triângulo, escrever uma mensagem informando se é um triângulo
		equilátero (todos os lados iguais), isósceles (dois lados iguais) ou escaleno 
		(três lados de tamanhos diferentes). Lembre-se que os lados só formam um 
		 triângulo se o comprimento de um lado for sempre menor que a soma dos outros dois 
		 (o programa deve exibir uma mensagem de erro caso esta propriedade não seja satisfeita). */
		
		int lado1, lado2, lado3;
		
		lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1 do triângulo:"));
		lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2 do triângulo:"));
		lado3=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3 do triângulo:"));
		
		if(lado1 == lado2 && lado2 == lado3) {
			JOptionPane.showMessageDialog(null,"O triângulo é EQUILÁTERO!");
		}else if(lado1 ==lado2 && lado2 != lado3) {
			
			JOptionPane.showMessageDialog(null,"O triângulo é ISÓSCELES!");
		}else {
			JOptionPane.showMessageDialog(null,"O triângulo é ESCALENO!");
		}
	}

}
