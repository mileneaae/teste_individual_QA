#language: pt
Funcionalidade: preenchimento da aba 4 de vehicle insurance Tricentris
    Este teste visa preencher diversos campos em um formulário com 5 abas diferentes

Cenario: Preenchendo aba Send Quota
    Dado que eu ainda permaneco no site da Trincentis na aba "Send Quota"
    E digito em E-mail "mileneaae@gmail.com"
    E digito em Phone "+5519999999999"
    E digito em Username "mileneaae"
    E digito em Password "milene123"
    E digito em Confirm Password "milene123"
    E escrevo em Comments "Favor entrar em contato pelo email"
    E clico em Send
    Entao devo visualizar "Sending e-mail success!"