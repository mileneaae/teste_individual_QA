# Teste individual QA <br>
### Por [Milene Amâncio Alves Eigenheer](https://www.linkedin.com/in/mileneaae)<br>

## Descrição do desafio<br>
Criar uma aplicação Selenium para teste do site http://sampleapp.tricentis.com/101/app.php. Foram elaborados 5 cenários em 5 arquivos de teste.<br>
<br>
### - Caso de teste 1
Preenchimento da aba 1 de vehicle insurance Tricentris<br>
<br>
<b>Cenario</b>: Preenchendo aba Enter Vehicle Data<br>
Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"<br>
E seleciono em Make "Honda"<br>
E seleciono em Model "Scooter"<br>
E digito em Cylinder Capacity "125"<br>
E digito em Engine Performance "20"<br>
E escolho em Date of Manufacture "01/01/2018"<br>
E digito em Number of Seats "1"<br>
E escolho em Right Hand Drive "Yes"<br>
E seleciono em Number of Seats "1"<br>
E seleciono em Fuel Type "Gas"<br>
E digito em Payload "150"<br>
E digito em Total Weight "300"<br>
E digito em List Price "1000"<br>
E digito em License Plate Number "ABC123"<br>
E digito em Annual Mileage "3000"<br>
Entao clico em Next para a aba2<br>

### - Caso de teste 2
Preenchimento da aba 2 de vehicle insurance Tricentris<br>
<br>
<b>Cenario</b>: Preenchendo aba Enter Insurant Data<br>
Dado que continuo no site da Trincentis na aba "Enter Insurant Data"<br>
E digito em First Name "Milene"<br>
E digito em Last Name "Eigenheer"<br>
E escolho em Date of Birth "03/03/1984"<br>
E escolho em Gender "Female"<br>
E digito em Street Adress "Rua Feliz, 111"<br>
E escolho em Contry "Brazil"<br>
E digito em Zip Code "13506000"<br>
E digito em City "Rio Claro"<br>
E seleciono em Occupation "Employee"<br>
E clico em Hobbies em "Other"<br>
E informo em Website "www.github.com/mileneaae"<br>
Entao devo clicar em Next para a aba3<br>

### - Caso de teste 3
Preenchimento da aba 3 de vehicle insurance Tricentris<br>
<br>
<b>Cenario</b>: Preenchendo aba Enter product Data<br>
Dado que ainda continuo no site da Trincentis na aba "Enter Product Data"<br>
E escolho em Start Date "08/31/2021"<br>
E digito em Insurance Sum "100.000,00"<br>
E escolho em Merit Rating "Bonus 1"<br>
E escolho em Damage Insurance "No Coverage"<br>
E escolho em Optional Products "Euro Protection"<br>
E seleciono em Courtesy Car "Yes" <br>
Entao devo clicar em Next para a aba4<br>

### - Caso de teste 4
Preenchimento da aba 4 de vehicle insurance Tricentris<br>
<br>
<b>Cenario</b>: Preenchendo aba Select price option<br>
Dado que permaneco no site da Trincentis na aba "Select Price Option"<br>
E escolho em Select option Plano Gold<br>
Entao devo clicar em Next para a aba5<br>

### - Caso de teste 5
Preenchimento da aba 4 de vehicle insurance Tricentris<br>
<br>
<b>Cenario</b>: Preenchendo aba Send Quota<br>
Dado que eu ainda permaneco no site da Trincentis na aba "Send Quota"<br>
E digito em E-mail "mileneaae@gmail.com"<br>
E digito em Phone "+5519999999999"<br>
E digito em Username "mileneaae"<br>
E digito em Password "milene123"<br>
E digito em Confirm Password "milene123"<br>
E escrevo em Comments "Favor entrar em contato pelo email"<br>
E clico em Send<br>
Entao devo visualizar "Sending e-mail success!"<br>

-------------------------
## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação utilizada para o desenvolvimento da aplicação.<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java.<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework que traduz a linguagem humana dos cenários em códigos Java.<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework que integra o código Java com a linguagem Gherkin (Cucumber), abrindo um browser e realizando testes de comportamento.<br>

-------------------------

## Como rodar a aplicação
## Pré-requisitos<br>
<ul>
<li>Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR</li>
<li>Instalar jdk: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html</li>
<li>Verificar se o JAVA_HOME está configurado em seu computador</li>
</ul>
--------------------------------------
- Clone do projeto:
 ```bash
git clone https://github.com/mileneaae/teste_individual_QA.git
 ```

- Entrando na pasta do projeto
 ```bash
cd desafioQA
 ```

- Configurando selenium em seu computador:<br>
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_win32.zip
unzip chromedriver_win32.zip
rm -rf chromedriver_win32.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

 ----------------------------------
## Agradecimentos
:purple_heart: <b>Accenture</b><br>
:green_heart: <b>Gama, Camila e Bruce</b><br>
:blue_heart: <b>[Professor Danilo](https://github.com/Didox) </b><br>