package med.voll.api.controller;

    import  org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastrar;  

@RestController
@RequestMapping("/medicos")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerMedico {

    @PostMapping
    public ResponseEntity<      String> cadastrar(@RequestBody @Valid DadosCadastrar dados) {
        System.out.println(dados);
        return ResponseEntity.ok("Médico cadastrado com sucesso!");
    }
}