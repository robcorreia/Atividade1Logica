package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Uma livraria est� fazendo uma promo��o para pagamento � vista em que o comprador 
		 pode escolher entre dois crit�rios de desconto:
		Crit�rio A: R$0,25 por livro + R$7,50 fixo
		Crit�rio B: R$0,50 por livro + R$2,50 fixo
		Fa�a um programa em que o usu�rio digite a quantidade de livros que deseja comprar
		e o programa diga qual � a melhor op��o de desconto. */
		
		int quantLivros;
		double criterioA;
		double criterioB;
		quantLivros=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros que voc� deseja comprar"));
		
		criterioA= (0.25*quantLivros)+7.5;
		criterioB= (0.50*quantLivros)+2.5;
		
		if(criterioA>criterioB) {
			JOptionPane.showMessageDialog(null, "O melhor Crit�rio de Desconto � o A\nValor Desconto: R$ "+criterioA+" reais.");
		}else {
			JOptionPane.showMessageDialog(null, "O melhor Crit�rio de Desconto � o B\nValor Desconto: R$ "+criterioB+" reais.");
		}

	}

}
