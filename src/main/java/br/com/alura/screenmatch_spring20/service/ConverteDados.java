package br.com.alura.screenmatch_spring20.service;


import br.com.alura.screenmatch_spring20.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper(); //mapper é o bketo do jackosn que realiza a conversão

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json,classe); //Pega o json e tenta converter na classe passada
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }



}
