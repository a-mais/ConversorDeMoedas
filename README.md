# Conversor de Moedas

<p align="center">
  <img src="https://github.com/a-mais/ConversorDeMoedas/blob/main/Badge-Conversor.png" alt="Badge ConversorDeMoedas" width="400">
</p>

![Badge Status: FINALIZADO](http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=red&style=for-the-badge)

Um aplicativo que converte valores entre diferentes moedas, desenvolvido em **Java** como parte de um desafio proposto pela ONE Alura

## Índice
- [Descrição](#descrição)
- [Funcionalidades](#funcionalidades)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Licença](#licença)

## Descrição
O `Conversor de Moedas` é um aplicativo simples e eficiente desenvolvido em Java para converter valores entre diferentes moedas, como Dólar (USD), Real (BRL), Peso Argentino (ARS), Iene (JPY). O conversor obtém taxas de câmbio em tempo real através de uma API externa e realiza a conversão de valores com precisão.

## Funcionalidades
- Conversão entre várias moedas (BRL, USD, ARS, JPY).
- Obtenção de taxas de câmbio em tempo real através de uma API.
- Interface de terminal simples e fácil de usar.
- Exibição de valores convertidos com formatação personalizada (com vírgula como separador decimal).
- Tratamento de erros para respostas inválidas ou problemas na obtenção de dados.

## Instalação
Para instalar e executar o `Conversor de Moedas`, siga os passos abaixo:

1. Clone o repositório:
    ```sh
    git clone https://github.com/a-mais/conversor-de-moedas.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd conversor-de-moedas
    ```

3. Compile o projeto usando `javac`:
    ```sh
    javac -d bin src/org/paulo/*.java
    ```

4. Execute o aplicativo:
    ```sh
    java -cp bin org.paulo.Terminal
    ```

## Como Usar
Para utilizar o `Conversor de Moedas`, siga os passos abaixo:

1. **Iniciar o Aplicativo:** Após executar o aplicativo no terminal, o menu será exibido com as opções de conversão.

2. **Selecione a opção de conversão desejada.

3. **Digite o Valor:** Informe o valor que deseja converter.

4. **Visualize o Resultado:** O valor convertido será exibido no terminal, com a taxa de câmbio atualizada.

## Tecnologias Utilizadas
- Java 21
- API de Conversão de Moedas (Exchangerate API)
- Biblioteca Gson (para manipulação de JSON)

## Licença
Distribuído sob a licença MIT. Veja o arquivo `LICENSE` para mais informações.
