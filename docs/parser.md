---
title: Scanner-Parser-Lexer
author: Ruben Kraft
---

# Scanner-Parser-Lexer

Einstiegspunkt: [`de.flyndre.flompiler.scannerparserlexer.ScannerParserLexer`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/ScannerParserLexer.java)

## Grammatik
Die verwendete Grammatik kann in der Datei [`MiniJava.g4`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/MiniJava.g4) gefunden werden. Dabei unterstütz die Grammatik folgende Funktionen: 

- Klassen
- Methoden
- Methodenaufrufe
- Lokale Variablen
- Feldvariablen (jedoch nur mit direkter Wertinizialisierung)
- While
- If
- If-Else
- Preincrement- und Predecrement
- Returnstatements
- Mathematische Operationen sowie String- und Charkonkatination


## Ordnerstruktur
- [`de/flyndre/flompiler/scannerparserlexer/parser`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/parser): Standort der generierten ANTLR-Dateien
- [`de/flyndre/flompiler/scannerparserlexer/parser/adapter`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/parser/adapter): Standort der Adapter
## Vorgehensweise
Durch ANTLR wird die Eingabe zuerst in Lexeme eingeteilt. ANTLR baut einen Parse-Baum, der dann abgelaufen werden kann.
Das Ablaufen des Baumes erfolgt durch eigens implementierte Adapter, welche in [`de/flyndre/flompiler/scannerparserlexer/parser/adapter`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/parser/adapter) zu finden sind. Diese arbeiten den von ANTLR angegebenen Parse-Baum rekursiv ab und wandelt diesen in den von uns festgelegten abstakten Syntaxbaum.
Die Adapter überprüfen auf die verschiedenen angewandten Grammatikkontexte. 

## Besonderheiten
- Da unser Syntaxbaum nicht direkt Variableninizialisierung und Deklarierung unterstützt, wird dies in einem Adapter aufgeteilt. Dabei wird die Variable erst deklariert und dann initialisiert. 
- Falls kein Konstruktor definiert wird, erstellt der Parser einen Konstruktor, welcher im Bytecode-Generator verwendet wird.
- Durch die vielen einzelnen Klassen, welche für die Adapter verwendet werden, können Änderungen an der Grammatik leicht umgesetzt werden. 