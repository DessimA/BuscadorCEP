## 🗺️ Buscador de CEP 🗺️

Este projeto é uma aplicação web completa para consultar endereços a partir de CEPs, utilizando a API ViaCEP. Ele combina um backend Java com um frontend Node.js, garantindo uma experiência de usuário moderna e eficiente. 🚀

### Descrição

O Buscador de CEP oferece uma interface intuitiva para consultar endereços brasileiros, tornando a tarefa de encontrar informações completas sobre um CEP mais rápida e simples. 🎉 Você pode acessar a aplicação [aqui](https://frontend-buscacep.up.railway.app/).

### Arquitetura

O projeto é dividido em duas partes principais:

**Backend (Java):**

* **API REST:** Implementada em `backend/`, a API é responsável por realizar as consultas à API ViaCEP e retornar os dados formatados para o frontend. A API foi desenvolvida com Spring Boot, utilizando o `RestTemplate` para fazer as requisições HTTP à API externa. Para facilitar a leitura e configuração, a URL da API ViaCEP é armazenada em um arquivo `.env` que é carregado por meio da classe `ConfigurationProvider`.
* **Padrões de Projeto:** Utiliza o padrão Singleton para gerenciar o `HttpClient` e o padrão Facade para encapsular a lógica de consulta da API. O `HttpClientSingleton` garante que apenas uma instância da classe `HttpClient` seja criada, evitando a criação de múltiplas conexões e otimizando o uso de recursos. A classe `ConsultaCepFacade` atua como uma fachada, simplificando a interface para a camada de apresentação, ocultando os detalhes de implementação da consulta.

**Frontend (Node.js):**

* **Interface do Usuário:** Implementada em `frontend/`, a interface foi criada com Express e utiliza o motor de templates EJS para renderizar as páginas HTML. O código JavaScript interage com a API do backend por meio da função `fetch`, enviando o CEP digitado pelo usuário e recebendo os dados do endereço.
* **Comunicação com a API:** Utiliza `fetch` para realizar requisições à API REST do backend Java e renderizar os dados na tela.

### Recursos

* **Consulta de CEP:** Insira um CEP válido e obtenha informações detalhadas do endereço correspondente.
* **Interface Intuitiva:** Uma interface simples e amigável facilita o processo de consulta.
* **Resposta rápida:** Obtenha os dados do endereço rapidamente, com base na API ViaCEP.

### Como Usar

1. **Acesse a aplicação:** Clique no link [https://frontend-buscacep.up.railway.app/](https://frontend-buscacep.up.railway.app/) para acessar a aplicação web.
2. **Insira o CEP:** Digite o CEP desejado no campo de entrada e pressione "Consultar".
3. **Visualize o Endereço:** As informações do endereço, incluindo logradouro, complemento, bairro, localidade, UF e outros dados, serão exibidas na tela.

### Tecnologias

* **Backend:** Java, Spring Boot, Gson, Apache HttpClient
* **Frontend:** Node.js, Express, EJS
* **API:** ViaCEP

### Deploy

O projeto foi deployado no Railway, uma plataforma de hospedagem de aplicações web. A aplicação backend foi configurada como um serviço independente e a aplicação frontend foi configurada para acessar o backend utilizando a URL do serviço no Railway. 

**Contribuições são bem-vindas!** 🎉

Você pode contribuir com o projeto reportando problemas, sugerindo novas funcionalidades ou enviando código.

