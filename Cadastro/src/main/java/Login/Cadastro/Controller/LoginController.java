package Login.Cadastro.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import Login.Cadastro.DTO.CadastroDTO;
import Login.Cadastro.Model.CadastroModel;
import Login.Cadastro.Service.CadastroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/cadastro")
public class LoginController {
  @Autowired
  private CadastroService cadastroservice;

  @GetMapping("/Hello")
  public String HelloWord() {
    return "Herllo-word";
  }

  @PostMapping("/salvar")
  public ResponseEntity<?> Salvar(@RequestBody CadastroModel cadastro) {
   CadastroModel user =  cadastroservice.SalvarCadastro(cadastro);

   if(user != null){
     return ResponseEntity.status(HttpStatus.CREATED).body(user);
   }
   else{
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
   }

  }

  @PostMapping("/logar")

  public ResponseEntity<CadastroModel> Validar(@RequestBody CadastroModel logn) {
    CadastroModel userInfo = cadastroservice.Logar(logn);

    if(userInfo != null){
      return ResponseEntity.status(HttpStatus.OK).body(userInfo);
    }
    else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

  }

}
