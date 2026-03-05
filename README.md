# Backend Java Containerizado con PostgreSQL y Reverse Proxy

Diseño de servidor para exponer lógica Java como servicio HTTP con persistencia relacional y entrada por Nginx.

## Descripción

Este entorno transforma una base Java tradicional en una arquitectura backend moderna para despliegue Linux.

## ¿Qué hace este proyecto?

- Compila y ejecuta servicio Java dentro de contenedor.
- Integra PostgreSQL para datos de negocio.
- Expone rutas mediante Nginx reverse proxy.
- Establece base para migración de app de escritorio a API.

## Características Principales

| Característica | Descripción |
|---|---|
| Servicio Java | API mínima con endpoints de salud y lógica |
| Base relacional | PostgreSQL listo para persistencia |
| Reverse proxy | Nginx como entrada única |
| Arquitectura modular | Capa web, app y datos separadas |

## Stack Tecnológico

- Java 21
- PostgreSQL 16
- Nginx
- Docker Compose

## Instalación y Uso

### Levantar entorno

```bash
docker compose up -d --build
```

### Probar

- `http://localhost:8085/health`
- `http://localhost:8085/binary-search`

## Variables de Entorno

- `NGINX_PORT`
- `POSTGRES_DB`
- `POSTGRES_USER`
- `POSTGRES_PASSWORD`

## Estructura del Proyecto

```text
.
├── Dockerfile
├── docker-compose.yml
├── .env
├── src/
│   └── Main.java
└── nginx/
    └── default.conf
```

## Casos de Uso

- APIs Java en infraestructura moderna.
- Migración de lógica desktop hacia backend.
- Laboratorio de despliegue Java + DB + Proxy.

---

## ‍ Desarrollado por Isaac Esteban Haro Torres

**Ingeniero en Sistemas · Full Stack · Automatización · Data**

-  Email: zackharo1@gmail.com
-  WhatsApp: 098805517
-  GitHub: https://github.com/ieharo1
-  Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/

---

##  Licencia

© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
