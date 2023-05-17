---
title: Tests
author: David Maier
date: today
---

# Tests

Einstiegspunkt: [`de.flyndre.flompiler.FlompilerTest`](../src/test/java/de/flyndre/flompiler/FlompilerTest.java)

Alle Tests befinden sich im Ordner `src/test/java/`, während alle Test-Ressourcen und -Outputs in `src/test/resources/` liegen.

## Systemtests

Das Gesamtsystem (die Klasse `Flompiler` bzw. ihre Main-Methode `Flompiler.main`) werden in der Test-Klasse [`de.flyndre.flompiler.FlompilerTest`](../src/test/java/de/flyndre/flompiler/FlompilerTest.java) getestet.
Dafür wird die Main-Methode mit verschiedenen Input-Dateien aus den test-Ressourcen aufgerufen.

## Komponententests

Die drei Komponenten (ScannerParserLexer, TypeChecker und BytecodeGenerator) besitzen jeweils eine Unit-Test-Klasse:

| Komponente                                                                                               | Testklasse                                                                                                       |
|----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|
| [`ScannerParserLexer`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/ScannerParserLexer.java) | [`ScannerParserLexerTest`](../src/test/java/de/flyndre/flompiler/scannerparserlexer/ScannerParserLexerTest.java) |
| [`TypeChecker`](../src/main/java/de/flyndre/flompiler/typecheker/TypeChecker.java)                       | [`TypeCheckerTest`](../src/test/java/de/flyndre/flompiler/typecheker/TypeCheckerTest.java)                       |
| [`BytecodeGenerator`](../src/main/java/de/flyndre/flompiler/bytecodegenerator/BytecodeGenerator.java)    | [`BytecodeGeneratorTest`](../src/test/java/de/flyndre/flompiler/bytecodegenerator/BytecodeGeneratorTest.java)    |
