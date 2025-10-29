package med.voll.api.paciente;
public record DadosCadastrarPaciente     (
String nome,
String telefone,
String email,
String cpf,
    DadosEndereco endereco
){}