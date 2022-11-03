# Automation-test
Prueba Hello Build

Para la ejecución de la prueba de automatización se deberán seguir los siguientes pasos:
1) Descargar el programa Katalon
  1.1) Para la descarga del programa será necesario ingresar a la URL https://katalon.com/sign-up?ref=header_signup_btn y realizar un registro con el Nombre, Correo y Contraseña, para de esta manera obtener el .zip de Katalon Studio - Platform Edition
2) Una vez se tiene el archivo .zip "Katalon_Studio_Windows_64-8.5.2" se deberá descomprimir la carpeta
3) Cuando ya se tiene la carpeta se podra acceder al archivo katalon.exe sobre el cual haremos doble clic para iniciar la aplicación
4) Una vez dentro del programa pedirá el correo con el cual se realizo el registro para de esta manera realizar la activación de la licencia premium por un periodo de 30 dias, la cual al vencerse solo se retiran algunas funcionalidades pero las principales se mantendran
5) Posteriormente, en el menú izquierdo se dará clic en la opción Open Project para de esta manera abrir el proyecto "Automation test"
6) Una vez se abra se podra encontrar lo siguiente:
    * Profiles: En esta opción se configuran los diferentes ambientes con las respectivas variables globales sobre las cuales se pueden realizar validaciones en cualquier parte del proceso
    * Test Cases: En esta opción se encontraran los escenarios o casos de prueba que se han configurado con el paso a paso de las acciones que realizaria un usuario final
    * Object Repository: En esta opción de encontraran los objetos como (input, button, div,etc.) que se encuentran en la plataforma a validar y que a su vez se estan utilizando en los casos de prueba
    * Keywords: Aqui se encuentran las clases que tienen la definicion especifica de cada acción nivel de codigo
    * Include / Features: En esta opción se encuentra la definición realizada con Cucumber de las funciones y escenarios a validar
    * Include / scripts: En esta opción se encuentra la definición de pasos relacionada a los escenarios que se encuentren en los "features" y la cual hace uso de los Keywords creados
7) Para realizar la ejecución de la prueba se deberá abrir el archivo que se encuentra en la ruta "Include/features/Consulta Google/Consulta Google.feature" y en la parte superior se encontrará un icono de play con el cual se puede iniciar la ejecución
8) Adicionalmente mientra se realiza la ejecución se encuentra en la parte inferior un panel con diferentes opciones, entre ellas "Console" sobre la cual se podrá evidenciar el paso a paso que se va realizando.
