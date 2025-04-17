import java.util.Scanner;

public class ContaBanco {
	public int numero;
	public String agencia;
	public String nomeCliente;
	public double saldo;
	//TODO: ideal é usar private e criar métodos getters e setters para acessar os atributos da classe, por estudo academico eu mantive public.

	public ContaBanco(){
	}

	public void calcularAgencia(int numero){
		this.numero = numero;
		int digitoVerificador = numero % 10; 	// Digito verificador é o resto da divisão por 10
		int numeroBase = numero / 10;  		// Número base sem o dígito verificador
		this.agencia = numeroBase + "-" + digitoVerificador; // Formato: 1111-1
	}
	//TODO: aqui utilizei o numero como entrada de agencia e conversão, mas esse numero é ideal que seja o ID do usuário, manterei assim. O vinculo ID é bom ser auto incremental ao usuario ou vincular o CPF como ID, varia de politica da empresa.

	public void exibirCliente(){
		System.out.println(" - - -  DADOS DA CONTA - - -");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("- - - Agradecemos a preferência! - - - ");
		System.out.println("");
	}
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		ContaBanco conta = new ContaBanco();
		
		System.out.println("Digite o numero da agência: ");
		conta.numero = scanner.nextInt();
		scanner.nextLine();
		conta.calcularAgencia(conta.numero);

		System.out.println("Por favor, digite o seu nome: ");
		conta.nomeCliente = scanner.nextLine();

		System.out.println("Qual o valor que deseja depositar: ");
		conta.saldo = scanner.nextDouble();
		
		for (int i = 0; i < 30; i++) { //inserção de linhas para "limpar" o console"
		System.out.println("");
		}
		
		System.out.println("- - - - - - - - - - - - - - ");
		System.out.println(" Conta criada com sucesso!");
		System.out.println("- - - - - - - - - - - - - - ");
		
		conta.exibirCliente();

		scanner.close();
	}
}


