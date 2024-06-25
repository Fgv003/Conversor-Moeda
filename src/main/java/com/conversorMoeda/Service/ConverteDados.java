package com.conversorMoeda.Service;


import com.google.gson.Gson;

public class ConverteDados implements IConverteDados {
    private Gson gson = new Gson();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return gson.fromJson(json,classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT

//https://v6.exchangerate-api.com/v6/a2a94f2799edbd821c0e01d0/latest/USD

