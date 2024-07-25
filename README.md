# Controle Administrativo Console Java

Este projeto é um aplicativo de console em Java que permite gerenciar informações de funcionários. O aplicativo utiliza conceitos de Programação Orientada a Objetos (POO) e permite adicionar, listar, alterar e exibir informações dos funcionários.

## Funcionalidades

1. **Adicionar Novo Funcionário**:
   - Adiciona um novo funcionário à lista, incluindo primeiro nome, último nome, função e salário.

2. **Nome de Todos os Funcionários**:
   - Lista os primeiros nomes de todos os funcionários presentes na lista.

3. **Alterar Informações de Funcionário**:
   - Permite alterar o primeiro nome, último nome, função ou salário de um funcionário específico, baseado na posição na lista.

4. **Informação de Todos os Funcionários**:
   - Exibe detalhes de todos os funcionários na lista.

## Estrutura do Projeto

- **`application.administrativoconsole.AdministrativoConsole`**: Ponto de entrada do programa que gerencia as operações administrativas no console.

- **`entities.Funcionario`**: Classe que representa um funcionário com atributos como nome, sobrenome, função e salário.

## Como Usar

1. **Compilação e Execução**:
   - Compile o projeto usando um IDE como NetBeans ou via linha de comando com `javac`.
   - Execute o programa principal (`AdministrativoConsole`).

2. **Menu de Opções**:
   - Ao iniciar o programa, o menu apresentará as seguintes opções:
     ```
     Bem Vindo Ao Controle Administrativo Console Java 
     1 - Adicionar Novo Funcionario 
     2 - Nome De Todos Os Funcionarios 
     3 - Alterar 
     4 - Informação De Todos Os Funcionarios 
     ```

3. **Adicionar Novo Funcionário**:
   - Escolha a opção 1.
   - Forneça os dados solicitados: primeiro nome, último nome, função e salário.
   - O funcionário será adicionado à lista.

4. **Nome de Todos os Funcionários**:
   - Escolha a opção 2.
   - O programa exibirá os primeiros nomes de todos os funcionários na lista.

5. **Alterar Informações de Funcionário**:
   - Escolha a opção 3.
   - Selecione o tipo de informação a ser alterada (primeiro nome, último nome, função ou salário).
   - Informe a posição do funcionário na lista e forneça o novo valor para a informação escolhida.

6. **Informação de Todos os Funcionários**:
   - Escolha a opção 4.
   - O programa exibirá todos os detalhes dos funcionários na lista.

## Exemplo de Uso

Bem Vindo Ao Controle Administrativo Console Java
1 - Adicionar Novo Funcionario
2 - Nome De Todos Os Funcionarios
3 - Alterar
4 - Informação De Todos Os Funcionarios

1
Adicionando Novo Funcionario
Primeiro Nome : João
Último Nome : Silva
Qual é a sua função dentro da empresa : Desenvolvedor
Seu Salario Atual : 5000.0
Funcionario adicionado com sucesso

2
JOÃO

3
Digite o que deseja alterar :
1 - primeiro nome
2 - ultimo nome
3 - função
4 - salário
1
ATENÇÃO - Você alterará o primerio nome do funcionario
primeiro digite sua posição na lista
0
Você Mudará o nome de JOÃO
Digite o novo nome : Pedro
Alteração Feita Com Sucesso

4
Informação De Todos os usuarios
Funcionario{firstname='Pedro', lastname='Silva', role='Desenvolvedor', salary=5000.0}

## Requisitos

- Java Development Kit (JDK) instalado
- Um ambiente de desenvolvimento (IDE) como NetBeans ou um editor de texto para compilar e executar o código

## Autor

Desenvolvido por MeSaulo.
