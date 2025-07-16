# Sistema Básico de Gerenciamento de Biblioteca em Java

Este projeto é um sistema simples de gerenciamento de empréstimo e devolução de livros, desenvolvido em Java. Ele foi criado como um desafio prático para aplicar e consolidar os conceitos fundamentais da linguagem, como Programação Orientada a Objetos (POO), coleções (`ArrayList`), entrada/saída de dados (`Scanner`) e tratamento básico de erros.

---

## Funcionalidades

O sistema oferece as seguintes funcionalidades principais através de um menu interativo:

* **Adicionar Livros:** Permite registrar novos livros no acervo da biblioteca (livros de exemplo são pré-carregados ao iniciar o sistema).
* **Listar Todos os Livros:** Exibe uma lista completa de todos os livros presentes no acervo, mostrando seus detalhes e status de empréstimo.
* **Listar Livros Disponíveis:** Apresenta apenas os livros que não estão atualmente emprestados e podem ser retirados.
* **Emprestar Livro:** Permite ao usuário emprestar um livro específico, alterando seu status para "emprestado". A operação é baseada no ID do livro.
* **Devolver Livro:** Permite ao usuário devolver um livro, mudando seu status de volta para "disponível". A operação também é baseada no ID do livro.
* **Gerenciamento de Datas:** Cada livro possui `dataCadastro` (data em que foi adicionado) e `dataAtualizacao` (última vez que seu status foi alterado), utilizando a API `java.time.LocalDate`.

---

## Tecnologias Utilizadas

* **Java 11+** (ou versão compatível)
* **Programação Orientada a Objetos (POO)**
* **`ArrayList`** para gerenciamento da coleção de livros
* **`Scanner`** para interação com o usuário via console
* **`java.time.LocalDate`** para manipulação de datas

---

## Estrutura do Projeto

* `src/`: Contém os arquivos fonte Java.
    * `Livro.java`: Classe que representa um livro com seus atributos (ID, nome, autor, status de empréstimo, datas de cadastro e atualização).
    * `Biblioteca.java`: Classe que gerencia o acervo de livros, contendo métodos para adicionar, listar, emprestar e devolver livros.
    * `Main.java`: Classe principal que contém o método `main`, responsável pelo menu interativo e pela interação do usuário com a `Biblioteca`.

---

## Autor

[Eduardo Will / ewillcode] - [github.com/ewillcode]

---