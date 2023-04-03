package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility =JsonAutoDetect.Visibility.ANY)
public class Root{
    @JsonProperty
    public String id;
    @JsonProperty
    public double distance_in_meters;
    @JsonProperty
    public String social_name;
    @JsonProperty
    public String name;
    @JsonProperty
    public String trade_name;
    @JsonProperty
    public boolean accepting_orders;
    @JsonProperty
    public boolean activated;
    @JsonProperty
    public double fee;
    @JsonProperty
    public String code;
    @JsonProperty
    public List<Location> location;
    @JsonProperty
    public String fee_code;
    @JsonProperty
    public List<BreakHours> breakhours;
    @JsonProperty
    public List<WorkingHours> workinghours;
    @JsonProperty
    public boolean print_label;
    @JsonProperty
    public boolean has_parking;
}
