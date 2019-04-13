package aulaOO2;

public class ControlaBonus {
	private double totalBonus = 0;

	public void setTotalBonus( Funcionario funcionario ) {
		this.totalBonus += funcionario.getBonus();
	}

	public double getTotalBonus() {
		return this.totalBonus;
	}

}
