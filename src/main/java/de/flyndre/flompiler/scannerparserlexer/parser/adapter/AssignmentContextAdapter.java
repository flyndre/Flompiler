package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Assign;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.LocalOrFieldVar;

public class AssignmentContextAdapter {
    public static Assign adapt(MiniJavaParser.AssignmentContext assignment) throws Exception {

        String operator = "";

        if(assignment.assignmentoperator().EQUALS() != null){
            operator = "=";
        }
        else if(assignment.assignmentoperator().DIVIDEEQUAL() != null){
            operator = "/=";
        }
        else if(assignment.assignmentoperator().MINUSEQUAL() != null){
            operator = "-=";
        }
        else if(assignment.assignmentoperator().PLUSEQUAL() != null){
            operator = "+=";
        }
        else if(assignment.assignmentoperator().TIMESEQUAL() != null){
            operator = "*=";
        }

        return new Assign(new LocalOrFieldVar(assignment.NAME().getText()), operator, AssignmentExpressionAdapter.adapt(assignment.assignmentexpression()));
    }
}
