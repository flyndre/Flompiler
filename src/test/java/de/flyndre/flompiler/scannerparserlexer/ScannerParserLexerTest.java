package de.flyndre.flompiler.scannerparserlexer;

import de.flyndre.flompiler.Flassertions;
import de.flyndre.flompiler.TestConstants;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScannerParserLexerTest {

    /**
     * Parse empty class.
     */
    @Test
    public void testEmptyClass() throws IOException {
        final var path = TestConstants.RESOURCES_ROOT + "/basic/EmptyClass.java";
        final var inputString = Files.readString(Path.of(path));
        final var result = EmptyClassResults.AST;
        Program program = ScannerParserLexer.compile(inputString);
        Flassertions.assertDeeplyAlike(result, program);
    }

    /**
     * Try to parse defective empty class and expect exception.
     */
    @Test
    public void testDefectiveEmptyClass() throws IOException {
        final var path = TestConstants.RESOURCES_ROOT + "/basic/defective/DefectiveEmptyClass.java";
        final var inputString = Files.readString(Path.of(path));
        final Executable executable = () -> ScannerParserLexer.compile(inputString);
        Assertions.assertThrows(Exception.class, executable);
    }

}