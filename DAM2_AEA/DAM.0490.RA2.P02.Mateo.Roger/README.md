# CRUD Visites Mèdiques (Spring Boot)

Projecte MVC + REST per gestionar `Visita Mèdica` complint l'enunciat RA3, RA4, RA5.

## Requisits

- Java 21
- Maven 3.9+

## Executar (H2 per defecte)

```bash
mvn spring-boot:run
```

Web:
- `http://localhost:8080/visites`

Consola H2:
- `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:visitesdb`
- Usuari: `sa`
- Password: (buit)

## Canviar de base de dades

### MySQL

1. Crea una BD MySQL disponible a `localhost:3306`.
2. Ajusta usuari/password a `src/main/resources/application-mysql.yml` si cal.
3. Executa:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```

### PostgreSQL

1. Crea una BD PostgreSQL disponible a `localhost:5432`.
2. Ajusta usuari/password a `src/main/resources/application-postgres.yml` si cal.
3. Executa:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=postgres
```

## Endpoints REST (web híbrida)

- `GET /api/visites`
- `GET /api/visites/{id}`
- `POST /api/visites`
- `PUT /api/visites/{id}`
- `DELETE /api/visites/{id}`

Exemple JSON:

```json
{
  "nomPacient": "Anna Serra",
  "nomMetge": "Dr. Ferrer",
  "data": "2026-04-15",
  "diagnostic": "Revisió general sense incidències"
}
```

## Compliment de l'enunciat

- Taula: `VisitesMediques`
- PK autonumèrica: `IdVisita`
- Columnes no null:
  - `Nom_Pacient` (max 40)
  - `Nom_Metge` (max 40)
  - `Data`
  - `Diagnostic` (max 250)
- Patró MVC separat (model/repository/service/controller + vistes Thymeleaf)
