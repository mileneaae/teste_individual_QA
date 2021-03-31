# Teste individual QA <br>
## Por Milene Amâncio Alves Eigenheer <br>


VOLTAR

# Descrição do desafio
## Criar uma aplicação Selenium para teste de preenchimento de formulário no site "http://sampleapp.tricentis.com/101/app.php"
## Foram elaborados 5 cenários em 5 arquivos de teste, um para cada aba do formulário.

## Caso de teste 1
Preenchimento da aba 1 de vehicle insurance Tricentris

<b>Cenario</b>: Preenchendo aba Enter Vehicle Data
Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"
E seleciono em Make "Honda"
E seleciono em Model "Scooter"
E digito em Cylinder Capacity "125"
E digito em Engine Performance "20"
E escolho em Date of Manufacture "01/01/2018"
E digito em Number of Seats "1"
E escolho em Right Hand Drive "Yes"
E seleciono em Number of Seats "1"
E seleciono em Fuel Type "Gas"
E digito em Payload "150"
E digito em Total Weight "300"
E digito em List Price "1000"
E digito em License Plate Number "ABC123"
E digito em Annual Mileage "3000"
Entao clico em Next para a aba2

## Caso de teste 2
Preenchimento da aba 2 de vehicle insurance Tricentris

<b>Cenario</b>: Preenchendo aba Enter Insurant Data
Dado que continuo no site da Trincentis na aba "Enter Insurant Data"
E digito em First Name "Milene"
E digito em Last Name "Eigenheer"
E escolho em Date of Birth "03/03/1984"
E escolho em Gender "Female"
E digito em Street Adress "Rua 8B, 1338"
E escolho em Contry "Brazil"
E digito em Zip Code "13506739"
E digito em City "Rio Claro"
E seleciono em Occupation "Employee"
E clico em Hobbies em "Other"
E informo em Website "www.github.com/mileneaae"
Entao devo clicar em Next para a aba3

## Caso de teste 3
Preenchimento da aba 3 de vehicle insurance Tricentris

<b>Cenario</b>: Preenchendo aba Enter product Data
Dado que ainda continuo no site da Trincentis na aba "Enter Product Data"
E escolho em Start Date "08/31/2021"
E digito em Insurance Sum "100.000,00"
E escolho em Merit Rating "Bonus 1"
E escolho em Damage Insurance "No Coverage"
E escolho em Optional Products "Euro Protection"
E seleciono em Courtesy Car "Yes" 
Entao devo clicar em Next para a aba4

## Caso de teste 4
Preenchimento da aba 4 de vehicle insurance Tricentris

<b>Cenario</b>: Preenchendo aba Select price option
Dado que permaneco no site da Trincentis na aba "Select Price Option"
E escolho em Select option Plano Gold
Entao devo clicar em Next para a aba5

## Caso de teste 5
Preenchimento da aba 4 de vehicle insurance Tricentris

<b>Cenario</b>: Preenchendo aba Send Quota
Dado que eu ainda permaneco no site da Trincentis na aba "Send Quota"
E digito em E-mail "mileneaae@gmail.com"
E digito em Phone "+5519983068961"
E digito em Username "mileneaae"
E digito em Password "milene123"
E digito em Confirm Password "milene123"
E escrevo em Comments "Favor entrar em contato pelo email"
E clico em Send
Entao devo visualizar "Sending e-mail success!"

----------------------
# Tecnologias utilizadas
- [x] Java
Linguagem de programação utilizada para o desenvolvimento da aplicação.

- [x] Maven
Gerenciador de dependências para o Java.

- [x] Cucumber
Framework que traduz a linguagem humana dos cenários em códigos Java.

- [x] Selenium
Framework que integra o código Java com a linguagem Gherkin (Cucumber), abrindo um browser e realizando testes de comportamento.

-------------------------
