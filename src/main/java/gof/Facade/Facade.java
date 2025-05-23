package gof.Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void mirgraCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
