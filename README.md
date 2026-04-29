# Mapa de Ubicaciones

Aplicación web que permite registrar ubicaciones en un mapa interactivo.Al hacer clic sobre un punto del mapa se asigna un nombre a la ubicación y se guarda. Los puntos persisten al recargar la página.

# Tecnologías utilizadas

-**Backend:** Spring Boot 3.5.14 (Java 21)
-**Base de datos:** H2 
-**API: REST** con 2 endpoints
-**Frontend:** HTML + JavaScript + Leaflet.js 

# Endpoints API

-**Método GET- Endpoint (/Ubicaciones) :** Retorna todas las ubicaciones.
-**Método SET-Endpoint (/Ubicaciones) :** Crea una nueva ubicación.


# Cómo ejecutar

# Requisitos
- Java 21
- Maven 3.9+

# Pasos

1. Clonar el repositorio
2. Abrir terminal en la carpeta raíz
3. Ejecutar:
bash
.\mvnw.cmd spring-boot:run

4. Abrir en el navegador: 'http://localhost:8080'

# Funcionamiento

1. Al cargar la página se hace una petición 'GET/Ubicaciones' y se cargan todos los puntos guardados.
2. Al hacer clic en el mapa aparece un popup pidiendo el nombre de la ubicación.
3. Al guardar se envía 'POST/ubicaciones'con el nombre y coordenadas.
4. Al recargar la página los puntos persisten porque se guardan en base de datos en archivo.

-Se uso H2 en archivo para que los datospersistan al recargar la página.
-@CrossOrigin en el controlador para permitir peticiones desde el fronted.
-JpaRepository para evitar escribir SQL manual.
