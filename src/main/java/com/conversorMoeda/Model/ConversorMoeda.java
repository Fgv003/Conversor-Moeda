package com.conversorMoeda.Model;


import com.google.gson.annotations.SerializedName;


public record ConversorMoeda(@SerializedName("base_code") String moedaInicial,
                             @SerializedName("target_code")String moedaFinal,
                             @SerializedName("conversion_rate")Double taxaConversao ,
                             @SerializedName("conversion_result") Double resultadoConversao)  {
}
