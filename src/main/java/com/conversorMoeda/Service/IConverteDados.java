package com.conversorMoeda.Service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
