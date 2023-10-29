# Estante PDF - Gerenciador de Biblioteca de PDF em Java

O **Estante PDF** é uma aplicação Java desenvolvida para gerenciar uma biblioteca de arquivos PDF, permitindo a manipulação e organização de informações referentes a artigos em PDF e seus respectivos autores. Este sistema implementa operações básicas de um CRUD (Create, Read, Update, Delete) para manipular informações sobre os artigos e seus autores.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- :page_with_curl: **Cadastro de Artigos em PDF:** Permite adicionar informações sobre os artigos, incluindo título, descrição, data de publicação e outros detalhes pertinentes.

- :busts_in_silhouette: **Registro de Autores:** Possibilita o armazenamento de informações sobre os autores dos artigos, como nome, afiliação, detalhes de contato, etc.

- :link: **Relacionamento entre Artigos e Autores:** Permite associar autores aos artigos correspondentes, possibilitando a consulta de quais autores contribuíram para um determinado artigo e vice-versa.

- :arrows_counterclockwise: **Atualização e Remoção de Registros:** Oferece a capacidade de atualizar e remover informações sobre artigos e autores.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

- **`src/`**: Contém o código-fonte do projeto.

    - **`Main.java`**: Ponto de entrada da aplicação.
    
    - **`model/`**: Contém as classes que representam os modelos de dados, como `Artigo`, `Autor`, entre outros.

    - **`dao/`**: Camada de acesso a dados, onde estão as classes responsáveis por realizar as operações de CRUD no banco de dados ou repositório.

    - **`service/`**: Classes que fornecem a lógica de negócios e serviços para manipulação dos dados.

    - **`util/`**: Classes utilitárias para funcionalidades auxiliares.

## Pré-requisitos

- :desktop_computer: JDK (Java Development Kit) instalado.
- :hammer_and_wrench: Uma IDE Java, como Eclipse, IntelliJ IDEA ou NetBeans, para executar e modificar o código.
- :book: Conhecimento básico de Java e manipulação de banco de dados (se estiver utilizando um).

## Configuração

1. Clone o repositório em seu ambiente de desenvolvimento:

   ```bash
   git clone https://github.com/seu-usuario/estante-pdf.git
