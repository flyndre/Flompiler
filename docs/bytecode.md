---
title: Bytecode-Generator
author: Paul Lehman
---

# Bytecode-Generator

Einstiegspunkt: [`de.flyndre.flompiler.bytecodegenerator.BytecodeGenerator`](../src/main/java/de/flyndre/flompiler/bytecodegenerator/BytecodeGenerator.java)

Der Einstiegspunkt der Klasse ist die Methode "generateByteCode", welcher der AST übergeben wird.

## Vorgehensweise

Der AST wird rekrusiv von oben nach unten hin abgearbeitet und in ByteCode konvertiert.

Die Methode generateByteCode ruft dabei für jede Klasse die Methoden "generateByteCodeFields", "generateByteCodeForConstructors" und "generateByteCodeForMethods"auf. Weitere Untermethoden
 konvertieren anschließend die Statements und Expressions in Bytecode.

## Statements

Die Methode "generateByteCodeForStatements" konvertiert das übergebene Statement in Bytecode. Dafür wird es über Pattern Matching dem entsprechenden Typ zugeordnet und die 
jeweilige Submethode aufgerufen.

## Expressions

Die Methode "generateByteCodeForExpressions" konvertiert die übergebene Expression in Bytecode. Sie wird von den verschiedenen Statement-Methoden aufgerufen.
Die Vorgehensweise funktioniert gleich wie die von "generateByteCodeForStatements".