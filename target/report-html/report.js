$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("inserir_conta.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de contas",
  "description": "Como um usuario \r\nGostaria de cadastrar contas\r\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.scenarioOutline({
  "line": 19,
  "name": "",
  "description": "",
  "id": "cadastro-de-contas;",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 20,
  "name": "informo a conta \"\u003cconta\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Entao "
});
formatter.before({
  "duration": 686461,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que estou acessando a aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "informo o usuario \"edu.hitman01.eh@gmail.com\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "a senha \"eduhitman1**\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.step({
  "line": 15,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicacao()"
});
formatter.result({
  "duration": 3960188900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edu.hitman01.eh@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.informoOUsuRio(String)"
});
formatter.result({
  "duration": 249952606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eduhitman1**",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "duration": 182857560,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "duration": 888125618,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPaginaInicial()"
});
formatter.result({
  "duration": 56412340,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "duration": 101122849,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "duration": 447789742,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 24,
      "value": "#Exemplos:"
    },
    {
      "line": 25,
      "value": "#| conta            | mensagem                          |"
    },
    {
      "line": 26,
      "value": "#| teste11          | Conta adicionada com sucesso!     |"
    },
    {
      "line": 27,
      "value": "#|                  | Informe o nome da conta           |"
    },
    {
      "line": 28,
      "value": "#| Conta mesmo nome | J� existe uma conta com esse nome!|"
    },
    {
      "line": 29,
      "value": "#falha de caracter especial \u0027�\u0027"
    }
  ],
  "line": 32,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "cadastro-de-contas;deve-inserir-uma-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 33,
  "name": "informo a conta \"teste1\"",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "a conta e inserida com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "teste1",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "duration": 121406345,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "duration": 433043817,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.aContaInseridaComSucesso()"
});
formatter.result({
  "duration": 48596227,
  "status": "passed"
});
formatter.after({
  "duration": 382818075,
  "status": "passed"
});
formatter.after({
  "duration": 658137125,
  "status": "passed"
});
formatter.before({
  "duration": 102637,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que estou acessando a aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "informo o usuario \"edu.hitman01.eh@gmail.com\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "a senha \"eduhitman1**\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.step({
  "line": 15,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicacao()"
});
formatter.result({
  "duration": 4419246982,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edu.hitman01.eh@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.informoOUsuRio(String)"
});
formatter.result({
  "duration": 208935219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eduhitman1**",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "duration": 123134270,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "duration": 841142000,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPaginaInicial()"
});
formatter.result({
  "duration": 53874187,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "duration": 90655682,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "duration": 476912701,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Nao deve inserir uma conta sem nome",
  "description": "",
  "id": "cadastro-de-contas;nao-deve-inserir-uma-conta-sem-nome",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 39,
  "name": "informo a conta \"\"",
  "keyword": "E "
});
formatter.step({
  "line": 40,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 41,
  "name": "sou notificado que o nome da conta e obrigatorio",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "duration": 64354636,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "duration": 307894237,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.souNotificadoQueONomeDaContaEObrigatorio()"
});
formatter.result({
  "duration": 54185116,
  "status": "passed"
});
formatter.after({
  "duration": 350611174,
  "status": "passed"
});
formatter.after({
  "duration": 676952911,
  "status": "passed"
});
formatter.before({
  "duration": 484809,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que estou acessando a aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "informo o usuario \"edu.hitman01.eh@gmail.com\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "a senha \"eduhitman1**\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.step({
  "line": 15,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicacao()"
});
formatter.result({
  "duration": 4356662533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edu.hitman01.eh@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.informoOUsuRio(String)"
});
formatter.result({
  "duration": 207229029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eduhitman1**",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "duration": 134746746,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "duration": 1975700981,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPaginaInicial()"
});
formatter.result({
  "duration": 48342049,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "duration": 125002868,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "duration": 373764884,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Nao deve inserir uma conta com nome ja existente",
  "description": "",
  "id": "cadastro-de-contas;nao-deve-inserir-uma-conta-com-nome-ja-existente",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 45,
  "name": "informo a conta \"teste1\"",
  "keyword": "E "
});
formatter.step({
  "line": 46,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "sou notificado que ja existe uma conta com esse nome",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "teste1",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "duration": 101431968,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "duration": 388470358,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.souNotificadoQueJaExisteUmaContaComEsseNome()"
});
formatter.result({
  "duration": 46557373,
  "status": "passed"
});
formatter.after({
  "duration": 349412131,
  "status": "passed"
});
formatter.after({
  "duration": 690360329,
  "status": "passed"
});
});