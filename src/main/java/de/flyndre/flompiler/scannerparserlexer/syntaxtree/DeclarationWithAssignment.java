package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

public class DeclarationWithAssignment extends Statement{
    LocalVarDecl vardecl;
    Assign assignment;

    public Assign getAssignment() {
        return assignment;
    }

    public LocalVarDecl getVardecl() {
        return vardecl;
    }

    public DeclarationWithAssignment(LocalVarDecl vardecl, Assign assignment){
        this.assignment = assignment;
        this.vardecl = vardecl;
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return null;
    }
}
