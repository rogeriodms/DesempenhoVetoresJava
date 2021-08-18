package recursividade;

public class DivisaoController {
	public DivisaoController() {
		super();
	}
	public int div(int dividendo, int divisor) {
		if(dividendo == 0) {
			return 0;
		} else {
			dividendo = dividendo - divisor;
			return 1 + div(dividendo,divisor);
		}
	}
}
