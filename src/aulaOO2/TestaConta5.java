package aulaOO2;

public class TestaConta5 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Joao";
		
		Conta c2 = new Conta();
		c2.nome = "Joao";
		
//		comparar objetos � a compara��o de seus bin�rios, ou seja, o endere�o de mem�ria
		if ( c1 == c2 ) {
			System.out.println( "as contas s�o iguais" );
		} else {
			System.out.println( "as contas s�o diferentes" );
		}

//		compara��o de valores
		if ( c1.nome.equals(c2.nome) ) {
			System.out.println( "os valores das contas s�o iguais" );
		} else {
			System.out.println( "os valores das contas s�o diferentes" );
		}
	}

}
