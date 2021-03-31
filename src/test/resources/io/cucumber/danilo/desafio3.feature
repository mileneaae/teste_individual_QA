#language: pt
Funcionalidade: preenchimento da aba 3 de vehicle insurance Tricentris
    Este teste visa preencher diversos campos em um formulário com 5 abas diferentes

  Cenario: Preenchendo aba Enter product Data
    Dado que ainda continuo no site da Trincentis na aba "Enter Product Data"
    E escolho em Start Date "08/31/2021"
    E digito em Insurance Sum "100.000,00"
    E escolho em Merit Rating "Bonus 1"
    E escolho em Damage Insurance "No Coverage"
    E escolho em Optional Products "Euro Protection"
    E seleciono em Courtesy Car "Yes" 
    Entao devo clicar em Next para a aba4