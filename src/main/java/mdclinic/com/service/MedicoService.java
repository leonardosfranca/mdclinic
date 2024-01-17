package mdclinic.com.service;

import mdclinic.com.entity.DadosCadrastoMedico;
import mdclinic.com.entity.Medico;
import mdclinic.com.repository.MedicoRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public void cadastrar(DadosCadrastoMedico dados) {
        medicoRepository.save(new Medico(dados));
    }
}
