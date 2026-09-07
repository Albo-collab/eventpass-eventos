# EventPass - Microservicio de Eventos

Microservicio encargado de la gestión de eventos y control de aforo.

## Funcionalidades
- Listar eventos disponibles
- Consultar aforo disponible
- Actualizar aforo (descontar cupos)
- Crear y administrar eventos

## Tecnologías
- Java + Spring Boot
- Spring Data JPA

## Endpoints principales
- GET /api/eventos
- GET /api/eventos/{id}
- PUT /api/eventos/{id}/aforo
