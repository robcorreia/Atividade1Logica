package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1) Melhore o exemplo realizado que verifica se um n�mero � par ou �mpar,
adicionando uma nova verifica��o para o caso do n�mero ser zero. */
		
		int numero;
		
		numero =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		if(numero==0) {
			
			JOptionPane.showMessageDialog(null,"O n�mero � zero (0)!, tente novamente");
			
		}
		else if(numero%2==0) {
			JOptionPane.showMessageDialog(null,"O n�mero � par!");
			
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero � impar!");
		}

	}

}
