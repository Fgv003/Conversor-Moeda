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