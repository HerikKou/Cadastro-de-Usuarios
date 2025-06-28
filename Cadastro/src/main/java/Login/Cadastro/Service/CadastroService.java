package Login.Cadastro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Login.Cadastro.Model.CadastroModel;
import Login.Cadastro.Repository.CadastroRepository;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public CadastroModel SalvarCadastro(CadastroModel cadastro) {

        String nome = cadastro.getNome();
        String email = cadastro.getEmail();
        String senha = cadastro.getSenha();

        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            System.out.println("Campos inválidos");

        } else if (cadastroRepository.existsByEmail(email)) {
            System.out.println("Usuário já cadastrado");

        } else {

            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Senha: " + senha);

            cadastroRepository.save(cadastro);
            System.out.println("Cadastro realizado com sucesso!");
            return cadastro;
        }

        return null;
    }

    public CadastroModel Logar(CadastroModel logn) {
        String email = logn.getEmail();
        String senha = logn.getSenha();

        if (senha.isEmpty() || email.isEmpty()) {
            System.out.println("Campo vazio ");

        }
        else if(cadastroRepository.existsByEmailAndSenha(email, senha)){
            System.out.println("Logado com Sucesso");
           return cadastroRepository.findByEmailAndSenha(email, senha).orElse(null);
             
             
        }
        else{
            System.out.println("Usuário ou Senha inválido");
            
        }
        return null;
       

    }
}