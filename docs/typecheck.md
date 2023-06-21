---
title: Type-Check
author: Lukas Burkhardt
---

# Type-Check

Einstiegspunkt: [`de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/syntaxtree/Program.java)
Durch das Aufrufen der Methode typecheck() eines Programms, wird der AST des Programs zu einem getypten AST. Wichtig dabei ist, dass die Veränderungen direkt an dem übergebenen AST-Objekt durchgeführt werden.

Jede Klasse des AST besitzt die Methode typeCheck() über welche der Typ der Klasse gesetzt wird. Zusätzlich wird der Type als Rückgabewert zurückgegeben. In den Klassen Program und Class wird darauf verzichtet, da sowohl eine Klasse als auch ein Programm keinen Typ besitzen kann, hier wird in der typeCheck() Methode lediglich dafür gesorgt, dass der Typecheck bei allen Bestandteilen der Klassen durchgeführt wird.
Als Typ werden Strings verwendet. Folgende Werte für den Sting gibt es:
- void
- boolean
- char
- int
- String
