package br.com.zup.consomeviacep.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CepDto {

    @JsonProperty
    private String cep;

}
