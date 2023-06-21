package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Block;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Statement;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class BlockAdapter {
    public static Block adapt(MiniJavaParser.BlockContext ctx) throws Exception {

        List<Statement> stats = new ArrayList<>();
        if(ctx.statements() != null){
            stats.addAll(StatementAdapter.adapt(ctx.statements()));
        }
        return new Block(stats);
    }
}
