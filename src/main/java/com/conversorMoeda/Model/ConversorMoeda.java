package com.conversorMoeda.Model;

import org.springframework.boot.json.JsonParseException;
import org.springframework.boot.json.JsonParser;

import java.util.List;
import java.util.Map;

public record ConversorMoeda( Integer moedaInicial,
                             Integer moedaFinal,
                             Integer valorInicial,
                             Integer valorFinal)  {
}
