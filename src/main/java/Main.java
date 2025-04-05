import java.util.Scanner;

public class Main {

	public static final Scanner leitura = new Scanner(System.in);
	public static final Banco bancoSul = new Banco();

	public static void main(String[] args) {

		String fluxo;

		System.out.println("======BANCO SUL========");

		do {
			fluxo = menu();
		} while (!fluxo.equals("3"));
	}
	public static IConta cadastro(){
		System.out.printf("\n-----%s-----\n","Cadastro");
		System.out.print("Cliente : ");
		Cliente cliente = new Cliente(leitura.next());

		System.out.println("  1 - Conta corrente");
		System.out.println("  2 - Conta poupança");

		System.out.print("Opção---> ");
		String opcao = leitura.next();
		IConta conta;

		switch (opcao){
			case "1" -> conta = new ContaCorrente(cliente);
			case "2" -> conta = new ContaPoupanca(cliente);
			default -> throw new RuntimeException("Opção inválida");
		}

		System.out.print("Quanto deseja depositar? ");
		double deposito = leitura.nextDouble();
		conta.depositar(deposito);

		return conta;
	}
	public static String menu(){
		System.out.println("\n*****OPERAÇÃO******");
		System.out.println("""
				1 - Cadastrar conta
				2 - Listar contas
				3 - Sair 
				""");
		System.out.print("Escolha----> ");
		String opcao = leitura.next();

		switch (opcao){
			case "1" -> {bancoSul.getContas().add(cadastro());}
			case "2" -> listaContas();
			default -> System.out.println("Sair!!");
		}
		return opcao;
	}

	public static void listaContas(){
		bancoSul.getContas()
				.stream()
				.forEach(conta -> {
					System.out.println("");
					conta.imprimirExtrato();
				});
	}

}
