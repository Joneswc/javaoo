package aulaOO2;

public class DBA extends Funcionario {
	int senha;

//	polimorfismo baseado em sobrescrita (reescreve o algoritmo)
	@Override
	double getBonus() {
		return this.salario * 0.25;
	}

	public boolean verificaSenha(int senha) {
		if ( this.senha == senha ) {
			System.out.println( "Acesso autorizado" );
			return true;
		} else {
			System.out.println( "Acesso não autorizado" );
			return false;
		}
	}
}
