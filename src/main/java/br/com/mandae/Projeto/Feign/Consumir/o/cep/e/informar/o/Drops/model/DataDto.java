package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDto {

    List<ResponseDTO> responseDTOList;



}
