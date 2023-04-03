package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BreakHours{
    @JsonProperty
    public boolean break_time;
    @JsonProperty
    public Object break_time_hours_start;
    @JsonProperty
    public Object break_time_hours_end;
}