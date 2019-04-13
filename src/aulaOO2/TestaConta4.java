package aulaOO2;

public class TestaConta4 {

	public static void main(String[] args) {
		Conta c1; // só criou um ponteiro
		c1 = new Conta(); // digo para onde ponteiro deve apontar (para área da memória heap onde construí esta conta)
		c1.limite = 100;
// cada new cria uma cópia na heap
		
		System.out.println( c1.limite );
		Conta c2; // cria um ponteiro
		c2 = c1; // ponteiro c2 aponta para ponteiro c1
		System.out.println( c2.limite );

		c2.limite = 200;
		System.out.println( c1.limite );
		System.out.println( c2.limite );
	}

}
