package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location{
    public double latitude;
    public double longitude;
}
