package br.com.alura.screenmatch_spring20.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //T representa um retorno genérico
}
//Recebe um json(String), uma classe e, no conversor de dados, tenta-se transformar o json na classe indicada