# 📚 Sistema de Gerenciamento de Reservas (Backend)
### Plataforma WEB e Mobile para Reserva de Equipamentos e Espaços Acadêmicos

## 🌟 Sobre o Projeto

Este é o módulo **backend** do projeto acadêmico desenvolvido para a disciplina de **WEB II**. O sistema foi concebido para simplificar a gestão e o agendamento de reservas de recursos dentro de um ambiente educacional, como salas e equipamentos, por diferentes perfis de usuários (Alunos, Professores e Administradores).

O projeto adota uma arquitetura robusta, expondo uma **API RESTful** segura para ser consumida pela aplicação cliente (Front-end Mobile).

---

## 🛠️ Tecnologias Utilizadas

A solução é dividida em duas grandes partes, com tecnologias modernas e amplamente utilizadas:

### Back-end (API RESTful)
| Categoria | Tecnologia | Detalhes |
| :--- | :--- | :--- |
| **Framework** | **Spring Boot** | Simplificação da configuração e execução da aplicação Java. |
| **Segurança** | **Spring Security** | Gerenciamento de autenticação e autorização. |
| **Autenticação** | **JWT (JSON Web Token)** | Geração de tokens para comunicação segura entre cliente e servidor. |
| **Linguagem** | **Java** | Linguagem de programação principal. |
| **Banco de Dados** | **MySQL** | Armazenamento de dados do sistema. |

### Front-end (Aplicação Cliente)
| Categoria | Tecnologia | |
| :--- | :--- | :--- |
| **Framework** | **React Native** | Desenvolvimento de uma aplicação mobile nativa (Android/iOS). |
| **Repositório** | **Código Front-end** | [Janetoerick/Sistema-de-reserva-front-end](https://github.com/Janetoerick/Sistema-de-reserva-front-end) |

---

## 🔑 Funcionalidades Chave

O sistema permite diferentes níveis de acesso e funcionalidades:

### Administrador (Admin)
* Gerenciamento completo de **Salas** e **Equipamentos**.
* Gestão de **Usuários** (criação, edição e remoção de Alunos e Professores).
* Visualização e gerenciamento de **todas** as Reservas.

### Professor
* Realização de **Reservas Individuais** e **Grupais** de equipamentos e salas.
* Visualização e cancelamento das suas próprias reservas.
* Gerenciamento de **Turmas** (se aplicável).

### Aluno
* Realização de **Reservas Individuais** de equipamentos, com limite equipamentos reservados por aluno.
* Inclusão em **Reservas Grupais**.
* Visualização e cancelamento das suas próprias reservas.

---

## 🏛️ Estrutura do Sistema (Modelo de Dados)

O modelo de classes do sistema é baseado nas seguintes entidades principais:

### Entidades
* **Usuário**
    * Admin
    * Aluno
    * Professor
* **Reserva**
    * Reserva Individual
    * Reserva Grupal
* **Sala**
* **Turma**
* **Equipamento**

**Diagrama de Classes:**

O diagrama abaixo ilustra a relação entre as entidades do sistema:

![Diagrama do Modelo de Classes](https://github.com/Janetoerick/WEBII/blob/project2/diagrams/diagram%20class%20model.png)

---

## 🎥 Apresentação do Sistema

Você pode conferir a demonstração e apresentação completa do sistema no vídeo abaixo:

* **Apresentação em Vídeo:** [Assista à Apresentação do Sistema](https://youtu.be/ncVo2c9saAQ)

---

## 👤 Autor e Contato

Este projeto foi desenvolvido por:

* **Nome:** Janeto Erick
* **GitHub:** https://github.com/Janetoerick
* **E-mail:** janetoerick18@gmail.com
