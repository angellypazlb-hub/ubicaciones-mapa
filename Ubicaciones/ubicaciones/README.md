# Mapa de Ubicaciones

Aplicación web que permite registrar ubicaciones en un mapa interactivo. 
Los puntos guardados persisten aunque se recargue la página.

## Tecnologías utilizadas

- **Backend:** Spring Boot 3.5.14 (Java 21)
- **Base de datos:** H2 (embebida, persistente en archivo)
- **API:** REST con dos endpoints
- **Frontend:** HTML + JavaScript + Leaflet.js (OpenStreetMap)

## Estructura del proyecto
src/
├── main/
│   ├── java/com/neotropic/ubicaciones/
│   │   ├── Ubicacion.java              # Modelo / entidad de la base de datos
│   │   ├── UbicacionRepository.java    # Acceso a datos (JPA)
│   │   ├── UbicacionController.java    # Endpoints REST
│   │   └── UbicacionesApplication.java # Punto de entrada
│   └── resources/
│       ├── static/index.html           # Frontend (mapa)
│       └── application.properties      # Configuración
## API REST

| Método | Endpoint       | Descripción                        |
|--------|----------------|------------------------------------|
| GET    | /ubicaciones   | Retorna todas las ubicaciones      |
| POST   | /ubicaciones   | Crea una nueva ubicación           |

### Ejemplo POST

```json
{
  "nombre": "Mi ubicación",
  "latitud": 2.4448,
  "longitud": -76.6147
}
```

## Cómo ejecutar

### Requisitos
- Java 21
- Maven 3.9+

### Pasos

1. Clonar o descargar el proyecto
2. Abrir terminal en la carpeta raíz
3. Ejecutar:

```bash
.\mvnw.cmd spring-boot:run
```

4. Abrir en el navegador: `http://localhost:8080`

## Funcionamiento

1. Al cargar la página se consulta `GET /ubicaciones` y se pintan todos los puntos guardados
2. Al hacer click en el mapa aparece un popup pidiendo el nombre de la ubicación
3. Al guardar se llama `POST /ubicaciones` con el nombre y coordenadas
4. Al recargar la página los puntos persisten porque se guardan en base de datos