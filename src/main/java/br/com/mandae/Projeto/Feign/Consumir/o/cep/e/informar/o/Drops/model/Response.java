package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.lang.reflect.Array;
import java.util.List;

@Data
@ToString
@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    @JsonProperty
    private List<ResponseDTO> responseDTOList;
}
