import java.util.Scanner;

public class ContaBanco {
	private static int primeiroNumeroId = 1000;
	
	private int numeroId;
	private int numeroAgencia;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	public ContaBanco(String nomeCliente, doible saldo){
		this.numeroId = ++primeiroNomeId;
		this.nomeCliente = nomeCliente;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldoInicial;
		criarAgencia();
	}

	private void criarAgencia(){
		int digitoVerificador = this.numeroAgencia % 10; 	// Digito verificador 
		int numeroBase = this.numeroAgencia / 10;  		// Número base sem o dígito verificador
		this.agencia = numeroBase + "-" + digitoVerificador; // Formato: 1111-1
	}

	public int getNumeroId(){
		return numeroId;
	}

	public int getNumeroAgencia(){
		return numeroAgencia;
	}

	public String getAgencia(){
		return agencia;
	}
	
	Public String getNomeCliente(){
		return nomeCliente;
	}
	
	public double getSaldo(){
		return saldo;
	} 

	public void depositar(double valor){
		if(valor > 0){
			this.saldo += valor;
			System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
		}else{
			System.out.println("Valor inexistente para depósito!");
		}
		}
	}

	public ContaBanco(Scanner scanner){
		System.out.println("Digite seu nome completo: ");
		this.nomeCliente = scanner.nextLine();

		System.out.println("Digite o número da agência: ");
		this.numero = scanner.nextInt();
		//TODO: verificar uso de numero

	}
	
	public String getNomeCliente(){
		return nomeCliente;
	}

	public String getAgencia(){
		return agencia;
	}

	public int getNumero(){
		return numero;
	}

	public void exibirCliente(){
		System.out.println(" - - -  DADOS DA CONTA - - -");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("- - - Agradecemos a preferência! - - - ");
		System.out.println("");
	}
	
}