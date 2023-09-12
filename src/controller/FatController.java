package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
	}
	
	public long fatorial(int valor) {
		PilhaInt pilhar = new PilhaInt();
	
		while (valor > 0) {
			pilhar.push(valor);
			valor--;
		}
		int fat = 1;
		while (!pilhar.isEmpty()) {
			try {
				fat *= pilhar.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return fat;
	}

}
