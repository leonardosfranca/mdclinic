package mdclinic.com.entity;

import mdclinic.com.endereco.DadosEndereco;

public record DadosCadrastoMedico(
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        DadosEndereco dadosEndereco
) {
}
