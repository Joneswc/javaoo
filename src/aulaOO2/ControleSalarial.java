package aulaOO2;

public class ControleSalarial {
	private double totalSalarios = 0;

//	polimorfismo, pois, apesar de o m�todo estar esperando Funcion�rio, posso passar, DBA ou Gerente, j� que estes extendem Funcion�rio
	public void setTotalSalarios( Funcionario funcionario ) {
		this.totalSalarios += funcionario.getSalario();
	}

	public double getTotalSalarios() {
		return this.totalSalarios;
	}

}
