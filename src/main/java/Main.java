import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		String test = leitura.next();
		System.out.println(test);

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
