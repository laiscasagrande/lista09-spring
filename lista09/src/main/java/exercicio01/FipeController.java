package exercicio01;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClient;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/fipe") //rota base
public class FipeController {

    private RestClient cliente = RestClient.create("https://parallelum.com.br/fipe/api/v1/carros"); //api que irei utilizar

    @GetMapping("/")
    public String exibeCarro() {
        return cliente.get().uri("/carro").retrieve().body(String.class);
    }

    @GetMapping("/carros")
    public Carro[] listaCarro() {
        return cliente.get().uri("/carros").retrieve().body(Carro[].class);
    }


}
