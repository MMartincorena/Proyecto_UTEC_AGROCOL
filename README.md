![LogoLargo](https://user-images.githubusercontent.com/18647088/197530590-f1f0b286-2e8f-469b-a0f4-c5692b988090.png)

Proyecto de mitad de grado de la Licenciatura en Tecnologias 
de la Información impartida por UTEC Universidad Tecnológica del Uruguay.


## Herramientas a descargar

### IDE
<a href="https://www.jetbrains.com/es-es/idea/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" 
alt="Maven" width="40" height="40"/> 
</a>

### Backend     
<div style="display: inline_block">
<a href="https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html/"> 
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" 
alt="logo Java" width="40" height="40"/> 
</a>
<a href="https://maven.apache.org/download.cgi/">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/apache/apache-original.svg" 
alt="logo Maven" width="40" height="40"/> 
</a>
<a href="https://www.oracle.com/database/sqldeveloper/technologies/download/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/oracle/oracle-original.svg" 
alt="logo oracle" width="40" height="40"/> 
</a>
</div>

### Frontend
<div style="display: inline_block">
<a href="/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original-wordmark.svg" 
alt="logo HTML" width="40" height="40"/> 
</a>

<a href=""> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" 
alt="logo Bootstrap" width="40" height="40"/> 
</a>

<a href="https://getbootstrap.com/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-plain.svg"
alt="logo Bootstrap" width="40" height="40"/> 
</a>
</div>

                   
## Tech Stack

**Client:** Java

**Server:** Java

## Dependencias a instalar
 - DevTools
 - JPA
 - Oracle SQL
 - Web
 - Thymeleaf

## Configuración Spring Boot
### Aplication properties
```
#Basic Spring Boot Config for Oracle
spring.datasource.url= jdbc:oracle:thin:@//localhost:1521/xe
spring.datasource.username=AGROCOL
spring.datasource.password=AGROCOL
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
#hibernate config
spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
```
