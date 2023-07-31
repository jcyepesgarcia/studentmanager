# API Student Manager

Esta es una API REST desarrollada en Spring Boot que permite gestionar operaciones CRUD en una base de datos relacional para almacenar registros de estudiantes.

## Dependencias

Este proyecto utiliza las siguientes dependencias de Spring Boot:
```spring-boot-starter-data-jpa: Para la integración con la capa de acceso a datos.
spring-boot-starter-web: Para construir aplicaciones web.
mysql-connector-j: Driver JDBC para MySQL.
lombok: Para reducir la cantidad de código boilerplate.
spring-boot-starter-test: Para las pruebas unitarias.
```

## Endpoints

La API proporciona los siguientes endpoints para gestionar los registros de estudiantes:
`GET /api/v1/students:` Obtiene la lista de todos los estudiantes.

`GET /api/v1/students/{id}:` Obtiene los detalles de un estudiante por su ID.

`POST /api/v1/students:` Crea un nuevo estudiante.

`PUT /api/v1/students:` Actualiza los datos de un estudiante existente por su ID.

`DELETE /api/v1/students/{id}:` Elimina un estudiante por su ID.

Los datos se deben enviar en formato JSON en el cuerpo de las solicitudes POST y PUT.

## Ejecutar la Aplicación
Sigue estos pasos para instalar y ejecutar el proyecto en tu entorno local:

1. Clona este repositorio:
   ```
   git clone https://github.com/jcyepesgarcia/studentmanager.git
   ```
2. Navega hasta la carpeta del proyecto:
   ```
   cd studentmanager
   ```
3. Configurar la base de datos:
   Asegúrate de tener MySQL instalado y configurado en tu PC. Luego, modifica el archivo `src/main/resources/application.properties` para ajustar la configuración de la base de datos según tus credenciales:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   ```
   Reemplaza `tu_base_de_datos`, `tu_usuario` y `tu_contraseña` con los valores correspondientes para tu base de datos.
4. Inicia la aplicación:
  Para iniciar la aplicación, ejecuta el siguiente comando en la terminal:
   ```
   mvn spring-boot:run
   ```
5. Una vez que la aplicación ha iniciado correctamente, debería estar disponible en ```http://localhost:8080```. Con Postman puedes acceder a los diferentes endpoints mencionados y probar las operaciones CRUD en la base de datos.

## Tutorial de Chris Gámez Profe en YouTube

Este proyecto fue creado siguiendo el tutorial del canal de YouTube "Chris Gámez Profe", el cual proporcionó instrucciones paso a paso para construir la API REST. Puedes encontrar el tutorial [aquí](https://www.youtube.com/watch?v=9XoaU5IMkRY).

Agradezco a Chris Gámez por compartir su conocimiento y permitirme aprender y practicar a través de este proyecto.



