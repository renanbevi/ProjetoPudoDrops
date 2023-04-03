package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.CepController;

import br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.InterfaceApiCep.CepApi;
import br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model.Address;
import br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model.ResponseDTO;
import feign.Feign;
import feign.Param;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/cep")
@AllArgsConstructor
public class ControllerCep {


    @Autowired
    private CepApi cepApi;

    @RequestMapping("/{postalcode}")
    public List<ResponseDTO> getPostalcode() {


        try {

            CepApi cepApi = Feign.builder().decoder(new JacksonDecoder()).encoder(new JacksonEncoder()).target(CepApi.class, "https://pudo-api.pontodrops.com.br/businessunits");


        } catch (Exception ex) {
            System.out.println(ex);
        }


        return cepApi.getPostalcode();

    }


}





