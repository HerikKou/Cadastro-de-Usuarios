
async function Cadastrar() {
const nome = document.getElementById("txt").value;
const email = document.getElementById("email").value;
const senha = document.getElementById("password").value;
    const userdata = {
        nome: nome,
        email: email,
        senha: senha,
    };
    if (!nome || !email || !senha) {
        alert("Por favor, preencha todos os campos.");
        return;
    }
    try {
        const response = await fetch('http://localhost:8080/api/cadastro/salvar', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(userdata)
        });

        if (response.ok) {
            const data = await response.json();
            alert("Cadastro realizado com sucesso!");
            window.location.href = "Login.html";
        } 
    } catch (error) {
        console.error('Erro:', error);
       
    }

}
