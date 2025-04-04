package Bank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Venilton");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Carlos");

		Cliente cliente3 = new Cliente();
		cliente3.setNome("Alexandre");

		Cliente cliente4 = new Cliente();
		cliente4.setNome("Marcos");

		Cliente cliente5 = new Cliente();
		cliente5.setNome("Ana");




		Conta cc = new ContaCorrente(cliente1);
		Conta cc2 = new ContaCorrente(cliente2);
		Conta cc3 = new ContaCorrente(cliente3);
		Conta cc4 = new ContaCorrente(cliente4);
		Conta cc5 = new ContaCorrente(cliente5);

		Conta poupanca1 = new ContaPoupanca(cliente1);
		Conta poupanca2 = new ContaPoupanca(cliente2);
		Conta poupanca3 = new ContaPoupanca(cliente3);
		Conta poupanca4 = new ContaPoupanca(cliente4);

		cc.depositar(100);
		cc.transferir(100, poupanca1);
		
		cc.imprimirExtrato();
		poupanca1.imprimirExtrato();

        List<Conta> listaContas = new ArrayList<Conta>();
		listaContas.addAll(Arrays.asList(cc, cc2, cc3, cc4, cc5, poupanca1
				,poupanca2, poupanca3, poupanca4));


		Banco banco = new Banco();
		banco.setContas(listaContas);

		banco.listarClientes();
	}





}