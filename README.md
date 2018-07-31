# Ejercicio Integración PSE - PlaceToPay

### Consigna

Se requiere desarrollar una conexión con el WebServices de PSE descrito en
el archivo anexo. Esta conexión debe permitir realizar un proceso de pago básico.
Mediante un formulario suministrar los datos necesarios para solicitar un
pago(revisar parámetros de entrada del servicio).Mantener un registro de la
respuesta del webservice, determinando su estado. Listar cada intento de pago y su
estado.

### Extras/Plus

* Se creo tarea programada que se ejecuta cada minuto y consulta a PSE el estado de los pagos en estado PENDIENTE para actualizar cuando este estado cambie.
* Se realizan controles y validaciones
* Se realiza cliente independiente (artefacto) para consumir PlaceToPay - PSE
* Se crea el proyecto como un micro-servicio
* Se utilizo h2-database como base de datos provisional


### Requisitos Técnicos
Java JDK 8 y Maven 3 son necesarios

### Configuración
Se deben modificar los valores del archivo `p2p-pse-example/src/main/resources/application.properties` por los datos de prueba.  
`co.pipecode.p2p.keys.tranKey = TranKey`   
`co.pipecode.p2p.keys.login = Login`

### Compilación
`cd p2p-pse-client/ && mvn clean install -U`  
`cd p2p-pse-example/ && mvn clean install -U`

### Ejecución
`java -jar p2p-pse-example/target/p2p-example-0.0.1-SNAPSHOT &`

### Acceso Demo app
(http://localhost:8080/)

### Información Adicional
* URL Acceso a consola de h2-database
(http://localhost:8080/h2-console/)
* DB h2-database
`jdbc:h2:mem:testdb`

### Autor
[Luis Felipe Castro Ospina](https://www.linkedin.com/in/felipecode/)
