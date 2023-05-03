package de.flyndre.flompiler.scannerparserlexer;

import de.flyndre.flompiler.Flassertions;
import de.flyndre.flompiler.TestConstants;
import de.flyndre.flompiler.results.attributes.BooleanClassResults;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScannerParserLexerTest {

    private void testSuccess(String path, Program expected) {
        final var inputPath = TestConstants.RESOURCES_ROOT + path;
        final String inputString;
        try {
            inputString = Files.readString(Path.of(inputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final var actual = ScannerParserLexer.compile(inputString);
        Flassertions.assertDeeplyAlike(expected, actual);
    }

    private void testFailure(String path) {
        final var inputPath = TestConstants.RESOURCES_ROOT + path;
        final String inputString;
        try {
            inputString = Files.readString(Path.of(inputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final Executable executable = () -> ScannerParserLexer.compile(inputString);
        Assertions.assertThrows(Exception.class, executable);
    }

    /**
     * Parse empty class.
     */
    @Test
    @DisplayName("ScannerParserLexer: Empty Class")
    public void testEmptyClass() {
        testSuccess("/basic/EmptyClass.java", EmptyClassResults.AST);
    }

    /**
     * Try to parse defective empty class and expect exception.
     */
    @Test
    @DisplayName("ScannerParserLexer: Defective Empty Class")
    public void testDefectiveEmptyClass() {
        testFailure("/basic/defective/DefectiveEmptyClass.java");
    }

    @Test
    public void testAttributeBooleanClass() {
        testSuccess("/attributes/BooleanClass.java", BooleanClassResults.AST);
    }

    /**
     * Try to parse defective empty class and expect exception.
     */
    @Test
    public void testAttributeDefectiveBooleanClass() {
        testFailure("/attributes/defective/DefectiveBooleanClass.java");
    }

}