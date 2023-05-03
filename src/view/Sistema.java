/*
RESUMO      : Classe principal do sistema
PROGRAMADORA: Luiza Felix
DATA        : 02/05/2023
 */

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filas.Fila;
import controller.Controller;

public class Sistema {
	public static void main(String[] args) {
		int opcao = 0;
		Fila spam = new Fila();
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1) Adicionar número à lista de ligações perdidas\n 2) Visualizar lista de ligações perdidadas\n Para SAIR insira 0."));
			switch(opcao) {
			case 1:
				String numero = JOptionPane.showInputDialog("Digite o número de telefone");
				Controller.addcall(spam, numero);
				break;
			case 2:
				Controller.seecall(spam);
 				break;
			case 0:
				System.out.println("Programa finalizado com sucesso!");
			}
		}while(opcao!=0);
	}
}
