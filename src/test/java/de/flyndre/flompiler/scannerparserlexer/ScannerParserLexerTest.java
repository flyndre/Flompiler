package de.flyndre.flompiler.scannerparserlexer;

import de.flyndre.flompiler.Flassertions;
import de.flyndre.flompiler.TestConstants;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ScannerParserLexerTest {

    /**
     * Parse empty class.
     */
    @Test
    public void testEmptyClass() {
        final var path = TestConstants.RESOURCES_ROOT + "/basic/EmptyClass.java";
        final var result = EmptyClassResults.AST;
        // TODO: Import input file from path
        Program program = ScannerParserLexer.compile("public class EmptyClass { }");
        Flassertions.assertDeeplyAlike(result, program);
    }

    /**
     * Try to parse defective empty class and expect exception.
     */
    @Test
    public void testDefectiveEmptyClass() {
        final var path = TestConstants.RESOURCES_ROOT + "/basic/defective/DefectiveEmptyClass.java";
        // TODO: Import input file from path
        final Executable executable = () -> ScannerParserLexer.compile("public class EmptyClass {");
        Assertions.assertThrows(Exception.class, executable);
    }

}