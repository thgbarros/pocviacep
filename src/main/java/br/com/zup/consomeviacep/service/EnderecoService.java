package br.com.zup.consomeviacep.service;

import br.com.zup.consomeviacep.domain.Endereco;
import br.com.zup.consomeviacep.dto.EnderecoDto;
import br.com.zup.consomeviacep.mapper.EnderecoMapper;
import br.com.zup.consomeviacep.messaging.PublicadorDeEndereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final ViaCepClient viaCepClient;
    private final PublicadorDeEndereco publicadorDeEndereco;

    public void consultarEPublicarEndereco(String cep) {
        final EnderecoDto enderecoDto = viaCepClient.getEndereco(cep);
        final Endereco endereco = EnderecoMapper.INSTANCE.mapFrom(enderecoDto);
        publicadorDeEndereco.publicar(endereco);
    }

}
