package aulaOO2;

public class ContaTransf2 {
	private static int contadorDeContas; // static faz a variável ser uma variável da classe e não só do objeto
//	cada objeto gerado à partir dessa classe, vai ler o mesmo valor para essa variável static
	int  numero;
//	String nome;
//	Cliente cliente; // agregação ( losangulo no diagrama de classe )
	double saldo;
	double limite;

//	Cliente cliente = new Cliente();

//	public ContaTransf2() {
//		System.out.println( "testando construtor" );
//	}

	Cliente cliente;

	public ContaTransf2(String nome, String cpf) {
		cliente  = new Cliente();
		System.out.println( "testando construtor" );
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		ContaTransf2.contadorDeContas++;
	}

	public static int getContadorDeContas() {
		return contadorDeContas;
	}

}
