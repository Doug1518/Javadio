package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep,String cidade ,String estado) {
        System.out.printf("Gravando cliente %s\n", nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
