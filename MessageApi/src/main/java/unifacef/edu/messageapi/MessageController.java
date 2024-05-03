package unifacef.edu.messageapi;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController //essa classe controla as requisições
public class MessageController {

    @GetMapping("/")
    public String home(){
        return "<h1>HAHAHAHHAHAHA</h1>";
    }
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

    @PostMapping("/user")
    public String user(@RequestBody User user){
        return "usuário criado!" + user;
    }

    @DeleteMapping("/user")
    public String userDelete(){
        return "usuário deletado!";
    }

    @PutMapping("/user")
    public String userUpdate(){
        return "usuário atualizado!";
    }

    @PatchMapping("/user/{id}")
    public String idUpdate(@PathVariable int id){
        return "id atualizado! " + id;
    }
}
