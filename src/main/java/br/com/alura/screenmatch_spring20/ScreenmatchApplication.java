package br.com.alura.screenmatch_spring20;

import br.com.alura.screenmatch_spring20.model.DadosSerie;
import br.com.alura.screenmatch_spring20.service.ConsumoApi;
import br.com.alura.screenmatch_spring20.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//ConsumoApi consumoApi = new ConsumoApi();
		var consumoApi = new ConsumoApi(); //Outra formad e instanciar ConsumoApi
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");

		//json = json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
