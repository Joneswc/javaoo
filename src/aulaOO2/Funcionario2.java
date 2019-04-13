package aulaOO2;

abstract public class Funcionario2 {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String status;

	void calculoBonificacao(double bonus) {
		salario += bonus;
	}

//	double getBonus() {
//		return this.salario * 0.05;
//	}

	abstract double getBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
