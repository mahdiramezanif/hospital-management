# Hospital Management — Java OOP Project

An educational **Java 17** console application modeling a hospital's staff, patients, visits, and administrative actions. It is organized around inheritance and object-oriented domain classes.

## Main domain classes
- `Person` / `Personnel` — shared person and employee concepts
- `Doctor`, `Nurse`, `ServiceMen` — staff roles
- `Patient`, `Visit` — patient/visit records
- `Hospital` — hospital-domain operations
- `HospitalMenu` — role-based console menu

The menus include owner actions such as adding/removing medical staff and managing an owner password.

## Tech stack
Java 17, Maven, MySQL JDBC connector (referenced from a local JAR in `lib/`).

## Build and run

```bash
git clone https://github.com/mahdiramezanif/hospital-management.git
cd hospital-management
mvn compile
```

**Important:** The current source references a `Database` class from [`src/main/java/Main.java`](src/main/java/Main.java), but no `Database.java` file is present in the public repository tree. The project therefore needs that implementation (and a configured database connection) before it can compile/run as written.

The Maven configuration also references a local MySQL connector JAR through `systemPath`. For reproducibility, replace this with a normal Maven dependency and test the build.

## Project status
A coursework-style OOP model, **not** medical software and not appropriate for managing real patient data.
