package med.voll.api.medico.endereco;
    import  jakarta.validation.constraints.NotBlank;


public record   DadosEndereco (
    @NotBlank(message = "o logradouro é obrigatório")
String logradouro,
    @NotBlank(message = "Bairro é obrigatório")
 String bairro,
     @NotBlank(message = "CEP é obrigatório")
  String cep,
    @NotBlank(message = "Cidade é obrigatória")
  String cidade,
      @NotBlank(message = "UF é obrigatória")
   String uf,
    String complemento,
     String numero 
    
) {}