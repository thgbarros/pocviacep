package br.com.zup.consomeviacep.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EnderecoDto {

    @JsonProperty
    private String cep;

    @JsonProperty
    private String logradouro;

    @JsonProperty
    private String complemento;

    @JsonProperty
    private String bairro;

    @JsonProperty(value = "localidade")
    private String cidade;

    @JsonProperty(value = "uf")
    private String estado;

    @JsonProperty(value = "ibge")
    private String codigoIbge;

    @JsonProperty(value = "ddd")
    private String codigoDeArea;

}
