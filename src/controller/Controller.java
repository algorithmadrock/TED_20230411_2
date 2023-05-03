/*
RESUMO      : Classe de controle da fila de ligações
PROGRAMADORA: Luiza Felix
DATA        : 02/05/2023
 */

package controller;

import br.edu.fateczl.filas.Fila;

public class Controller {
	
	public static void addcall(Fila adc, String telefone) {
		adc.insert(telefone);
		System.out.println( telefone + " foi adicionado ao final da fila.");
	}
	
	public static void seecall(Fila aux) {

		if(aux.vazia()) {
			System.err.println("Não há ligações perdidas.");
		} else {
			while(!aux.vazia()) {
				try {
					String numero = (String) aux.remove();
					System.out.println(numero);
				} catch (Exception e) {
					
				}
			}
		}
	
		
	}
}
