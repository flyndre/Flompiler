---
title: Type-Check
author: Lukas Burkhardt
date: today
---

# Type-Check

Einstiegspunkt: [`de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/syntaxtree/Program.java)
Durch das Aufrufen der Methode typecheck() eines Programms, wird der AST des Programs zu einem getypten AST.

Jede Klasse des AST besitzt die Methode typeCheck() über welche der Typ der Klasse gesetzt wird. Zusätzlich wird der Type zurückgegeben.
Als Typ werden Strings verwendet. Folgende Werte für den Sting gibt es:
- void
- boolean
- char
- int
- String
