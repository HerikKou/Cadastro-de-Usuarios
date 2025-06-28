async function  Logar() {
    const email = document.getElementById("email").value;
    const senha = document.getElementById("password").value;
    const user = {
        email: email,
        senha: senha

    }
    if(!email || !senha) {
        alert("Por favor, preencha todos os campos.");
        return;
    }
    try {
        const response = await fetch('http://localhost:8080/api/cadastro/logar', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(user)
        });

        if (response.ok) {
            const data = await response.json();
          
            alert("Logado com Sucesso")
              
        } 
      

        else{
            alert("Usuário ou Senha inválido")
        }

    } catch (error) {
        console.log('Erro:', error);
      
     
    }
}