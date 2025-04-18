package Bank;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarClientes(){
		System.out.printf("%n=======================================%n");
		System.out.println("Listando clientes...");
		for (Conta conta : contas) {
			System.out.println(conta.cliente.getNome());
		}
	}

}