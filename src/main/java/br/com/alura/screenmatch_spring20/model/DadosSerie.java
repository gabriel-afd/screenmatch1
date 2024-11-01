package br.com.alura.screenmatch_spring20.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true) //Ignora o que não é Title, totalSeasons e imdbRating

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao){
                            //@JsonProperty("imdbVotes") String votos)

    //@JsonAlias É utilizado para relacionar os atributos de DadosSerie aos atributos originais do Json, somente lê o json, ademais aceita um range de palavras que pode procurar
    //@JsonProperty Serve para serializar e deserializar o Json, ou seja, ler e escreve imdbVotes
}
