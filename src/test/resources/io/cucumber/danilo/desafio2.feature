#language: pt
Funcionalidade: preenchimento da aba 2 de vehicle insurance Tricentris
    Este teste visa preencher diversos campos em um formulário com 5 abas diferentes

  Cenario: Preenchendo aba Enter Insurant Data
    Dado que continuo no site da Trincentis na aba "Enter Insurant Data"
    E digito em First Name "Milene"
    E digito em Last Name "Eigenheer"
    E escolho em Date of Birth "03/03/1984"
    E escolho em Gender "Female"
    E digito em Street Adress "Rua Feliz, 111"
    E escolho em Contry "Brazil"
    E digito em Zip Code "13506000"
    E digito em City "Rio Claro"
    E seleciono em Occupation "Employee"
    E clico em Hobbies em "Other"
    E informo em Website "www.github.com/mileneaae"
    Entao devo clicar em Next para a aba3