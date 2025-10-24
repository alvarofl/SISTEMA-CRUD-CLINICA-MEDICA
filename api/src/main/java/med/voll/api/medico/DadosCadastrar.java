package med.voll.api.medico;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
    
    import med.voll.api.medico.endereco.DadosEndereco;
import med.voll.api.medico.Especialidade;


public record DadosCadastrar (
    @NotBlank(message = "nome é obrigatório")
    String nome,
    @NotBlank(message = "email é obrigatório")
    @Email(message = "Formato de e-mail inválido")
        String email,
    @NotBlank(message = "CRM é obrigatório")
    @Pattern(regexp = "\\d{4,6}", message = "CRM deve ter entre 4 e 6 dígitos numéricos")
    String crm,

    @Valid
    DadosEndereco endereco,

    
    Especialidade especialidade

){}