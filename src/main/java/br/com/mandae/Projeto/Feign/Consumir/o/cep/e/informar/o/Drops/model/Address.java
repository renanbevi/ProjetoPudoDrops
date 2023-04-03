package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address  {


    @JsonProperty
    @JsonAlias("postal_code")
    private String postalcode;
    @JsonProperty
    private String number;
    @JsonProperty
    private String complement;
    @JsonProperty
    private String district;
    @JsonProperty
    private String line;
    @JsonProperty
    private String city;
    @JsonProperty
    private String state;
    @JsonProperty
    @JsonAlias("reference_point")
    private String referencepoint;


}