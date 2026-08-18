# Caixa Eletrônico em Java

Este projeto encerra uma sequência de pequenos sistemas que desenvolvi durante minha fase de consolidação do Java básico.

A proposta aqui não foi tentar reproduzir um sistema bancário real, mas pegar um fluxo relativamente familiar — autenticação, consulta, movimentação de saldo e encerramento — e transformar isso em lógica de programação usando apenas recursos que já estudei.

## O que o programa faz

O sistema simula uma conta bancária com saldo inicial definido e acesso protegido por senha.

Após a autenticação, o usuário pode:

* consultar o saldo;
* realizar saques;
* fazer depósitos;
* transferir valores para outro destinatário;
* pagar contas;
* encerrar a sessão.

Também foram adicionadas algumas validações para impedir comportamentos incorretos, como:

* acesso após três tentativas inválidas de senha;
* saque acima do saldo disponível;
* transferência sem saldo suficiente;
* operações com valores negativos ou iguais a zero;
* opções inexistentes no menu.

## Um dos pontos mais interessantes do projeto

Durante o desenvolvimento, percebi que algumas operações aparentemente diferentes possuem praticamente a mesma lógica.

Saque, transferência e pagamento de conta, por exemplo, compartilham uma regra central:

```text
receber valor
↓
validar o valor
↓
verificar saldo
↓
realizar ou recusar a operação
```

A diferença está principalmente nos dados associados a cada operação, como o destinatário de uma transferência ou a descrição de uma conta.

Esse tipo de percepção foi um dos objetivos dos microprojetos: olhar primeiro para o problema e depois decidir quais estruturas de programação são necessárias.

## Conceitos utilizados

O projeto foi desenvolvido em Java no console e utiliza:

`Scanner`
`String`
`double` e `int`
`if / else if / else`
`switch / case`
`do / while`
operadores lógicos
comparação de Strings com `.equals()`
formatação de valores com `printf`

Também pratiquei o uso de variáveis locais, deixando dados como saque, depósito e destinatário dentro das operações onde realmente são utilizados.

## Fluxo geral

```text
INÍCIO
   ↓
Solicitar senha
   ↓
Senha correta?
 ┌───────────────┐
 NÃO             SIM
 ↓                ↓
Nova tentativa   Menu principal
 ↓                ↓
3 erros?         Operações bancárias
 ↓                ↓
Bloqueio         Encerrar sessão
```

O menu permanece ativo até que o usuário escolha sair.

## Algumas dificuldades encontradas

Este projeto também serviu para trabalhar problemas que apareceram durante a implementação.

Entre eles:

* diferença entre `==` e `.equals()` ao comparar `String`;
* controle correto da condição de repetição na autenticação;
* organização do menu para impedir acesso após bloqueio;
* comportamento do `nextLine()` depois de `nextInt()` ou `nextDouble()`;
* validação de valores negativos;
* controle de saldo durante várias operações consecutivas.

Esses erros foram corrigidos por meio de testes progressivos no console.

## Testes realizados

A versão final foi testada com diferentes situações, incluindo:

* senha incorreta seguida de senha correta;
* três senhas inválidas;
* depósito;
* saque;
* transferência para destinatário com nome completo;
* pagamento de conta;
* tentativa de saque acima do saldo;
* opção inválida no menu;
* valores negativos;
* valor zero em transferência;
* conferência do saldo após várias operações.

O objetivo dos testes foi verificar não apenas se o programa executava, mas se o saldo permanecia coerente durante toda a sessão.

## Sobre esta versão

Esta é uma **V1 de estudo**.

Ela foi mantida propositalmente simples e procedural, sem utilização de:

* Programação Orientada a Objetos;
* banco de dados;
* múltiplas contas;
* persistência de dados;
* interfaces gráficas;
* frameworks.

A intenção era justamente encerrar a etapa de Java básico sem antecipar conteúdos que ainda serão estudados.

## Tecnologias

* Java
* Eclipse IDE
* Git / GitHub

## Contexto

Este é o quinto e último projeto de uma pequena sequência criada para praticar Java a partir de situações diferentes.

A progressão passou por sistemas de venda, atendimento, controle financeiro e, por fim, operações bancárias.

A partir daqui, a ideia é continuar avançando nos estudos e entrar gradualmente em conceitos mais estruturados da linguagem.
