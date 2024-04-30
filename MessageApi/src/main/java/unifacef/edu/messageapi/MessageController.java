package unifacef.edu.messageapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //essa classe controla as requisições
public class MessageController {

    @GetMapping("/dia")
    public String bomDia(){
        return "bom dia";
    }
    @GetMapping("/tarde")
    public String boaTarde(){
        return "boa tarde";
    }
    @GetMapping("/noite")
    public String boaNoite(){
        return "boa noite zé";
    }
}
