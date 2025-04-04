package Bank;

public class ContaJuridica extends Conta {

    private String cnpj;

    public ContaJuridica(Cliente cliente, String cnpj) {
        super(cliente);
        this.cnpj = cnpj;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Jurídica ===");

        System.out.printf("Razão social: %s%n", this.cliente.getNome());
        System.out.printf("CNPJ: %s%n", this.cnpj);
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
