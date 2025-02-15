package tech.yuri.cepservice.controller.dtos;

public record ConsultaCepDTO(
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        Integer ibge,
        Integer gia,
        Integer ddd,
        Integer siafi
){}
