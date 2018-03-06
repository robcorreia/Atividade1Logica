package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador 
		 pode escolher entre dois critérios de desconto:
		Critério A: R$0,25 por livro + R$7,50 fixo
		Critério B: R$0,50 por livro + R$2,50 fixo
		Faça um programa em que o usuário digite a quantidade de livros que deseja comprar
		e o programa diga qual é a melhor opção de desconto. */
		
		int quantLivros;
		double criterioA;
		double criterioB;
		quantLivros=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros que você deseja comprar"));
		
		criterioA= (0.25*quantLivros)+7.5;
		criterioB= (0.50*quantLivros)+2.5;
		
		if(criterioA>criterioB) {
			JOptionPane.showMessageDialog(null, "O melhor Critério de Desconto é o A\nValor Desconto: R$ "+criterioA+" reais.");
		}else {
			JOptionPane.showMessageDialog(null, "O melhor Critério de Desconto é o B\nValor Desconto: R$ "+criterioB+" reais.");
		}

	}

}
