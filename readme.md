## 🗺️ Buscador de CEP 🗺️

Este projeto em Java implementa uma aplicação de console para consultar endereços a partir de CEPs utilizando a API ViaCEP. 💻  A aplicação utiliza alguns padrões de projeto GoF (Gang of Four) para organizar e estruturar o código de forma mais eficiente. ✨

### Descrição

A aplicação "Buscador de CEP" é uma ferramenta simples de linha de comando que permite consultar informações de endereço com base em um CEP (Código de Endereçamento Postal) fornecido pelo usuário. 🔎 Ela utiliza a API ViaCEP para obter os dados e exibi-los no console. 🖥️

### Conceitos Aplicados

O projeto utiliza os seguintes padrões de projeto GoF:

* **Singleton:** 🔐 Garante a existência de apenas uma instância da classe HttpClient para realizar as requisições HTTP, evitando a criação de múltiplas conexões com a API e otimizando o uso de recursos. 
* **Facade:** 🏢 A classe ConsultaCepFacade atua como uma fachada simplificada para o serviço de consulta de CEP, ocultando os detalhes de implementação e fornecendo uma interface mais amigável para a camada de apresentação. 
* **Factory Method:** 🔨 A classe HttpClientFactory é responsável por criar e retornar instâncias de HttpClient por meio do método factory getHttpClient(), permitindo a criação de diferentes tipos de clientes HTTP sem modificar o código principal.

### Requisitos

Para executar esta aplicação, você precisará ter os seguintes componentes instalados:

* **Java Development Kit (JDK) 17 ou superior** ☕
* **Apache Maven** 📦

### Execução

1. **Clone o repositório do projeto em sua máquina local.** ⬇️
2. **Navegue até o diretório raiz do projeto.** 📁
3. **Compile o projeto usando o Maven:** `mvn clean install` 🔨
4. **Execute a aplicação com o seguinte comando:** `mvn exec:java -Dexec.mainClass="org.buscador.cep.ConsultaCepApplication"` 🚀
5. **Após a execução, a aplicação solicitará que você digite um CEP. Digite o CEP desejado e pressione Enter.**  ⌨️ A aplicação consultará a API ViaCEP e exibirá as informações de endereço correspondentes ao CEP fornecido. 
6. **Para encerrar a aplicação, digite "sair" quando solicitado o CEP.** 🚪

### Estrutura do Projeto

```
BuscadorCep/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── org/
        │       └── buscador/
        │           └── cep/
        │               ├── ConsultaCepApplication.java
        │               ├── config/
        │               │   └── ConfigurationProvider.java
        │               ├── controller/
        │               │   └── ConsultaCepController.java
        │               ├── facade/
        │               │   └── ConsultaCepFacade.java
        │               ├── factory/
        │               │   └── HttpClientFactory.java
        │               ├── model/
        │               │   └── EnderecoResponse.java
        │               └── singleton/
        │                   └── HttpClientSingleton.java
        └── resources/
            └── env
```

O arquivo `env` contém a configuração da aplicação, incluindo a URL da API ViaCEP:

```
API_URL=https://viacep.com.br/ws/
```

### Observações

* A API ViaCEP não exige autenticação. 🔓
* A aplicação valida o formato do CEP antes de realizar a consulta. 👮
* Em caso de CEP inválido ou inexistente, a aplicação exibe uma mensagem de erro. ⚠️

### Próximos Passos

* Implementar a funcionalidade de pesquisa de CEP por endereço. 🔍
* Adicionar um GUI para a aplicação. 🖼️
* Integrar a aplicação com outras APIs de geolocalização. 🌎

**Contribuições são bem-vindas!** 🎉

