# Programa de Soma de Números

Este é um programa simples em Java que lê dois valores inteiros inseridos pelo usuário e exibe a soma desses números na tela com uma mensagem explicativa.

## 🗃 Descrição

O programa realiza os seguintes passos:

Solicita ao usuário que insira o primeiro número.
Solicita ao usuário que insira o segundo número.
Calcula a soma dos dois números.
Exibe o resultado da soma na tela com a mensagem "SOMA = resultado".

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac somaNumero.java
   ```
4. Execute o programa:
   ```bash
   java somaNumero
   ```

## 🕹️ Como usar

1. Ao executar o programa, ele solicitará que você digite uma palavra.
2. Digite a palavra desejada e pressione Enter.
3. O programa exibirá a frequência de cada caractere na palavra digitada.

### Exemplo

Entrada:
```
Digite o primeiro numero:
3
Digite o segundo numero:
7

```

Saída:
```
SOMA = 10

## 🗂 Estrutura do código

O código é composto por:

- **Leitura da entrada do usuário**: Usando `Scanner` para capturar a palavra digitada.
- **Armazenamento em mapa**: Um `HashMap` é usado para contar e armazenar a frequência de cada caractere.
- **Iteração sobre a palavra**: Com um laço `for` que analisa cada caractere e atualiza o mapa.
- **Exibição do resultado**: Utiliza um laço `for-each` para imprimir cada caractere e sua frequência.

