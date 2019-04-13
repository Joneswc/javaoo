package aulaOO2;

public class Vigilante extends Funcionario {

//	polimorfismo baseado em sobrescrita (reescreve o algoritmo)
	@Override
	double getBonus() {
		return this.salario * 0.25;
	}

}
