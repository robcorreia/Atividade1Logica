package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que leia as 3 notas obtidas por um aluno durante o 
		  semestre. Calcule a média deste aluno e informe a sua situação, 
		 sabendo que o aluno está aprovado se a média for maior ou igual a 7,
		  reprovado se a média for menor ou igual a 5 e em recuperação se a 
		  média estiver entre 5.1 e 6.9.*/
		
		int n1, n2, n3;
		double media;
		
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite a 1º nota:"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite a 2º nota:"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Digite a 3º nota:"));
		
		media = (n1+n2+n3)/3;
		
		if(media>=7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado com nota: "+media);
		}else if(media<=5) {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado com nota: "+media);
		}else if(media>5 && media<7) {
			
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação com nota: "+media);
			
		}
			
 //não declarei as váriaveis das notas com float/double, pois apareciam muitos números depois da virgula
	}

}
