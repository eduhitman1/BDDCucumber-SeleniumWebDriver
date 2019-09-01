#language:pt
@funcionais
Funcionalidade: Cadastro de contas
Como um usuario 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada


Contexto:
Dado que estou acessando a aplicacao
Quando informo o usuario "edu.hitman01.eh@gmail.com"
E a senha "eduhitman1**"
E seleciono entrar
Entao visualizo a pagina inicial
Quando seleciono Contas
E seleciono Adicionar


Esquema do Cenario: 
Quando informo a conta "<conta>"
E seleciono Salvar
Entao recebo a mensagem "<mensagem>"

#Exemplos:
#| conta            | mensagem                          |
#| teste11          | Conta adicionada com sucesso!     |
#|                  | Informe o nome da conta           |
#| Conta mesmo nome | Já existe uma conta com esse nome!|
                    #falha de caracter especial 'á'


Cenario: Deve inserir uma conta com sucesso
E informo a conta "teste1"
E seleciono Salvar
Entao a conta e inserida com sucesso


Cenario: Nao deve inserir uma conta sem nome
E informo a conta ""
E seleciono Salvar
Entao sou notificado que o nome da conta e obrigatorio


Cenario: Nao deve inserir uma conta com nome ja existente 
E informo a conta "teste1"
E seleciono Salvar
Entao sou notificado que ja existe uma conta com esse nome