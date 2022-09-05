![logo_TIAcademy](https://user-images.githubusercontent.com/83440836/168492026-0c1f96c4-7128-4a32-8299-3c992922f19a.png)
<h2 align="center"> Bootcamp Java - Curso TI Academy - LAB TECH</h2> 
<h1 align="center">E-Boleto</h1>

<br>

<h2>Sobre</h2>

Autores: <br>• Hiziane F. Michalowski <br>• Jean Artico<br>• Vinicius Craveiro

Descrição: API para reimprimir e alterar data de vencimento de boleto.

<br>

![e_boleto](https://user-images.githubusercontent.com/83440836/188045364-abf56a77-e004-45c4-877d-17f8728f8dab.png)

<h2>End Points</h2>

Cliente

```
(GET) Listar todos os clientes
http://localhost:8080/cliente/

(GET) Listar cliente por Id
http://localhost:8080/cliente/{idCliente}

(GET) Listar todos os boletos do cliente
http://localhost:8080/cliente/{idCliente}/meus-boletos

(GET) Listar boletos abertos do cliente
http://localhost:8080/cliente/{idCliente}/meus-boletos/abertos

(POST) Adicionar cliente
http://localhost:8080/cliente/

{
    "razaosocialnome": "Razão social",
    "cnpjcpf": "1234567890",
    "ierg": "1234567890",
    "logradouro": "Rua Logradouro",
    "numero": "123A",
    "bairro": "Bairro",
    "complemento": "Complemento 123",
    "cep": "123456-000",
    "cidade": "Cidade",
    "estado": "AA",
    "email": "email@email.com",
    "telefone": "(99)99999-9999",
    "contato": "Contato",
    "senha": "Senha123"
}

(PUT) Editar cliente
http://localhost:8080/cliente/{idCliente}

{
    "razaosocialnome": "Razão social",
    "cnpjcpf": "1234567890",
    "ierg": "1234567890",
    "logradouro": "Rua Logradouro",
    "numero": "123A",
    "bairro": "Bairro",
    "complemento": "Complemento 123",
    "cep": "123456-000",
    "cidade": "Cidade",
    "estado": "AA",
    "email": "email@email.com",
    "telefone": "(99)99999-9999",
    "contato": "Contato"
}

(PUT) Alterar data de vencimento do boleto
http://localhost:8080/cliente/{idCliente}/meus-boletos/abertos/alterar-data={idBoleto}

(DELETE) Excluir cliente
http://localhost:8080/cliente/{idCliente}
```

<br>

Fornecedor

```
(GET) Listar todos os fornecedores
http://localhost:8080/fornecedor/

(GET) Listar cliente por Id
http://localhost:8080/fornecedor/{idFornecedor}

(POST) Adicionar fornecedor
http://localhost:8080/fornecedor/

{
    "razaosocial": "Razão social",
    "cnpj": "1234567890",
    "ie": "1234567890",
    "nomefantasia": "Nome fantasia",
    "logradouro": "Rua Logradouro",
    "numero": "123A",
    "bairro": "Bairro",
    "complemento": "Complemento 123",
    "cep": "123456-000",
    "cidade": "Cidade",
    "estado": "AA",
    "email": "email@email.com",
    "telefone": "(99)99999-9999",
    "prazopagamento": 5,
    "senha": "Senha123"
}

(PUT) Editar fornecedor
http://localhost:8080/fornecedor/{idFornecedor}

{
    "razaosocial": "Razão social",
    "cnpj": "1234567890",
    "ie": "1234567890",
    "nomefantasia": "Nome fantasia",
    "logradouro": "Rua Logradouro",
    "numero": "123A",
    "bairro": "Bairro",
    "complemento": "Complemento 123",
    "cep": "123456-000",
    "cidade": "Cidade",
    "estado": "AA",
    "email": "email@email.com",
    "telefone": "(99)99999-9999",
    "prazopagamento": 5
}

(DELETE) Excluir fornecedor
http://localhost:8080/fornecedor/{idFornecedor}
```
<br>

Boleto

```
(GET) Listar todos os boletos
http://localhost:8080/boleto/

(GET) Listar boleto por Id
http://localhost:8080/boleto/{idBoleto}

(GET) Listar boleto abertos do cliente pelo Id do cliente
http://localhost:8080/boleto/cliente={idCliente}/boletos-abertos

(GET) Listar todos os boletos do cliente pelo Id do cliente
http://localhost:8080/boleto/cliente={idCliente}/todos-boletos

(POST) Adicionar boleto
http://localhost:8080/boleto/

{
    "dataemissao": "2022-08-30",
    "datavencimento": "2022-09-30",
    "valor": 100.0,
    "obs": "Observação",
    "cliente": {
        "id": 1,
        "razaosocialnome": "Razão social",
        "cnpjcpf": "1234567890",
        "ierg": "1234567890",
        "logradouro": "Rua Logradouro",
        "numero": "123A",
        "bairro": "Bairro",
        "complemento": "Complemento 123",
        "cep": "123456-000",
        "cidade": "Cidade",
        "estado": "AA",
        "email": "email@email.com",
        "telefone": "(99)99999-9999",
        "contato": "Contato"
    },
    "fornecedor": {
        "id": 1,
        "razaosocial": "Razão social",
        "cnpj": "1234567890",
        "ie": "1234567890",
        "nomefantasia": "Nome fantasia",
        "logradouro": "Rua Logradouro",
        "numero": "123A",
        "bairro": "Bairro",
        "complemento": "Complemento 123",
        "cep": "123456-000",
        "cidade": "Cidade",
        "estado": "AA",
        "email": "email@email.com",
        "telefone": "(99)99999-9999",
        "prazopagamento": 5
    }
}

(DELETE) Excluir boleto
http://localhost:8080/boleto/{idBoleto}
```


<h2 align=center>:)</h2>
