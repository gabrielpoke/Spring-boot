package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.Model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(Model model){

        Pedido pedido = new Pedido();

        pedido.setNomeProduto("Boneco Pokémon Legendary Lunala");
        pedido.setDataDeEntrega(LocalDateTime.now());
        pedido.setUrlImagem("https://a-static.mlcdn.com.br/1500x1500/boneco-pokemon-legendary-lunala-sunny-brinquedos/magazineluiza/226915900/ce88021f070d0646cffc80837054a3bf.jpg");
        pedido.setUrlProduto("https://www.magazineluiza.com.br/boneco-pokemon-legendary-lunala-sunny-brinquedos/p/226915900/br/bnco/");
        pedido.setDescricao("Uma descrição qualquer para testes");

        List<Pedido> pedidos = Arrays.asList(pedido);

        model.addAttribute("pedidos",pedidos);
        return "home";
    }
}
