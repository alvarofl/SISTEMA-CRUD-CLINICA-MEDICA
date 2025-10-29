package med.voll.api.paciente;
public record DadosCadastroPaciente (
String nome,
String telefone,
String email,
String cpf,
DadosEndereco endereco
)
{}