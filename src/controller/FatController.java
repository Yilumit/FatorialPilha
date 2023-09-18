package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
	}
	
	public long fatorial(int valor) {
		PilhaInt pilhar = new PilhaInt();
	
		while (valor > 0) {
			pilhar.push(valor); //Adiciona o valor à pilha enquanto for maior que 0
			valor--;	//Decrementa 1 de valor
		}
		int fat = 1;
		while (!pilhar.isEmpty()) {
			try {
				fat *= pilhar.pop();	//fat recebe fat vezes o valor que estava no topo da pilha
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return fat;	//retorna o fatorial 
	}

}
