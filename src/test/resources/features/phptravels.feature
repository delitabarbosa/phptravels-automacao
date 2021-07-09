#language: pt
#enconding: UTF-8
@PhpTravels
Funcionalidade: PHPTRAVELS TESTES

  Contexto: 
    Dado que o usuario acesse o site phptravels

  @PhpTravels_001
  Esquema do Cenario: CST001 - DESEJO LOGAR NA APLICAÇÃO
    Dado que o usuario preencha email "<login>" e senha "<senha>"
    Entao o sistema exibe na tela a mensagem "<mensagem>"

    Exemplos: 
      | login                | senha     | mensagem  |
      | admin@phptravels.com | demoadmin | Hi Admin! |
