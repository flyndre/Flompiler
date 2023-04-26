# Flompiler

Im Rahmen der Vorlesung "Compilerbau" an der DHBW Stuttgart Campus Horb entwickeln wir als Gruppe den minimalen Java-Compiler "Flompiler".

## Gruppenzusammenstellung

| Name            | Benutzername |
|-----------------|--------------|
| Ruben Kraft     | Parser       |
| Lukas Burkhardt | Typ-Check    |
| Paul Lehmann    | Bytecode     |
| David Maier     | Tests        |

## Aufbau des Compilers

Unser Compiler besteht aus drei Teilen:

* Dem `ScannerLexerParser`, der die Input-Datei einliest, sie in Tokens umwandelt und parst.
    So entsteht der ungetypte abstrakte Syntaxbaum.
* Dem `TypeCheck`, der die Semantik der Tokens kontrolliert, woraus der getypte abstrakte Syntaxbaum resultiert.
* Dem `BytecodeGenerator`, der aus dem resultierenden getypten abstrakten Syntaxbaum Bytecode generiert.

Orchestriert wird der Compiler von `Flompiler`, der als Controller fungiert und zwischen den Komponenten vermittelt.
Dieser implementiert eine Main-Methode, die den Pfad zur Input-Datei als erstes Argument erhält.