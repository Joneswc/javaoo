package aulaOO2;

public class TestaConta5 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Joao";
		
		Conta c2 = new Conta();
		c2.nome = "Joao";
		
//		comparar objetos é a comparação de seus binários, ou seja, o endereço de memória
		if ( c1 == c2 ) {
			System.out.println( "as contas são iguais" );
		} else {
			System.out.println( "as contas são diferentes" );
		}

//		comparação de valores
		if ( c1.nome.equals(c2.nome) ) {
			System.out.println( "os valores das contas são iguais" );
		} else {
			System.out.println( "os valores das contas são diferentes" );
		}
	}

}
