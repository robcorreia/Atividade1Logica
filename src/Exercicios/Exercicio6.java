package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que leia as 3 notas obtidas por um aluno e a média dos exercícios 
		 que fazem parte das avaliações.
		 Com isso, calcule a média de aproveitamento utilizando a seguinte fórmula:
		mediaDeAproveitamento = ((n1 + n2+ n3) / 3)*0,8 + (media dos exercícios)*0,2.
		Atribua o conceito de acordo com a tabela abaixo:
		
		- maior que 9 = Conceito A;
		- maior ou igual a 7,5 e menor que 9 = Conceito B;
		- maior ou igual a 6,0 e menor que 7,5 = Conceito C;
		- menor que 6 = Conceito D.*/
		
		int n1, n2, n3;
	
		double mediaExercicios;
		double mediaAproveitamento;
		
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite a 1º nota:"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite a 2º nota:"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Digite a 3º nota:"));
		mediaExercicios=Double.parseDouble(JOptionPane.showInputDialog("Digite a média dos exercícios:"));
		
		mediaAproveitamento=((n1+n2+n3)/3)*0.8 + (mediaExercicios)*0.2;
		
		if(mediaAproveitamento>9) {
			JOptionPane.showMessageDialog(null, "Aluno(a) aprovado(a) com Conceito A! Nota: "+mediaAproveitamento);
		}else if(mediaAproveitamento>7.5 && mediaAproveitamento<9) {
			JOptionPane.showMessageDialog(null, "Aluno(a) aprovado(a) com Conceito B! Nota: "+mediaAproveitamento);
		}else if(mediaAproveitamento>=6 && mediaAproveitamento<7.5) {
			JOptionPane.showMessageDialog(null, "Aluno(a) aprovado(a) com Conceito C! Nota: "+mediaAproveitamento);
		}else if(mediaAproveitamento<6) {
			JOptionPane.showMessageDialog(null, "Aluno(a) aprovado(a) com Conceito D! Nota: "+mediaAproveitamento);
		}
		

	}

}
