package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o número de gols marcados por dois times. Ao
final informar qual dos times foi o vencedor ou caso não haja vencedor imprimir a
palavra EMPATE. */
		
		String nomeTime1, nomeTime2;
		int quantGols1, quantGols2;
		
		nomeTime1=JOptionPane.showInputDialog("Digite o nome do Time 1:");
		quantGols1=Integer.parseInt(JOptionPane.showInputDialog("Digite o Nº de Gols:"));
		
		nomeTime2=JOptionPane.showInputDialog("Digite o nome do Time 2:");
		quantGols2=Integer.parseInt(JOptionPane.showInputDialog("Digite o Nº de Gols:"));
		
		if(quantGols1>quantGols2) {
			
			JOptionPane.showMessageDialog(null, nomeTime1+ " foi o Vencedor.\n"+quantGols1+"x"+quantGols2);
		}else if(quantGols1<quantGols2) {
			
			JOptionPane.showMessageDialog(null, nomeTime2+ " foi o Vencedor.\n"+quantGols2+"x"+quantGols1);
		}else if(quantGols1==quantGols2) {
			
			JOptionPane.showMessageDialog(null, "EMPATE\n"+quantGols2+"x"+quantGols1);
		}
		

	}

}
