package aulaOO2;

public class Gerente extends Funcionario implements ControleInterno2 {

	double getBonus() {
		return super.getBonus() + 10000;
	}

	public boolean verifica(int senha) {
		return false;
	}

}
