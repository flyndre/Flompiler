package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.LocalOrFieldVar;

public class UnaryExpressionNotPlusMinusAdapter {
    public static Expression adapt(MiniJavaParser.UnaryexpressionnotplusminusContext unaryexpressionnotplusminus) throws Exception {

        if(unaryexpressionnotplusminus.name().simplename() != null){
            return new LocalOrFieldVar(unaryexpressionnotplusminus.name().simplename().getText());
        }
        else if(unaryexpressionnotplusminus.name().qualifiedname() != null){
            return QualifiedNameAdapter.adapt(unaryexpressionnotplusminus.name().qualifiedname());
        }
        else if(unaryexpressionnotplusminus.primary() != null){
            return PrimaryNoneWArrayAdapter.adapt(unaryexpressionnotplusminus.primary().primarynonewarray());
        }
        throw new Exception();
    }
}
