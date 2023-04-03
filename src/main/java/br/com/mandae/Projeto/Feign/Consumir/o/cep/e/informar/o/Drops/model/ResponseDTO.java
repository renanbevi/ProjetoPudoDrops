package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;


import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseDTO {

    @JsonProperty
    private String id;
    @JsonProperty
    @JsonAlias("social_name")
    private String socialName;
    @JsonProperty
    private String name;
    @JsonProperty
    @JsonAlias("trade_name")
    private String tradeName;
    @JsonProperty
    private Boolean activated;
    @JsonProperty
    private String code;
    @JsonProperty
    private Address address;
    @JsonProperty
    private Location location;





}
