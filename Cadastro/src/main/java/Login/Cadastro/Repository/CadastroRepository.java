package Login.Cadastro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Login.Cadastro.Model.CadastroModel;
import java.util.*;
@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long> {
      Optional<CadastroModel> findByEmail(String email);
      Optional<CadastroModel> findByEmailAndSenha(String email,String senha);
      
    
      boolean existsByEmail( String email);
      boolean existsByEmailAndSenha( String email,String senha);
      
    
}
