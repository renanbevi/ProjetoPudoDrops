package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.InterfaceApiCep;


import br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model.Address;
import br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model.ResponseDTO;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "CepApi", url = "https://pudo-api.pontodrops.com.br/businessunits")
public interface CepApi {

    @RequestLine("GET /api/v1/business-units/nearby/02126040")
    @Headers(value = {"X-Api-Key:  0kUYNnDIzj5RWIp6GRE39sq/HdTJzCPcTmnpVA/97vFD60O4fWmUumwfSN7N8w=="})
        //@Headers({"x-api-key: 0kUYNnDIzj5RWIp6GRE39sq/HdTJzCPcTmnpVA/97vFD60O4fWmUumwfSN7N8w==", "Content-Type: application/json"})
    List<ResponseDTO> getPostalcode();


}


