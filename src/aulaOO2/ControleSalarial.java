package aulaOO2;

public class ControleSalarial {
	private double totalSalarios = 0;

//	polimorfismo, pois, apesar de o método estar esperando Funcionário, posso passar, DBA ou Gerente, já que estes extendem Funcionário
	public void setTotalSalarios( Funcionario funcionario ) {
		this.totalSalarios += funcionario.getSalario();
	}

	public double getTotalSalarios() {
		return this.totalSalarios;
	}

}
