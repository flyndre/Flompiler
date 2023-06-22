---
title: Type-Check
author: Lukas Burkhardt
---

# Type-Check

Einstiegspunkt: [`de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program`](../src/main/java/de/flyndre/flompiler/scannerparserlexer/syntaxtree/Program.java)
Durch das Aufrufen der Methode typecheck(List<Field>, List<Parameter>) eines Programms, wird der AST des Programs zu einem getypten AST. Wichtig dabei ist, dass die Veränderungen direkt an dem übergebenen AST-Objekt durchgeführt werden.

Jede Klasse des AST besitzt die Methode typeCheck() über welche der Typ der Klasse gesetzt wird. Zusätzlich wird der Type als Rückgabewert zurückgegeben. In den Klassen Program und Class wird darauf verzichtet, da sowohl eine Klasse als auch ein Programm keinen Typ besitzen kann, hier wird in der typeCheck() Methode lediglich dafür gesorgt, dass der Typecheck bei allen Bestandteilen der Klassen durchgeführt wird.
Als Typ werden Strings verwendet. Folgende Werte für den Sting gibt es:
- void
- boolean
- char
- int
- String

Die Methode besitzt zwei Übergabeparameter fields: List<Field> und parameters: List<Parameter> welche dazu genutzt werde, die Klassenattribute und lokalen Attribute innerhalb eines Blockes weiterzureichen. 
Damit wird ermöglicht, dass der Typecheck den Typ einer Referenz bestimmen kann, welche vor dem Aufruf deklariert wurde.

``` java
public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception  {

        fields.forEach(field -> {
            if(field.name.equals(this.name)){
                this.type = field.type;
            }
        });

        parameters.forEach(param -> {
            if (param.name.equals(this.name)){
                this.type =  param.type;
            }
        });
        if(this.type !=null){
            return type;
        }
        throw new Exception(String.format("For the field or parameter %s was no type found.",this.name));
    }
```
In diesem Beispiel aus der Klasse [LocalOrFieldVar.java](../src/main/java/de/flyndre/flompiler/scannerparserlexer/syntaxtree/LocalOrFieldVar.java) ist zu erkennen wie zuerst die ``fields`` durchsucht werden und danach von den lokalen ``parameters`` überschrieben werden kann. So wird versucht den Typ der Variablen anhand ihres Namens zu bestimmen.
Damit dies funktioniert muss im typeCheck() der Klasse [Class](../src/main/java/de/flyndre/flompiler/scannerparserlexer/syntaxtree/Class.java) alle Klassenvariablen der Methode ``typeCheck()`` als ``fields`` übergeben werden. Für den Übergabeparameter `` parameters`` wird eine neue leere Liste übergeben.
``` java
public void typeCheck() throws Exception {
        for(Method method:methods){
            method.typeCheck(fields,new ArrayList<>());
        }
    }
```
Zusätzlich wird bei jedem Typecheck in der Klasse [LocalVarDecl](../src/main/java/de/flyndre/flompiler/scannerparserlexer/syntaxtree/LocalVarDecl.java) der ``parameters`` Liste hinzugefügt um im späteren Verlauf dort verfügbar zu sein.
``` java
public String typeCheck(List<Field> fields, List<Parameter> parameters)  {
        parameters.add(new Parameter(this.name,this.type));
        return type;
    }
```