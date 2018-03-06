package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1) Melhore o exemplo realizado que verifica se um número é par ou ímpar,
adicionando uma nova verificação para o caso do número ser zero. */
		
		int numero;
		
		numero =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		if(numero==0) {
			
			JOptionPane.showMessageDialog(null,"O número é zero (0)!, tente novamente");
			
		}
		else if(numero%2==0) {
			JOptionPane.showMessageDialog(null,"O número é par!");
			
		}else {
			JOptionPane.showMessageDialog(null, "O número é impar!");
		}

	}

}
