package aulaOO2;

public class ContaTransf2 {
	private static int contadorDeContas; // static faz a vari�vel ser uma vari�vel da classe e n�o s� do objeto
//	cada objeto gerado � partir dessa classe, vai ler o mesmo valor para essa vari�vel static
	int  numero;
//	String nome;
//	Cliente cliente; // agrega��o ( losangulo no diagrama de classe )
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
