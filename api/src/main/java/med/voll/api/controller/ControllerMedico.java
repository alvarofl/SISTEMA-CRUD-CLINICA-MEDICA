package med.voll.api.controller;

    import  jakarta.validation.Valid;
    

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
    
import med.voll.api.medico.DadosCadastrar;

@RestController
@RequestMapping("/medicos")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerMedico {

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastrar dados) {
        System.out.println(dados);
        return ResponseEntity.ok("Médico cadastrado com sucesso!");
    }
}