# Caixa Eletrônico — Versão 2

Esta é uma nova versão do meu projeto de **Caixa Eletrônico em Java**, originalmente desenvolvido durante a etapa de consolidação de Java básico.

A primeira versão foi construída principalmente dentro da classe `Main`, utilizando estruturas como condições, repetição, `switch`, `Scanner` e validações.

Após iniciar meus estudos de **Programação Orientada a Objetos**, resolvi voltar ao projeto e reorganizá-lo utilizando uma classe própria para representar a conta bancária.

## O que mudou?

A principal mudança desta versão não está nas funcionalidades, mas na **organização do código**.

Criei a classe:

```java
ContaBancaria
```

Ela passou a reunir dados e comportamentos relacionados à conta.

### Atributos

- `titular`
- `saldo`

### Métodos

- `deposito()`
- `sacar()`
- `mostrarSaldo()`
- `transferencia()`
- `pagarConta()`

Com isso, a classe `Main` ficou mais simples e passou a concentrar principalmente:

- autenticação;
- controle das tentativas de senha;
- exibição do menu;
- escolha das operações;
- chamada dos métodos da conta.

## Exemplo da mudança

Na primeira versão, boa parte das regras bancárias ficava diretamente no fluxo principal do programa.

Nesta versão, o `Main` pode simplesmente solicitar que o objeto realize determinada ação:

```java
usuarioDados.sacar();
usuarioDados.deposito();
usuarioDados.transferencia();
usuarioDados.pagarConta();
```

Isso tornou mais clara para mim uma das primeiras ideias da POO:

> os dados de um objeto podem ficar reunidos com os comportamentos relacionados a eles.

## Funcionalidades

O programa permite:

- autenticação com senha;
- limite de tentativas;
- consulta de saldo;
- saque;
- depósito;
- transferência;
- pagamento de boletos;
- validação de valores;
- verificação de saldo disponível;
- encerramento da sessão.

## Conceitos praticados

Além dos conteúdos utilizados na primeira versão:

- `Scanner`;
- `if/else`;
- `switch`;
- `do-while`;
- operadores;
- `String`;
- comparação com `.equals()`;
- formatação com `printf`;

esta versão começou a aplicar:

- classes;
- objetos;
- atributos;
- métodos;
- métodos `void`;
- alteração do estado de um objeto;
- separação de responsabilidades entre classes.

## Estrutura simplificada

```text
Main
│
├── autenticação
├── menu
└── seleção das operações
        │
        ▼
ContaBancaria
│
├── titular
├── saldo
│
├── deposito()
├── sacar()
├── mostrarSaldo()
├── transferencia()
└── pagarConta()
```

## Objetivo desta V2

O objetivo não foi transformar o projeto em um sistema bancário profissional.

A ideia foi pegar uma lógica que eu já havia desenvolvido anteriormente e utilizá-la para praticar meus primeiros conceitos de **Programação Orientada a Objetos**.

Isso permitiu comparar diretamente duas formas de organizar o mesmo problema:

```text
V1
Java básico
↓
lógica concentrada principalmente no Main
```

```text
V2
Introdução à POO
↓
dados e operações distribuídos em uma classe própria
```

## Próximas melhorias

Como esta versão acompanha meu nível atual de estudo, algumas melhorias foram deixadas propositalmente para etapas futuras.

Entre elas:

- receber valores através de parâmetros nos métodos;
- reduzir a responsabilidade do `Scanner` dentro da classe `ContaBancaria`;
- melhorar o encapsulamento dos atributos;
- utilizar construtores;
- trabalhar com métodos que retornam valores;
- aplicar conceitos posteriores de POO conforme forem estudados.

Esses recursos não serão adicionados apenas para tornar o código mais sofisticado. A intenção é incorporá-los conforme aparecerem naturalmente durante meus estudos.

## Status

**Versão 1:** concluída — Java básico.

**Versão 2:** concluída — primeira reorganização utilizando POO.

---

Este projeto faz parte do meu processo de aprendizagem em Java e registra a evolução entre a construção de pequenos programas procedurais e os primeiros passos na organização de código através de objetos.