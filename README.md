# B-squedaBinariaJFrame - Java API + PostgreSQL + Nginx

Infra orientada a backend Java en contenedores con base de datos y reverse proxy.

## Arquitectura

- `java-api`: servicio Java compilado en imagen propia.
- `postgres`: base relacional lista para persistencia.
- `java-nginx`: entrada publica y reverse proxy.

## Levantar

```bash
docker compose up -d --build
```

Probar:

- `http://localhost:8085/health`
- `http://localhost:8085/binary-search`

## Variables

- `NGINX_PORT`
- `POSTGRES_DB`
- `POSTGRES_USER`
- `POSTGRES_PASSWORD`

## Valor para perfil

- Muestra stack Java + DB + edge proxy.
- Base para migrar app Swing a API server-side.

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
