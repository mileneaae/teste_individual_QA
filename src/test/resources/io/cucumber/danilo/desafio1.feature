#language: pt
Funcionalidade: preenchimento do formulário 1 de vehicle insurance Tricentris
    Este teste visa preencher diversos campos em um formulário com 5 abas diferentes

Cenario: Preenchendo aba Enter Vehicle Data
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
    Entao clico em Next para a aba 2