package br.com.wictorducla.TabelaFipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
