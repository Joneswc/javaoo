package aulaOO2;

public class Gerente extends Funcionario {
	@Override
	double getBonus() {
		return super.getBonus() + 10000;
	}
}
