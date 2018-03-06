package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores 
		 * em ordem crescente, uma linha em branco e em seguida, os valores na sequência como 
		 * foram lidos. */
		
		int n1, n2, n3;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		if((n1<=n2) && (n1<=n3)) {
			if(n2<=n3) {
				JOptionPane.showMessageDialog(null, "Números digitados em ordem crescente\n"+n1+"\n"+n2+"\n"+n3);
			}
		}else{
            JOptionPane.showMessageDialog(null,"Números digitados em ordem crescente\n"+n1+"\n"+n3+"\n"+n2);
		}
		if((n2<=n1) && (n2<=n3)) {
			if(n1<n3) {
				JOptionPane.showMessageDialog(null, "Números digitados em ordem crescente\n"+n2+"\n"+n1+"\n"+n3);
			}
			else{
	            JOptionPane.showMessageDialog(null,"Números digitados em ordem crescente\n"+n2+"\n"+n3+"\n"+n1);
			}
		}
		if((n3<=n1) && (n3<=n2)) {
			if(n3<=n2) {
				JOptionPane.showMessageDialog(null, "Números digitados em ordem crescente\n"+n3+"\n"+n1+"\n"+n2);
			}
			else {
				JOptionPane.showMessageDialog(null, "Números digitados em ordem crescente\n"+n3+"\n"+n2+"\n"+n1);
			}
		}
		

	}

		}
