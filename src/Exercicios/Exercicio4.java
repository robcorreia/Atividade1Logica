package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que leia as 3 notas obtidas por um aluno durante o 
		  semestre. Calcule a m�dia deste aluno e informe a sua situa��o, 
		 sabendo que o aluno est� aprovado se a m�dia for maior ou igual a 7,
		  reprovado se a m�dia for menor ou igual a 5 e em recupera��o se a 
		  m�dia estiver entre 5.1 e 6.9.*/
		
		int n1, n2, n3;
		double media;
		
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite a 1� nota:"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite a 2� nota:"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Digite a 3� nota:"));
		
		media = (n1+n2+n3)/3;
		
		if(media>=7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado com nota: "+media);
		}else if(media<=5) {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado com nota: "+media);
		}else if(media>5 && media<7) {
			
			JOptionPane.showMessageDialog(null, "Aluno em Recupera��o com nota: "+media);
			
		}
			
 //n�o declarei as v�riaveis das notas com float/double, pois apareciam muitos n�meros depois da virgula
	}

}
