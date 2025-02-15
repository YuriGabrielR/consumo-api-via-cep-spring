package tech.yuri.cepservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import tech.yuri.cepservice.controller.dtos.ConsultaCepDTO;

@RestController
@RequestMapping("api/endereco")
public class ConsultaCEP {

    @GetMapping("/{cep}")
    public ConsultaCepDTO consultarCep (@PathVariable("cep") String cep){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ConsultaCepDTO> response = restTemplate.getForEntity(
                String.format("https://viacep.com.br/ws/%s/json/", cep),
                ConsultaCepDTO.class);

        return response.getBody();
    }

}
