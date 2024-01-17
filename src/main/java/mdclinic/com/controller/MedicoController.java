package mdclinic.com.controller;

import mdclinic.com.entity.DadosCadrastoMedico;
import mdclinic.com.service.MedicoService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/medicos")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadrastoMedico dadosCadrastoMedico) {
        medicoService.cadastrar(dadosCadrastoMedico);
    }
}
