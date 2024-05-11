# Opdrachtbeschrijving - Methoden

## Inleiding
Je gaat oefenen met het maken van methodes. Eerst zul je dit doen door methodes te maken zonder return value (output) of parameters (input). Daarna ga je aan de slag met het gebruik van parameters en ten slotte schrijf je methodes die zowel parameters als return values hebben.

## Voor je begint
Je hebt IntelliJ IDEA en de JDK (Java Development Kit) versie 17 of hoger nodig - deze heb je beiden via de instructies op EdHub geïnstalleerd.

### 🟩 Code runnen (vanuit IntelliJ)
Klik op de groene play-knop voor de main-methode en kies 'Run...'.

### 🟨 Testen uitvoeren (vanuit IntelliJ)
Klik op de groene play-knop voor de MainTest-class in src/test/java en kies 'Run 'MainTest''.

### ⬛ Code runnen (met Maven)

Of, als je bekend bent met de terminal, kun je de applicatie runnen met:

```shell
./mvnw clean compile exec:java
```

of 

```shell
mvnw.cmd clean compile exec:java
```

## Opdracht
In de map `src/main/java` tref je drie classes aan:
* `A_Monoloog.java`;
* `B_Dialoog.java`;
* `C_Oppervlakte.java`;

De instructies en uitleg over de opdrachtjes, vind je in de classes zelf. Doorloop de opgaves in volgorde (A, B, en C).

Om te valideren dat je klaar bent, kun je de testen draaien. In `src/test/java` vind je een class met de naam MainTest. Deze test alle drie de classes waarin jij methodes geschreven hebt. Links daarvan staat een groen pijltje die je kunt gebruiken om te compileren en te testen. Onderin het scherm komt het resultaat te staan. Zijn niet alle testen groen? Kijk dan goed naar de uitslag van de test om te zien wat er fout gaat. Door aanpassingen te maken in de code, kun je ervoor zorgen dat de testen één voor één slagen!
