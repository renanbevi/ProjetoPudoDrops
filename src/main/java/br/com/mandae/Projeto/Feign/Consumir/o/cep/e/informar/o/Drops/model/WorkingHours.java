package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkingHours{
    public Object monday_open;
    public Object monday_close;
    public Object tuesday_open;
    public Object tuesday_close;
    public Object wednesday_open;
    public Object wednesday_close;
    public Object thursday_open;
    public Object thursday_close;
    public Object friday_open;
    public Object friday_close;
    public Object saturday_open;
    public Object saturday_close;
    public Object sunday_open;
    public Object sunday_close;
    public Object hollyday_open;
    public Object hollyday_close;
}
