![Flompiler Logo](docs/flompiler.png)

# Flompiler

Im Rahmen der Vorlesung "Compilerbau" an der DHBW Stuttgart Campus Horb entwickeln wir als Gruppe den minimalen Java-Compiler "Flompiler".

## Gruppenzusammenstellung

| Name            | Aufgabenbereich | Benutzername | Dokumentation                   |
|-----------------|-----------------|--------------|---------------------------------|
| Ruben Kraft     | Parser          | Pereki       | [Parser](docs/parser.md)        |
| Lukas Burkhardt | Typ-Check       | L4kiLuk      | [Type-check](docs/typecheck.md) |
| Paul Lehmann    | Bytecode        | NoName11234  | [Bytecode](docs/bytecode.md)    |
| David Maier     | Tests           | dasdawidt    | [Tests](docs/tests.md)          |

## Aufbau des Compilers

Unser Compiler besteht aus drei Teilen:

* Dem [`ScannerParserLexer`](src/main/java/de/flyndre/flompiler/scannerparserlexer/ScannerParserLexer.java), der die Input-Datei einliest, sie in Tokens umwandelt und parst.
    So entsteht der ungetypte abstrakte Syntaxbaum.
* Dem [`TypeChecker`](src/main/java/de/flyndre/flompiler/typecheker/TypeChecker.java), der die Semantik der Tokens kontrolliert, woraus der getypte abstrakte Syntaxbaum resultiert.
* Dem [`BytecodeGenerator`](src/main/java/de/flyndre/flompiler/bytecodegenerator/BytecodeGenerator.java), der aus dem resultierenden getypten abstrakten Syntaxbaum Bytecode generiert.

Orchestriert wird der Compiler von [`Flompiler`](src/main/java/de/flyndre/flompiler/Flompiler.java), der als Controller fungiert und zwischen den Komponenten vermittelt.
Dieser implementiert eine Main-Methode, die den Pfad zur Input-Datei als erstes Argument erhält.