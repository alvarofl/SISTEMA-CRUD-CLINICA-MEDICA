package med.voll.api.controller;

@RestController
@RequestMapping("pacientes")

public class ControllerPaciente {
    @PostMapping
        public void CadastrarPaciente (@RequestBody DadosCadastroPaciente dados) {
                    System.out.println("dados recebido: " +dados);

        }
}