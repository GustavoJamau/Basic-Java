# Projeto Gerador de QR Code com Spring Boot

Este projeto gera QR Codes a partir de textos ou links inseridos em um formulário HTML.

---

## 🚀 Como rodar o projeto no IntelliJ IDEA

### 1. Abra o projeto

- No IntelliJ IDEA, vá em File > Open...
- Selecione a pasta raiz do projeto onde está o pom.xml
- O IntelliJ vai reconhecer o projeto Maven automaticamente

> **Observação:** não é necessário ter o Maven instalado globalmente, o IntelliJ baixa e usa o Maven internamente.

---

### 2. Execute a aplicação

- Abra o arquivo QrCodeApplication.java (ou a classe principal com @SpringBootApplication)
- Clique no botão verde ▶ para rodar a aplicação

O servidor Spring Boot será iniciado na porta padrão **8080**.

---

### 3. Acesse no navegador

Depois de rodar o projeto, abra seu navegador e vá para:

👉 [http://localhost:8080/](http://localhost:8080/)

Você verá a página inicial com o formulário para gerar QR Codes.

---

## 🖼️ Como usar

1. Digite um texto ou link no campo.
2. Clique em **Gerar**.
3. Um QR Code será gerado e exibido como imagem PNG na tela.

---