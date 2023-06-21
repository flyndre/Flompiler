---
title: Tests
author: David Maier
---

# Tests

Einstiegspunkt: [`de.flyndre.flompiler.FlompilerTest`](../src/test/java/de/flyndre/flompiler/FlompilerTest.java)

Alle Tests befinden sich im Ordner `src/test/java/`, während alle Test-Ressourcen und -Outputs in `src/test/resources/` liegen.

## Vorgehen

Alle Tests - sowohl von System als auch einzelner Komponenten - sind nach demselben Schema aufgebaut:
Gestartet wird mit dem Testen der leeren Klasse.
Von dort aus werden nach und nach die einzelnen Features 'hinzugefügt'.

### Systemtests

Das Gesamtsystem (die Klasse `Flompiler` bzw. ihre Main-Methode `Flompiler.main`) werden in der Test-Klasse [`de.flyndre.flompiler.FlompilerTest`](../src/test/java/de/flyndre/flompiler/FlompilerTest.java) getestet.
Dabei starten die Tests mit einem `.java`-File aus dem Ressourcen-Ordner.
Wurde der Quellcode erfolgreich kompiliert, wird die Java-Reflection-API verwendet, um die generierte Klasse zu instanziieren.
So werden dann ihre Methoden und Attribute auf Korrektheit überprüft.

### Komponententests

Die drei Komponenten (ScannerParserLexer, TypeChecker und BytecodeGenerator) besitzen jeweils eine Unit-Test-Klasse:

| Komponente                                                                                               | Testklasse                                                                                                       |
|----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|
| [`ScannerParserLexer`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/ScannerParserLexer.java) | [`ScannerParserLexerTest`](../src/test/java/de/flyndre/flompiler/scannerparserlexer/ScannerParserLexerTest.java) |
| [`TypeChecker`](../src/main/java/de/flyndre/flompiler/typecheker/TypeChecker.java)                       | [`TypeCheckerTest`](../src/test/java/de/flyndre/flompiler/typecheker/TypeCheckerTest.java)                       |
| [`BytecodeGenerator`](../src/main/java/de/flyndre/flompiler/bytecodegenerator/BytecodeGenerator.java)    | [`BytecodeGeneratorTest`](../src/test/java/de/flyndre/flompiler/bytecodegenerator/BytecodeGeneratorTest.java)    |

Tests des `ScannerParserLexer` starten mit einem `.java`-File und überprüfen mithilfe eines erwarteten ungetypten AST das Ergebnis.

Tests des `TypeChecker` starten mit einem vordefinierten ungetypten AST und werden anhand eines erwarteten getypten AST überprüft.

Tests des `BytecodeGenerator` erhalten zu Anfang einen vordefinierten getypten AST und werden mithilfe von Java Reflection auf Korrektheit geprüft.

## Ressourcen

Zum Testen des gesamten Compilers sowie des ScannerParserLexers existieren verschiedene `.java`-Dateien im [Test-Ressourcen-Ordner](../src/test/resources).
Für die Tests des `TypeCheckers` und des `BytecodeGenerators` existieren im Package [test.java.de.flyndre.flompiler.results](../src/test/java/de/flyndre/flompiler/results) die erwarteten bzw. eingegebenen ASTs.

Vom Compiler und `BytecodeGenerator` ausgegebene `.class`-Dateien werden 'neben' ihren `.java`-Quelldateien abgelegt.

## Werkzeuge

Als Werkzeuge dienen die beiden Klassen [`Flassertions`](../src/test/java/de/flyndre/flompiler/testing/Flassertions.java) und [`Fleflection`](../src/test/java/de/flyndre/flompiler/testing/Fleflection.java).
* Erstere kapselt beim Testen häufig genutzte Assertions.
* Letztere kapselt Methoden, die mittels Java-Reflection eine Instanz einer kompilierten Klasse erzeugen.

