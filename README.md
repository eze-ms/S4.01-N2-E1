# 🏗️ Exercici 2 - Spring Boot amb Gradle

## 📄 Descripció - Enunciat de l'exercici
Aquest exercici introdueix a **Spring Boot** fent servir **Gradle** com a gestor de dependències.  
L'objectiu és replicar el nivell anterior amb una API REST similar, però fent servir Gradle en lloc de Maven.

---

## 💻 Tecnologies Utilitzades
- Java 23
- Spring Boot 3.4.3
- Gradle
- Spring Web
- Spring Boot DevTools
- IntelliJ IDEA / Eclipse
- Postman (per a proves)

---

## 📋 Requisits
- Instal·lar **Java 23**
- Instal·lar **Maven** (`mvn -v` per a comprovar)
- IDE compatible (IntelliJ IDEA, Eclipse)
- Connexió a Internet per descarregar dependències

---

## 🛠️ Instal·lació
1. **Clonar el repositori:**
   ```sh
   git clone https://github.com/eze-ms/S4.01-N1-E2

2. **Compilar el projecte:**
    ```sh
    ./gradlew build
   
3. **Configuració del port:**
- Editar src/main/resources/application.properties
- Afegir:
  ```sh
    server.port=9001
---
## ▶️ Execució
**Executar l'aplicació amb Maven:**
```sh
./gradlew bootRun
```
**Obrir el navegador i provar els endpoints:**
- http://localhost:9001/HelloWorld
- http://localhost:9001/HelloWorld2
- http://localhost:9001/HelloWorld?name=Ezequiel
- http://localhost:9001/HelloWorld2/Ezequiel

**Provar el Maneig d'Errors (CustomException)**
- http://localhost:9001/HelloWorld?name=error
- http://localhost:9001/HelloWorld2/error

## 🌐 Desplegament
1. **Generar el .jar:**
```sh
./gradlew assemble
```
2. **Executar el .jar manualment:**
```sh
java -jar build/libs/S04T01N02-0.0.1-SNAPSHOT.jar
```
---
© 2025. Proyecto desarrollado por Ezequiel Macchi Seoane
   


