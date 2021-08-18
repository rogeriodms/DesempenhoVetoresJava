package view;

import recursividade.DivisaoController;

public class principal {

	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		
		int dividendo = 15;
		int divisor  = 5;
		int div = dc.div(dividendo, divisor);
		
		System.out.println(div);
	}
}
